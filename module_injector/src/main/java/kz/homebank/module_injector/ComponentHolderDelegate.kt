package kz.homebank.module_injector

import java.lang.ref.WeakReference

class ComponentHolderDelegate<A : BaseApi, D : BaseDependencies, C : A>(
    private val componentFactory: (D) -> C
) : ComponentHolder<A, D> {

    override var dependencyProvider: (() -> D)? = null

    private var componentWeakRef: WeakReference<C>? = null

    fun getComponentImpl(): C {
        var component: C? = componentWeakRef?.get()
        if (component == null) {
            synchronized(this) {
                dependencyProvider?.let { dependencyProvider ->
                    component = componentWeakRef?.get()
                    if (component == null) {
                        component = componentFactory(dependencyProvider())
                        componentWeakRef = WeakReference(component)
                    }
                } ?: throw IllegalStateException("dependencyProvider for component with factory $componentFactory is not initialized")
            }
        }

        return component ?: throw IllegalStateException("Component holder with component factory $componentFactory is not initialized")
    }

    override fun get(): A {
        return getComponentImpl()
    }
}
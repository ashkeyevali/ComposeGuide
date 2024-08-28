package kz.homebank.module_injector

class SingletonComponentHolderDelegate<A : BaseApi, D : BaseDependencies, C : A>(
    private val componentFactory: (D) -> C
) : ComponentHolder<A, D> {

    override var dependencyProvider: (() -> D)? = null

    private var component: C? = null

    fun getComponentImpl(): C {
        var componentLocal: C? = component
        if (componentLocal == null) {
            synchronized(this) {
                dependencyProvider?.let { dependencyProvider ->
                    componentLocal = this.component
                    if (componentLocal == null) {
                        componentLocal = componentFactory(dependencyProvider())
                        this.component = componentLocal
                    }
                } ?: throw IllegalStateException("dependencyProvider for component with factory $componentFactory is not initialized")
            }
        }

        return componentLocal ?: throw IllegalStateException("Component holder with component factory $componentFactory is not initialized")
    }

    override fun get(): A {
        return getComponentImpl()
    }
}
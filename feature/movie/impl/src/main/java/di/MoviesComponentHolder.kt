package di

import kz.homebank.feature.movie.api.MoviesApi
import kz.homebank.module_injector.BaseApi
import kz.homebank.module_injector.ComponentHolder
import kz.homebank.module_injector.SingletonComponentHolderDelegate

object MoviesComponentHolder: ComponentHolder<MoviesApi, MoviesDependencies> {
    private val componentHolderDelegate = SingletonComponentHolderDelegate<
            MoviesApi, MoviesDependencies, MoviesComponent> {
        MoviesComponent.initAndGet(it)
    }

    override var dependencyProvider: (() -> MoviesDependencies)?
            by componentHolderDelegate:: dependencyProvider

    override fun get(): MoviesApi {
        return getComponent()
    }

    internal fun getComponent(): MoviesComponent {
        return componentHolderDelegate.getComponentImpl()
    }

}
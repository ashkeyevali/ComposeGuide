package kz.homebank.module_injector

interface BaseDependencies {
    val dependencyHolder: BaseDependencyHolder<out BaseDependencies>
}

interface BaseApi

interface ComponentHolder<A : BaseApi, D : BaseDependencies> {
    var dependencyProvider: (() -> D)?
    fun get(): A
}
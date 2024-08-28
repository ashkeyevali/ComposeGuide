package kz.homebank.di

import javax.inject.Scope

// todo remove and replace with @Singleton after kz.beemobile.homebank.di.component.AppComponent removed
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope
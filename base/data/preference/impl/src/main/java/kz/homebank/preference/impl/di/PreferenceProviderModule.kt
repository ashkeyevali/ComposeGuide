package kz.homebank.preference.impl.di

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
internal object PreferenceProviderModule {
    @Provides
    fun provideSharedPreference(context: Context) =
        context.getSharedPreferences("kz.halyk.homebank", Context.MODE_PRIVATE)
}
package com.example.composeguide

import android.app.Application
import kz.beemobile.homebank.di.app.Binder


class HomebankApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Binder.bindAllModules(this)
    }
}
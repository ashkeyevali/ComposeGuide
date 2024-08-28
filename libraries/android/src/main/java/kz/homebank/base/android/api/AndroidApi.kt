package kz.homebank.base.android.api

import android.content.Context
import kz.homebank.module_injector.BaseApi

interface AndroidApi : BaseApi {
    val context: Context
}
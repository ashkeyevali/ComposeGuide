package com.example.composeguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import kz.homebank.libraries.resources.AppTheme
import kz.homebank.libraries.resources.Theme

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            AppTheme {
                val navController = rememberNavController()
                AppNavHost(navController)

            }
        }

    }
}
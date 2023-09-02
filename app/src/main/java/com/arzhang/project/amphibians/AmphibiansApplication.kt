package com.arzhang.project.amphibians

import android.app.Application
import com.arzhang.project.amphibians.data.AppContainer
import com.arzhang.project.amphibians.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
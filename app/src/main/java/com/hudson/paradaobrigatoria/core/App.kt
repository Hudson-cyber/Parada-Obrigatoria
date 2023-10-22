package com.hudson.paradaobrigatoria.core

import android.app.Application
import com.hudson.paradaobrigatoria.di.appModule
import com.hudson.paradaobrigatoria.di.databaseModule
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(appModule, databaseModule))
        }
    }
}
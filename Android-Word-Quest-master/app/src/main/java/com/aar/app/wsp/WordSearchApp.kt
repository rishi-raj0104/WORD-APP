package com.aar.app.wsp

import android.app.Application
import com.aar.app.wsp.di.component.AppComponent
import com.aar.app.wsp.di.component.DaggerAppComponent
import com.aar.app.wsp.di.modules.AppModule

class WordSearchApp : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

}
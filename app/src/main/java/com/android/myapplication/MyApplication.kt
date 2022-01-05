package com.android.myapplication

import android.app.AppComponentFactory
import android.app.Application
import android.content.Context
import com.android.myapplication.dagger.component.AppComponent
import com.android.myapplication.dagger.component.DaggerAppComponent
import com.android.myapplication.dagger.module.AppModule
import com.android.myapplication.dagger.module.NetworkModule


class MyApplication : Application() {
    lateinit var appComponent:AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

    fun getNetworkComponent():AppComponent{
        return appComponent
    }
}

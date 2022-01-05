package com.android.myapplication.dagger.component

import com.android.myapplication.MainActivity
import com.android.myapplication.dagger.module.AppModule
import com.android.myapplication.dagger.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}
package com.android.myapplication.dagger.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
val application:Application

constructor(mApplication:Application){
    this.application = mApplication
}
    @Provides
    @Singleton
    fun provideApplication():Application{
        return this.application
    }

}
package com.android.myapplication.dagger.module

import com.android.myapplication.BuildConfig
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class NetworkModule {

//    var baseURl:String
//    constructor(baseurl:String){
//        baseURl = baseurl
//    }
    @Singleton
    @Provides
    fun provideGson():Gson{
        val gsonBuilder = GsonBuilder()
        return gsonBuilder.create()
    }
    @Singleton
    @Provides
    fun provideRetrofit(gson:Gson):Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(BuildConfig.BASE_URL)
            .build()
    }
}
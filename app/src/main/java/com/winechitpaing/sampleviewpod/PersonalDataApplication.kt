package com.winechitpaing.sampleviewpod

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PersonalDataApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@PersonalDataApplication)
            modules(
                listOf(
                    personalDataModule
                )
            )
        }
    }
}
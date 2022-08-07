package com.example.mycleanarcitechture

import android.app.Application
import com.example.mycleanarcitechture.data.diOnLayerData.KoinModule
import com.example.mycleanarcitechture.presentation.KModul
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

open class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            modules(
                listOf(
                    KoinModule,
                    KModul
                )
            )
        }
    }
}
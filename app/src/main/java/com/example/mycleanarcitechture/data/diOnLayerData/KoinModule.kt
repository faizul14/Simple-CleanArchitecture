package com.example.mycleanarcitechture.data.diOnLayerData

import com.example.mycleanarcitechture.data.DataSource
import com.example.mycleanarcitechture.data.IDataSource
import com.example.mycleanarcitechture.data.NamaRepository
import com.example.mycleanarcitechture.domain.INamaRepository
import org.koin.dsl.module

val KoinModule = module {
    factory <IDataSource> {
        DataSource()
    }

    factory<INamaRepository> {
        NamaRepository(get())
    }
}
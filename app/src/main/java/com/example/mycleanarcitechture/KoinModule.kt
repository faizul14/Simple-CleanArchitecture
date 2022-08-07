package com.example.mycleanarcitechture

import com.example.mycleanarcitechture.data.DataSource
import com.example.mycleanarcitechture.data.IDataSource
import com.example.mycleanarcitechture.data.NamaRepository
import com.example.mycleanarcitechture.domain.INamaRepository
import com.example.mycleanarcitechture.domain.NameInteractor
import com.example.mycleanarcitechture.domain.NameUseCase
import com.example.mycleanarcitechture.presentation.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val KoinModule = module {
    factory <IDataSource> {
        DataSource()
    }

    factory<INamaRepository> {
        NamaRepository(get())
    }

    single<NameUseCase> {
        NameInteractor(get())
    }

}

//val Kmodul = module {
//
//    viewModel {MainViewModel(get()) }
//}
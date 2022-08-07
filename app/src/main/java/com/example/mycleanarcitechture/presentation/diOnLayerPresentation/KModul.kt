package com.example.mycleanarcitechture.presentation

import com.example.mycleanarcitechture.domain.NameInteractor
import com.example.mycleanarcitechture.domain.NameUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val KModul = module {
    single <NameUseCase> {
        NameInteractor(get())
    }

    viewModel {
        MainViewModel(get())
    }
}
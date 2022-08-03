package com.example.mycleanarcitechture.di

import com.example.mycleanarcitechture.data.DataSource
import com.example.mycleanarcitechture.data.IDataSource
import com.example.mycleanarcitechture.data.NamaRepository
import com.example.mycleanarcitechture.domain.INamaRepository
import com.example.mycleanarcitechture.domain.NameInteractor
import com.example.mycleanarcitechture.domain.NameUseCase

object Injection {
    fun provideUser() : NameUseCase {
        val nameRepository = provideRepository()
        return NameInteractor(nameRepository)
    }

    private fun provideRepository() : INamaRepository{
        val nameDataSource = provideDataSource()
        return NamaRepository(nameDataSource)
    }

    private fun provideDataSource() : IDataSource{
        return DataSource()
    }
}
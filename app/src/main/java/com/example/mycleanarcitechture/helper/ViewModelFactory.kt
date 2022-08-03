package com.example.mycleanarcitechture.helper

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mycleanarcitechture.di.Injection
import com.example.mycleanarcitechture.domain.NameUseCase
import com.example.mycleanarcitechture.presentation.MainViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val nameUseCase: NameUseCase) : ViewModelProvider.NewInstanceFactory() {
    companion object{
        @Volatile
        private var INSTANCE : ViewModelFactory? = null


        fun getInstance() : ViewModelFactory =
            INSTANCE ?: synchronized(this){
                INSTANCE ?: ViewModelFactory(Injection.provideUser())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(nameUseCase) as T
        }

        throw IllegalArgumentException("Unknow View Model" + modelClass.name)
    }
}
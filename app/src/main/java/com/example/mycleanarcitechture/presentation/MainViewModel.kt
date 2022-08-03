package com.example.mycleanarcitechture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mycleanarcitechture.domain.NameEntity
import com.example.mycleanarcitechture.domain.NameUseCase

class MainViewModel(private val nameUseCase: NameUseCase) : ViewModel() {
    private val _nama = MutableLiveData<NameEntity>()
    val nama : LiveData<NameEntity> = _nama

    fun setName(name: String){
        _nama.value = nameUseCase.getIdentitasName(name)
    }
}
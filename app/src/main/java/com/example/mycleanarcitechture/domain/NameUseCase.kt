package com.example.mycleanarcitechture.domain

interface NameUseCase {
    fun getIdentitasName(name : String) : NameEntity
}
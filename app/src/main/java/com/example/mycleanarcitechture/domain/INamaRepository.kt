package com.example.mycleanarcitechture.domain

interface INamaRepository {
    fun getName(name : String) : NameEntity
}
package com.example.mycleanarcitechture.data

import com.example.mycleanarcitechture.domain.NameEntity

interface IDataSource {
    fun getData(name: String) : NameEntity
}
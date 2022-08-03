package com.example.mycleanarcitechture.data

import com.example.mycleanarcitechture.domain.NameEntity

class DataSource : IDataSource {
    override fun getData(name: String): NameEntity {
        return NameEntity(
            "Hallo! selamat datang $name"
        )
    }
}
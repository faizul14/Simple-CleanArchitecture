package com.example.mycleanarcitechture.data

import com.example.mycleanarcitechture.domain.INamaRepository
import com.example.mycleanarcitechture.domain.NameEntity

class NamaRepository(private val namaDataSource: IDataSource) : INamaRepository {
    override fun getName(name: String): NameEntity {
        return namaDataSource.getData(name)
    }
}
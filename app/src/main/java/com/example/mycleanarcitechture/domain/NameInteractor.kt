package com.example.mycleanarcitechture.domain

class NameInteractor(private val nameRepository: INamaRepository) : NameUseCase {
    override fun getIdentitasName(name: String): NameEntity {
        return nameRepository.getName(name)
    }
}
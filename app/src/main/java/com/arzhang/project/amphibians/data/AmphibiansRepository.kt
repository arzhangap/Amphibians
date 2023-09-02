package com.arzhang.project.amphibians.data

import com.arzhang.project.amphibians.model.Amphibian
import com.arzhang.project.amphibians.network.AmphibiansApiService

interface AmphibiansRepository {
    suspend fun getAmphibian(): List<Amphibian>
}

class NetworkAmphibiansRepository(
    private val marsApiService: AmphibiansApiService
) : AmphibiansRepository {
    override suspend fun getAmphibian(): List<Amphibian> = marsApiService.getAmphibianData()
}
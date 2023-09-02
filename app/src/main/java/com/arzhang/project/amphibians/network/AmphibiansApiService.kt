package com.arzhang.project.amphibians.network

import com.arzhang.project.amphibians.model.Amphibian
import retrofit2.http.GET

interface AmphibiansApiService {
    @GET("amphibians")
    suspend fun getAmphibianData() : List<Amphibian>
}
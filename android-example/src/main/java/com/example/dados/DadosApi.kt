package com.example.dados

import retrofit2.Call
import retrofit2.http.GET

interface DadosApi {
    @GET("Ara20066/dados/main/dados.json")
    fun getDados(): Call<Dados>
}

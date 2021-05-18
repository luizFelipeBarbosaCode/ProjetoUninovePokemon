package com.example.projetouninovepokemon.ui.pokemon.data.datasource

import com.example.projetouninovepokemon.ui.pokemon.data.model.PokemonResposta
import retrofit2.Response
import retrofit2.http.GET

interface  IPokemonApiService
{
    @GET("pokemon/?limit=1117")
    suspend  fun obterListaPokemon(): Response<PokemonResposta>
}
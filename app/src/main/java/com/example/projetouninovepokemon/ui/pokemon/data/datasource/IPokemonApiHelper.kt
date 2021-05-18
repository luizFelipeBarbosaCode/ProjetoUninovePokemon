package com.example.projetouninovepokemon.ui.pokemon.data.datasource
import com.example.projetouninovepokemon.ui.pokemon.data.model.PokemonResposta
import retrofit2.Response

interface IPokemonApiHelper {

    suspend fun getPokemon(): Response<PokemonResposta>


}
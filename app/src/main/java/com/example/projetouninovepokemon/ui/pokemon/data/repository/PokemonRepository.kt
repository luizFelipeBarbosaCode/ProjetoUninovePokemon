package com.example.projetouninovepokemon.ui.pokemon.data.repository

import com.example.projetouninovepokemon.ui.pokemon.data.datasource.IPokemonApiHelper
import com.example.projetouninovepokemon.ui.pokemon.data.model.Pokemon
import com.example.projetouninovepokemon.ui.pokemondetail.data.db.IPokemonDetailsDaoHelper
import javax.inject.Inject

class PokemonRepository  @Inject constructor(val pokemonDetailDaoHelper: IPokemonDetailsDaoHelper,val pokemonApiHelper : IPokemonApiHelper)

{
    suspend fun listaPokemon() = pokemonApiHelper.getPokemon()

    suspend fun upsert(pokemon: Pokemon) =
        pokemonDetailDaoHelper.upsert(pokemon)

    fun getSavesPokemon() = pokemonDetailDaoHelper.getAllPokemon()

    suspend fun deletePokemon(pokemon: Pokemon) =
        pokemonDetailDaoHelper.deletePokemon(pokemon)
}
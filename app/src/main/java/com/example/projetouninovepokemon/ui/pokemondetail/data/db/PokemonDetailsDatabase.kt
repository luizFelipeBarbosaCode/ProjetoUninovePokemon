package com.example.projetouninovepokemon.ui.pokemondetail.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.projetouninovepokemon.ui.pokemon.data.model.Pokemon

@Database(
    entities = [Pokemon::class],
    version = 1
)

@TypeConverters(Converters::class)
abstract class PokemonDetailsDatabase : RoomDatabase(){

    abstract fun getPokemonDetailsDao() : PokemonDetailDao

}
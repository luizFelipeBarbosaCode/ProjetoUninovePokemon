package com.example.projetouninovepokemon.ui.pokemondetail.data.db

import androidx.room.TypeConverter
import com.example.projetouninovepokemon.ui.pokemondetail.data.model.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }

}
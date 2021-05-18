package com.example.projetouninovepokemon.ui.pokemon.data.model

import android.view.View
import android.widget.TextView
import com.example.projetouninovepokemon.R
import com.example.projetouninovepokemon.ui.BaseCell

class PokemonCell(view: View): BaseCell(view)
{
    companion object{
        const val resID = R.layout.item_pokemon
    }

    private var namePokemonTextView: TextView = view.findViewById(R.id.item_pokemon_txt_name)

    fun set(namePokemon: String){
        namePokemonTextView.text = namePokemon
    }
}
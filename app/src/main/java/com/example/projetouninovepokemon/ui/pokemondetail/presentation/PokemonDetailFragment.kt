package com.example.projetouninovepokemon.ui.pokemondetail.presentation

import android.os.Bundle
import androidx.navigation.fragment.navArgs
import coil.load
import com.example.projetouninovepokemon.R
import com.example.projetouninovepokemon.core.utils.Constrants
import com.example.projetouninovepokemon.ui.BaseFragment
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.pokemon_detail_fragment.*

class PokemonDetailFragment  : BaseFragment(R.layout.pokemon_detail_fragment)
{

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val args: PokemonDetailFragmentArgs by navArgs()
        val pokemon = args.pokemon

        val urlCortada = pokemon.url.substring(34, pokemon.url.length - 1)
        val images = "${Constrants.URL_IMG}$urlCortada.png"

        pokemon_detail_fragment_img.load(images) {
            crossfade(true)
            crossfade(500)
        }

        pokemon_detail_fragment_txt_name.text = pokemon.name.toUpperCase()

        fab.setOnClickListener {
         //   pokemon.image = images
            viewModel.savePokemon(pokemon)
            view?.let { it1 -> Snackbar.make(it1, "Pokemon salvo com sucesso", Snackbar.LENGTH_SHORT).show() }
        }
    }

}
package com.example.projetouninovepokemon.core.extension

import android.view.View

fun View.toggleVisibility(status: Boolean) {
    if (status)
        this.visibility = View.VISIBLE
    else
        this.visibility = View.GONE
}
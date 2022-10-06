package com.example.example.animal

import android.util.Log

class TV: Devise() {
    val someVariable = 5

    override fun showFilm(filmName: String) {
        Log.d("We watch film: ", name)
        super.showFilm(name)
    }
}
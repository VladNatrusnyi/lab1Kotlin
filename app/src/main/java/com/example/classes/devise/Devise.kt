package com.example.example.animal

import android.util.Log

open class Devise() : InterfaceDevise {

    val arrayOfDevises = arrayOf("Phone", "TV", "Computer")

    override fun turnOn(name: String) {
        Log.d("Started devise", name)
    }

    override fun turnOfAllDevises(name: String) {
        var counter = 0
        while (counter < arrayOfDevises.size) {
            if (arrayOfDevises[counter] == name) {
                Log.d(name, " -closed")
            }
            ++counter
        }
    }
}
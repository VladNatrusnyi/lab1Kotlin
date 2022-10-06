package com.example.example.animal

import android.util.Log

class Phone : Devise() {
    private val type = "mobile"

    override fun call(name: String) {
        val devise = Devise()
        devise.turnOn()
        Log.d("call to: ", name)
        super.call(name)
    }


}
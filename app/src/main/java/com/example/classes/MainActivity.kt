package com.example.example

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.example.animal.Dog
import com.example.example.animal.Elephant
import com.example.example.animal.Makaka

class MainActivity : AppCompatActivity() {


    private lateinit var makakaArray: Array<Button>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click()
    }


    private fun click() {
        dogArray.first().setOnClickListener {
            val instrument = turnOn()
            instrument.turnOn("SAMSUNG")
        }
    }
}
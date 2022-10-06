package com.example.example.animal

import android.util.Log

class Computer: Devise() {
    override fun workWithDocuments(documentName: String) {
        Log.d("Working with document: ", documentName)
        super.workWithDocuments(name)
    }
}
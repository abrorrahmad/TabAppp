package com.abrorrahmad.tabapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btntekan : Button = findViewById(R.id.btn_tekan)
        btntekan.setOnClickListener { texttab() }


    }
    private fun texttab(){

        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.text_tab)
        resultText.text = randomInt.toString()
    }
}
package com.example.partyplanner2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Opretbegivenhed1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opretbegivenhed1)



        val startbutton = findViewById<Button>(R.id.Opretbegivenhed1button)
        startbutton.setOnClickListener {
            val intent = Intent(this, Opretbegivenhed2::class.java)
            startActivity(intent)
}


    }
}
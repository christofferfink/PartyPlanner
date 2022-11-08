package com.example.partyplanner2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Opretbegivenhed2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opretbegivenhed2)

        val startbutton = findViewById<Button>(R.id.Opretbegivenhed2button)
        startbutton.setOnClickListener {
            val intent = Intent(this, Opretbegivenhed3::class.java)
            startActivity(intent)
        }



    }
}
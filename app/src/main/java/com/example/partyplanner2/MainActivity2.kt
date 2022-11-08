package com.example.partyplanner2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val opretbegivenhedbutton = findViewById<Button>(R.id.opretbegivenhedbutton)
        opretbegivenhedbutton.setOnClickListener {
            val intent = Intent(this, Opretbegivenhed1::class.java)
            startActivity(intent)
        }

        val minprofilbutton = findViewById<Button>(R.id.minprofilbutton)
        minprofilbutton.setOnClickListener {
            val intent = Intent(this, MinProfil1::class.java)
            startActivity(intent)
        }

        val kommendebegivenhederbutton = findViewById<Button>(R.id.sebegivenheder)
        kommendebegivenhederbutton.setOnClickListener {
            val intent = Intent(this, KommendeBegivenheder::class.java)
            startActivity(intent)
        }

    }
}
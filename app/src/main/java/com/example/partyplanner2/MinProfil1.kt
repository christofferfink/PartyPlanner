package com.example.partyplanner2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MinProfil1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_min_profil1)

        val startbutton = findViewById<Button>(R.id.sedinetidligereeventsbutton)
        startbutton.setOnClickListener {
            val intent = Intent(this, MinProfil2::class.java)
            startActivity(intent)
        }

    }
}
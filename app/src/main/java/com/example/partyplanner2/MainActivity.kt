package com.example.partyplanner2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button click
        ButtonLogin.setOnClickListener {
            //get values from input field
            val username = TextBoxUsername.text.toString().trim()
            val password = TextBoxPassword.text.toString().trim()
            //validation
            if (username.isEmpty()) //return true if username is empty
                {
                TextBoxUsername.error = "Enter Username"
                    TextBoxUsername.requestFocus() // to get the field selected(show cursor)
                }else if(password.isEmpty()){
                    TextBoxPassword.error = "Enter Password" //error message to show
                    TextBoxPassword.requestFocus()
            }else //validation is succesful
            {
                // open home/dashboard
                val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            }
        }


    }
}
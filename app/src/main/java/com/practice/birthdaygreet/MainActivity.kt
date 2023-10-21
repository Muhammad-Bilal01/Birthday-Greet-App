package com.practice.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var cardButton = findViewById<Button>(R.id.createBirthdayButton)
        cardButton.setOnClickListener {
            val name:String = findViewById<EditText>(R.id.name_input).editableText.toString()
            Toast.makeText(this, "Name is $name", Toast.LENGTH_LONG).show()

            val intent = Intent(this,BirthdayWishes::class.java)
            intent.putExtra(BirthdayWishes.NAME_EXTRA,name)
            startActivity(intent)

        }


    }
}
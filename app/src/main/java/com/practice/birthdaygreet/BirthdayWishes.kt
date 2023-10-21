package com.practice.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.practice.birthdaygreet.R.id.wishText

class BirthdayWishes : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wishes)

        val name = intent.getStringExtra(NAME_EXTRA)
        val wishText = findViewById<TextView>(R.id.wishText)
        wishText.text = "Happy Birthday\n $name"



    }
}
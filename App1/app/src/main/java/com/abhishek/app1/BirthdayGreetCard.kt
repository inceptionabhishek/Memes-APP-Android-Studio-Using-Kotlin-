package com.abhishek.app1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet_card)
        val name = intent.getStringArrayExtra("name")
        findViewById<TextView>(R.id.BirthdayGreetingMessage).text="Happy Birthday\n$name!"
    }
}
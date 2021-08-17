package com.abhishek.app1



import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cardboard(view: View) {
        val name= findViewById<EditText>(R.id.UserNameInput).editableText.toString()
        val intent = Intent(this,BirthdayGreetCard::class.java)
        intent.putExtra("name",name)
        startActivity(intent)
    }

}
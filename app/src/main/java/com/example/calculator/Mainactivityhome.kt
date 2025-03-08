package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Mainactivityhome : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         setContentView(R.layout.activity_main_home)
             val button = findViewById<Button>(R.id.button)
val text = findViewById<TextView>(R.id.textView)

    button.setOnClickListener{
        text.text ="Button Clicked"
    }

}}
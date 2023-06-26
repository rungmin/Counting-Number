package com.example.countingnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val plusButton = findViewById<Button>(R.id.plusButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        var number = 0

        plusButton.setOnClickListener {
            number++
            numberTextView.text = number.toString()
        }
        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = "0"
        }
    }

}
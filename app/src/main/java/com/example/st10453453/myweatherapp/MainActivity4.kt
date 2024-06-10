package com.example.st10453453.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        val day = intent.getStringArrayListExtra("day") ?: arrayListOf()
        val min = intent.getIntegerArrayListExtra("min") ?: arrayListOf()
        val max = intent.getIntegerArrayListExtra("max") ?: arrayListOf()
        val weatherConditions = intent.getStringArrayListExtra("weatherConditions") ?: arrayListOf()

        val detailedTextView = findViewById<TextView>(R.id.detailedTextView)

        var displayText =""
        for (i in day.indices) {
            val averageTemperature = min[i] + max[i]/2

               displayText += "Day: ${day[i]}, Min: ${min[i]} min, max: ${max[i]} min, weatherCondition: ${weatherConditions[i]}\n\n"
        }

        detailedTextView.text = displayText

        //Button to navigate back to the second page
        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)


        }
    }
}
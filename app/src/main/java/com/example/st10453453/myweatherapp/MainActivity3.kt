package com.example.st10453453.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity3 : AppCompatActivity() {
    //declaring the array
    private val  day=ArrayList<String>()
    private val min=ArrayList<Int>()
    private val max=ArrayList<Int>()
    private val weatherCondition=ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //Button to navigate to the third page
        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            intent.putStringArrayListExtra("day",day)
            intent.putIntegerArrayListExtra("min",min)
            intent.putIntegerArrayListExtra("max",max)
            intent.putStringArrayListExtra("weatherCondition",weatherCondition)
            startActivity(intent)

        //Declerations
        val dayEditText = findViewById<EditText>(R.id.dayEditText)
        val minEditText = findViewById<EditText>(R.id.minEditText)
        val maxEditText = findViewById<EditText>(R.id.maxEditText)
        val weatherConditionEditText = findViewById<EditText>(R.id.weatherConditionEditText)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

     nextButton.setOnClickListener {
         val day = dayEditText.text.toString()
         val min = minEditText.text.toString().toIntOrNull()
         val max = maxEditText.text.toString().toIntOrNull()
         val weatherCondition = weatherConditionEditText.text.toString()


         clearButton.setOnClickListener {
             //dates.clear()
             // morningScreenTimes.clear()
             //afternoonScreenTimes.clear()
             // activityNotes.clear()
             // Toast.makeText(this, "Data Cleared", Toast.LENGTH_SHORT).show()
             clearFields(dayEditText, minEditText, maxEditText, weatherConditionEditText)

         }

     }
            //the button is intended to terminate the application
            exitButton.setOnClickListener {
                finish()
            }
         }}
    private fun clearFields(vararg fields : EditText){
        for(field in fields){
            field.text.clear()
        }
    }
}





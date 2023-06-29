package com.example.app01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var name: EditText
    private lateinit var height: EditText
    private lateinit var weight: EditText
    private lateinit var age: EditText
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        name = findViewById(R.id.editTextText)
        height = findViewById(R.id.editTextNumber)
        weight = findViewById(R.id.editTextNumber2)
        age = findViewById(R.id.editTextNumber3)
        textView = findViewById(R.id.textView)


        button.setOnClickListener {
            val name = name.text.toString()
            val height = height.text.toString().toIntOrNull()
            val weight = weight.text.toString().toDoubleOrNull()
            val age = age.text.toString().toIntOrNull()

            if (name.isEmpty() || name.length > 50 ||
                height == null || height <= 0 || height >= 250 ||
                weight == null || weight <= 0 || weight >= 250 ||
                age == null || age <= 0 || age >= 150
            ) {
                textView.text = "Incorrect data entered"
            } else {
                val result = calculate(height, weight, age)
                textView.text = "$name, you need $result calories"
            }
        }

    }

    fun calculate(height: Int, weight: Double, age: Int): Double {
        return 100 + (13 * weight) + (5.5 * height) - (6 * age)
    }
}

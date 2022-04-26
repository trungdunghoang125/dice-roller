package com.trungdunghoang125.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var drawableImage1 : ImageView
    lateinit var drawableImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            // Dice 1
            val randomDice1 = getDrawablesImage()
            drawableImage1.setImageResource(randomDice1)
            // Dice 2
            val randomDice2 = getDrawablesImage()
            drawableImage2.setImageResource(randomDice2)
        }
        drawableImage1 = findViewById(R.id.dice_image_1)
        drawableImage2 = findViewById(R.id.dice_image_2)
    }

    private fun getDrawablesImage() : Int {
    val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }
}
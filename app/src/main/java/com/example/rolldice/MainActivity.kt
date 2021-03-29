package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit  var diceText : TextView
    lateinit var diceButton : Button
    lateinit var diceImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceText = findViewById(R.id.diceText)
        diceButton = findViewById(R.id.diceButton)
        diceImageView = findViewById(R.id.diceImageView)
        diceButton.setOnClickListener{
            rollDice()
            //Toast.LENGTH_SHORT
        }
    }

    private fun rollDice(){
        val randomNumber = (1..6).random()//1 ile 6 dahil.
        val drawableResource = when(randomNumber){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        diceImageView.setImageResource(drawableResource)
        diceText.text = randomNumber.toString()
    }
}
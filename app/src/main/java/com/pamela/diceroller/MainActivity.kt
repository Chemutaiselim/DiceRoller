package com.pamela.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {

            //Toast
            //val toast=Toast.makeText(this,"Dice Rolled!", Toast.LENGTH_SHORT)
            //toast.show()


            //Display the text 6, on the text view.
            //val resultTextView: TextView = findViewById(R.id.textView)
            //resultTextView.text="6"

            rollDice()

        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage:ImageView = findViewById(R.id.imageView)

        //The setImageResource() method is passing the resource id for the dice_2 image.
        diceImage.setImageResource(R.drawable.dice_2)
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
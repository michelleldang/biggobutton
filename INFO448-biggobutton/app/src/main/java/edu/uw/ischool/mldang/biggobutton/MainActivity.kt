package edu.uw.ischool.mldang.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var counter = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pressButton = findViewById<Button>(R.id.button)
            .setOnClickListener {
                counter++
                pushButtonText()
            }
    }
        private fun pushButtonText() {
            val pushButton = findViewById<Button>(R.id.button)
            var buttonText = when (counter) {
                1 -> "You have pushed me 1 time!"
                else -> "You have pushed me $counter times!"
            }
            pushButton.text = buttonText
        }

}

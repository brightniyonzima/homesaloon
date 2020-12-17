package com.example.homesaloon

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val homeSaloonClientName = intent.getStringExtra(EXTRA_MESSAGE)
        val customerHairDescription = intent.getStringExtra("HAIR_DESCRIPTION")
        val welcomeMessage = intent.getStringExtra("WELCOME_MESSAGE")
        val helloMessage = intent.getStringExtra("HELLO_MESSAGE")

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = helloMessage + ' '+ homeSaloonClientName + welcomeMessage
        }

        val multiTextView = findViewById<TextView>(R.id.textView2).apply {
            text = "Hair-do Description: " + customerHairDescription
        }
    }

    /** Called when the user taps the Send button */
    fun takePicture(view: View) {
        // Do something in response to takePic button
    }
}
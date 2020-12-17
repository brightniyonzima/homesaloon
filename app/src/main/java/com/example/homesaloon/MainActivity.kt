package com.example.homesaloon

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

/*class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        // Do something in response to button
        val editText = findViewById<EditText>(R.id.editTextTextPersonName2)
        val homeSaloonClientName = editText.text.toString()

        val hairDescriptionText = findViewById<EditText>(R.id.editTextTextMultiLine)
        val hairDescriptionString = hairDescriptionText.text.toString()

        val welcomeMessage = ". Welcome to Home Saloon"
        val helloMessage = "Hello,"

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, homeSaloonClientName)
            putExtra("HAIR_DESCRIPTION", hairDescriptionString)
            putExtra("WELCOME_MESSAGE", welcomeMessage)
            putExtra("HELLO_MESSAGE", helloMessage)
        }
        startActivity(intent)
    }
}
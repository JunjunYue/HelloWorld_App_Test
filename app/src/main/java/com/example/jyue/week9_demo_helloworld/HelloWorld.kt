package com.example.jyue.week9_demo_helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

// Import necessary packages to make the App work

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_hello_world.*

class HelloWorld : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)

        // Create an object for the TextView widget to display "Hello World"
        val textDisplay: TextView
        textDisplay = findViewById<TextView>(R.id.textViewDisplay) as TextView

        // Create an object for the EditText widget the users input their names
        val editName: EditText
        editName = findViewById<EditText>(R.id.editTextName) as EditText

        // Create an object for the button which triggers activities - change the display of "Hello World"
        val displayButton: Button
        displayButton = findViewById<Button>(R.id.buttonDisplay) as Button

        // Click event handler to change "Hello World" to "Hello [User Name]"
        displayButton.setOnClickListener {
            textDisplay.text = "Hello " + editName.text.toString () + "!"
        }
    }
}

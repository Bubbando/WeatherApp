package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // region Views
        val zipCodeEditText : EditText = findViewById(R.id.zipCodeEditText);
        val enterButton : Button = findViewById(R.id.enterButton)
        // endregion

        enterButton.setOnClickListener {
            val zipcode : String = zipCodeEditText.text.toString()

            if (zipcode.length != 5 ) {
                Toast.makeText(this, R.string.zipcode_entry_error, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, zipcode, Toast.LENGTH_LONG).show()
            }
        }
    }
}
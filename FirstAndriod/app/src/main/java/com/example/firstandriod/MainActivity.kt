package com.example.firstandriod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener{
            Log.i("Caren", "Tapped on button")
            findViewById<TextView>(R.id.textview).setTextColor(getResources().getColor(R.color.teal_200))
        }

    }
}
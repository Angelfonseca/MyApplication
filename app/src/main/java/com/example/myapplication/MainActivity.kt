package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1 = findViewById<EditText>(R.id.link)
        val boton1 = findViewById<Button>(R.id.boton)
        boton1.setOnClickListener {
            val intento1 = Intent(this, MainActivity2::class.java)
            intento1.putExtra("direccion", et1.text.toString())
            startActivity(intento1)
        }
    }
}
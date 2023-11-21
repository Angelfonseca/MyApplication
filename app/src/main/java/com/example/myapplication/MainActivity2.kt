package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle = intent.extras
        val dato = bundle?.getString("direccion")
        val webView1=findViewById<WebView>(R.id.webView1)
        webView1.settings.javaScriptEnabled = true
        val boton1=findViewById<Button>(R.id.boton2)
        webView1.loadUrl("https://www.google.com/search?q=${dato}")
        boton1.setOnClickListener {
            finish();
        }

    }

}
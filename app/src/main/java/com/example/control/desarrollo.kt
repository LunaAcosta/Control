package com.example.control

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class desarrollo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desarrollo)

        val salir : Button= findViewById(R.id.salir3)

        salir.setOnClickListener {

            val salir = Intent(this, MainActivity::class.java)
            startActivity(salir)
        }
    }
}
package com.example.control

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class DatosMascotaResult : AppCompatActivity() {

    private lateinit var DatosFinal:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_mascota_result)



        val nombre : TextView=findViewById(R.id.NMascota)
        val fecha : TextView=findViewById(R.id.FMascota)
        val tipo : TextView=findViewById(R.id.TMascota)
        val raza : TextView=findViewById(R.id.RMascota)
        val codigo : TextView=findViewById(R.id.CMascota)
        val gmascota : TextView=findViewById(R.id.GMascota)
        val alergias : TextView=findViewById(R.id.AMascota)


        DatosFinal = getSharedPreferences("MASCOTADATOS",Context.MODE_PRIVATE)

        val volver: Button=findViewById(R.id.volver)

        val Nombre = DatosFinal.getString("Nmascota","")
        nombre.text = Nombre

        val Fecha = DatosFinal.getString("Fmascota","")
        fecha.text = Fecha

        val Tipo = DatosFinal.getString("Tmascota","")
        tipo.text = Tipo

        val Raza = DatosFinal.getString("Rmascota","")
        raza.text = Raza

        val Codigo = DatosFinal.getString("Cmascota","")
        codigo.text = Codigo

        val Genero = DatosFinal.getString("Smascota","")
        gmascota.text = Genero

        val Alergias = DatosFinal.getString("Amascota","")
        alergias.text = Alergias

        volver.setOnClickListener {
            volver ()

        }

    }
    fun volver (){

        val Intent= Intent(this, MainActivity::class.java)
        startActivity(Intent)

        Toast.makeText(this,"SE GUARDARON LOS DATOS DE TU MASCOTA",Toast.LENGTH_LONG).show()

    }

}
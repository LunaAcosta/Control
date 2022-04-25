package com.example.control

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class DatosClinicaResultado : AppCompatActivity() {

    lateinit var Datos: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_clinica_resultado)

        val nombre : TextView= findViewById(R.id.EmResult)
        val direccion : TextView= findViewById(R.id.DireResult)
        val horas: TextView= findViewById(R.id.horaresult)
        val telefono : TextView= findViewById(R.id.teleresult)
        val atras: Button= findViewById(R.id.btnAtrasClini)
        val configurar: Button= findViewById(R.id.Configurar)


        Datos = getSharedPreferences("compartirAlaActividadResultado",Context.MODE_PRIVATE)

        val Nombre = Datos.getString("nombre","")
        nombre.text = Nombre

        val Direcion = Datos.getString("direccion","")
        direccion.text = Direcion

        val Horas = Datos.getString("horas","")
        horas.text = Horas

        val Telefono = Datos.getInt("telefono",0)
        telefono.text = ""+Telefono

        atras.setOnClickListener {
            Atras()
        }

        configurar.setOnClickListener {
            Configurar()
        }

    }
    fun Atras(){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        Toast.makeText(this, "Se ha guardado la informacion de su empresa ",Toast.LENGTH_SHORT).show()

        Toast.makeText(this, "CLICK CONFIGURAR PARA MODIFICAR ",Toast.LENGTH_SHORT).show()

    }

    fun Configurar(){

        val intent = Intent(this, DatosClinica::class.java)
        startActivity(intent)

        Toast.makeText(this, "INGRESE NUEVO DATOS DE SU EMPRESA  ",Toast.LENGTH_SHORT).show()


    }


}
package com.example.control

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class DatosDeMascota : AppCompatActivity() {

     private lateinit var DatosMascota: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_de_mascota)

        val guardar: Button=findViewById(R.id.guardarmascota)

        val nombre: EditText=findViewById(R.id.Nmascota)
        val fecha: EditText=findViewById(R.id.Fmascata)
        val tipo: EditText=findViewById(R.id.Tmascota)
        val raza: EditText=findViewById(R.id.Rmascota)
        val codigo: EditText=findViewById(R.id.Cmascota)

       // val Macho: RadioButton=findViewById(R.id.macho)
        //val Hembra: RadioButton=findViewById(R.id.hembra)


        DatosMascota = getSharedPreferences("MASCOTADATOS",Context.MODE_PRIVATE)

        guardar.setOnClickListener {

            val Nombre: String = nombre.text.toString()
            val Fecha: String = fecha.text.toString()
            val Tipo : String = tipo.text.toString()
            val Raza: String= raza.text.toString()
            val Codigo: String= codigo.text.toString()
            val Sexo: String = genero()
            val Alergias: String = alergias()



            val editar: SharedPreferences.Editor = DatosMascota.edit()

            editar.putString("Nmascota",Nombre)
            editar.putString("Fmascota",Fecha)
            editar.putString("Tmascota",Tipo)
            editar.putString("Rmascota",Raza)
            editar.putString("Cmascota",Codigo)
            editar.putString("Smascota",Sexo)
            editar.putString("Amascota",Alergias)
            editar.apply()

            val intent = Intent(this, DatosMascotaResult::class.java)
            startActivity(intent)

            Toast.makeText(this,"HAS CREADO UN FICHERO",Toast.LENGTH_LONG).show()
        }


    }
    fun genero():String{

        val Macho: RadioButton=findViewById(R.id.macho)
        val Hembra: RadioButton=findViewById(R.id.hembra)

        if (Macho.isChecked)
            return "Macho"

        if (Hembra.isChecked)
            return "Hembra"
        return ""
    }

    fun alergias ():String{

        val si : RadioButton=findViewById(R.id.sialer)
        val no : RadioButton=findViewById(R.id.NoElergias)

        if (si.isChecked)
            return "SI"

        if (no.isChecked)
            return "NO"

        return ""
    }
}
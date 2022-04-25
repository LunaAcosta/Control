package com.example.control

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.ButtonBarLayout

class DatosClinica : AppCompatActivity() {

    private lateinit var datosDeClinica: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_clinica)

        val Nombre: EditText=findViewById(R.id.nombreClinica)
        val Direccion: EditText=findViewById(R.id.direcion)
        val Horas: EditText=findViewById(R.id.horas)
        val telefono: EditText=findViewById(R.id.telefono)

        val Guardar: Button= findViewById(R.id.btnguardar)

        datosDeClinica = getSharedPreferences("compartirAlaActividadResultado", Context.MODE_PRIVATE)

        Guardar.setOnClickListener {

            val nombre: String = Nombre.text.toString()
            val direccion : String = Direccion.text.toString()
            val horas : String = Horas.text.toString()
            val telefono: Int = telefono.text.toString().toInt()


            val editor: SharedPreferences.Editor = datosDeClinica.edit()
            editor.putString("nombre",nombre)
            editor.putString("direccion",direccion)
            editor.putString("horas",horas)
            editor.putInt("telefono",telefono)
            editor.apply()

            val intent = Intent(this, DatosClinicaResultado::class.java)
            startActivity(intent)

            Toast.makeText(this,"SE HA GUARDADO SU INFORMACION",Toast.LENGTH_LONG).show()

        }


    }
}

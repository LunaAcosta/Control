package com.example.control

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class resultvacuna : AppCompatActivity() {

    private lateinit var DatosVacunaFinal:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultvacuna)

        val resula: TextView=findViewById(R.id.textView)
        val Vacuna2: TextView=findViewById(R.id.vacuna2r)
        val Vacuna3: TextView=findViewById(R.id.vacuna3r)
        val Vacuna4: TextView=findViewById(R.id.vacuna4r)
        val Vacuna5: TextView=findViewById(R.id.vacuna5r)
        val Vacuna6: TextView=findViewById(R.id.vacuna6r)
        val volver: Button= findViewById(R.id.volver99)
        val act: Button= findViewById(R.id.actuaizar99)

        volver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        act.setOnClickListener {
            val intent = Intent(this, vacuna::class.java)
            startActivity(intent)
        }




        DatosVacunaFinal= getSharedPreferences("DATOSDEVACUNA",Context.MODE_PRIVATE)

        val sinoo = DatosVacunaFinal.getString("SiNo","")
        resula.text = sinoo

        val vacuna2 = DatosVacunaFinal.getString("vacuna2","")
        Vacuna2.text = vacuna2

        val vacuna3 = DatosVacunaFinal.getString("vacuna3","")
        Vacuna3.text = vacuna3

        val vacuna4 = DatosVacunaFinal.getString("vacuna4","")
        Vacuna4.text = vacuna4

        val vacuna5 = DatosVacunaFinal.getString("vacuna5","")
        Vacuna5.text = vacuna5

        val vacuna6 = DatosVacunaFinal.getString("vacuna6","")
        Vacuna6.text = vacuna6




    }
}
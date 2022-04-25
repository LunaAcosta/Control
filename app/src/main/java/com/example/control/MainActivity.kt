package com.example.control

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val DClinica: Button=findViewById(R.id.btnClinica)
        val DMascota: Button=findViewById(R.id.btn2)

        // Evento clic para el boton y pasar de actividad a otra
        DClinica.setOnClickListener {
            val Clinica: Intent = Intent(this,DatosClinica::class.java)
            startActivity(Clinica)
        }
        DMascota.setOnClickListener {
            val Mascota: Intent = Intent(this,DatosDeMascota::class.java)
            startActivity(Mascota)

        }




    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.mc, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){

            R.id.Infor -> {

                val configu: Intent = Intent(this, DatosClinicaResultado::class.java)
                startActivity(configu)

                true
            }
            R.id.mascotaperfil -> {

                val configu: Intent = Intent(this, DatosMascotaResult::class.java)
                startActivity(configu)

                true
            }
            R.id.vacinai -> {

                val configu: Intent = Intent(this,vacuna::class.java)
                startActivity(configu)

                true
            }
            R.id.estadovacuna -> {

                val configu: Intent = Intent(this,resultvacuna::class.java)
                startActivity(configu)

                true
            }
            R.id.desarrollador -> {

                val configu: Intent = Intent(this,desarrollo::class.java)
                startActivity(configu)

                true
            }

            else ->super.onOptionsItemSelected(item)

        }

    }
}

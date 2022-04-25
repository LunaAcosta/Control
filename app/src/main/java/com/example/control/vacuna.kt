package com.example.control

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.zip.Checksum

class vacuna : AppCompatActivity() {

    private lateinit var DatosVacuna:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacuna)

        val vacunaGuardar:Button=findViewById(R.id.btnguardarvacuna)
        val voler:Button=findViewById(R.id.volc)

        voler.setOnClickListener {
            val volver = Intent(this, MainActivity::class.java)
            startActivity(volver)
        }

        DatosVacuna= getSharedPreferences("DATOSDEVACUNA",Context.MODE_PRIVATE)

        vacunaGuardar.setOnClickListener {

            val estaOnoEsta: String = rabia()
            val vacuna2: String = vacuna2()
            val vacuna3: String = vacuna3()
            val vacuna4: String = vacuna4()
            val vacuna5: String = vacuna5()
            val vacuna6: String = vacuna6()



            val editar: SharedPreferences.Editor = DatosVacuna.edit()
            editar.putString("SiNo",estaOnoEsta)
            editar.putString("vacuna2",vacuna2)
            editar.putString("vacuna3",vacuna3)
            editar.putString("vacuna4",vacuna4)
            editar.putString("vacuna5",vacuna5)
            editar.putString("vacuna6",vacuna6)
            editar.apply()

            val intent = Intent(this, resultvacuna::class.java)
            startActivity(intent)

            Toast.makeText(this,"HAS ACTUALIZADO TU CALENDARIO DE VACUNACION",Toast.LENGTH_LONG).show()
        }

    }

    fun rabia():String{

        val rabiasi: RadioButton=findViewById(R.id.rabiaSi)
        val rabiano: RadioButton=findViewById(R.id.rabiaNo)

        if (rabiasi.isChecked)
            return "INYECTADA"

        if (rabiano.isChecked)
            return "NO INYECTADA"
        return ""
    }
    fun vacuna2():String{

        val cv2si: RadioButton=findViewById(R.id.si2)
        val cv2no: RadioButton=findViewById(R.id.no2)

        if (cv2si.isChecked)
            return "INYECTADA"

        if (cv2no.isChecked)
            return "NO INYECTADA"
        return ""
    }
    fun vacuna3():String{

        val cv3si: RadioButton=findViewById(R.id.si3)
        val cv3no: RadioButton=findViewById(R.id.no3)

        if (cv3si.isChecked)
            return "INYECTADA"

        if (cv3no.isChecked)
            return "NO INYECTADA"
        return ""
    }
    fun vacuna4():String{

        val cv4si: RadioButton=findViewById(R.id.si4)
        val cv4no: RadioButton=findViewById(R.id.no4)

        if (cv4si.isChecked)
            return "INYECTADA"

        if (cv4no.isChecked)
            return "NO INYECTADA"
        return ""
    }
    fun vacuna5():String{

        val cv5si: RadioButton=findViewById(R.id.si5)
        val cv5no: RadioButton=findViewById(R.id.no5)

        if (cv5si.isChecked)
            return "INYECTADA"

        if (cv5no.isChecked)
            return "NO INYECTADA"
        return ""
    }
    fun vacuna6():String{

        val cv6si: RadioButton=findViewById(R.id.si6)
        val cv6no: RadioButton=findViewById(R.id.no6)

        if (cv6si.isChecked)
            return "INYECTADA"

        if (cv6no.isChecked)
            return "NO INYECTADA"
        return ""
    }

}
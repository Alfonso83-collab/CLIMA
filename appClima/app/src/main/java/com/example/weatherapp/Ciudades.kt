package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG = "com.example.weatherapp.Ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btPuebla = findViewById<Button>(R.id.btnPuebla)
        val btAjalpan = findViewById<Button>(R.id.btnAjalpan)
        val btAjalpan2 = findViewById<Button>(R.id.btnAjalpan2)
        val btAjalpan3 = findViewById<Button>(R.id.btnAjalpan3)

        btPuebla.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-puebla")
            startActivity(intent)

            //Toast.makeText(this, "Puebla", Toast.LENGTH_SHORT).show()
        })

        btAjalpan.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-ajalpan")
            startActivity(intent)

            //Toast.makeText(this, "Ajalpan", Toast.LENGTH_SHORT).show()
        })

        btAjalpan2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-ajalpan 2 2 2 2")
            startActivity(intent)

            //Toast.makeText(this, "Ajalpan", Toast.LENGTH_SHORT).show()
        })

        btAjalpan3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-ajalpan 3 3 3 3")
            startActivity(intent)

            //Toast.makeText(this, "Ajalpan", Toast.LENGTH_SHORT).show()
        })





    }
}
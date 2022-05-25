package com.example.leer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardAbc = findViewById<CardView>(R.id.cardMenuMain_Abd)
        val cardSilaba = findViewById<CardView>(R.id.cardMenuMain_Silaba)
        val cardCuento = findViewById<CardView>(R.id.cardMenuMain_Cuento)

        cardAbc.setOnClickListener {
            val intent = Intent(this, AbecedarioActivity::class.java)
            startActivity(intent)
        }

        cardSilaba.setOnClickListener {
            val intent = Intent(this, SilabasActivity::class.java)
            startActivity(intent)
        }

        cardCuento.setOnClickListener {
            val intent = Intent(this, CuentosActivity::class.java)
            startActivity(intent)
        }
    }
}
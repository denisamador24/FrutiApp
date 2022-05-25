package com.example.leer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class LeerCuentoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leer_cuento)

        val titulo = intent.getStringExtra("titulo")
        val image = intent.getIntExtra("image", R.drawable.img_cuentos)
        val cuento = intent.getStringExtra("cuento")

        val textTitulo = findViewById<TextView>(R.id.activityLeerCuento_titulo)
        val imageView = findViewById<ImageView>(R.id.activityLeerCuento_ImageView)
        val textCuento = findViewById<TextView>(R.id.activityLeerCuento_cuento)

        textTitulo.text = titulo
        imageView.setImageResource(image)
        textCuento.text = cuento
    }
}
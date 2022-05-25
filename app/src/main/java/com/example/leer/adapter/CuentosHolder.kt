package com.example.leer.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leer.R
import com.example.leer.data.Cuentos

class CuentosHolder(val view: View): RecyclerView.ViewHolder(view) {

    val image = view.findViewById<ImageView>(R.id.cardMenuMain_imageView)
    val titulo = view.findViewById<TextView>(R.id.cardList_name)

    fun render (item: Cuentos){
        image.setImageResource(item.imagen)
        titulo.text = item.titulo
    }
}
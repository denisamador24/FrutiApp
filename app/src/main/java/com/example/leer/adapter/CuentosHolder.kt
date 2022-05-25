package com.example.leer.adapter

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.leer.LeerCuentoActivity
import com.example.leer.R
import com.example.leer.data.Cuentos

class CuentosHolder(val view: View): RecyclerView.ViewHolder(view) {

    val cardCuento = view.findViewById<CardView>(R.id.cardListCuento)
    val image = view.findViewById<ImageView>(R.id.cardMenuMain_imageView)
    val titulo = view.findViewById<TextView>(R.id.cardList_name)

    fun render (item: Cuentos){
        image.setImageResource(item.imagen)
        titulo.text = item.titulo

        cardCuento.setOnClickListener {
            val intent = Intent(view.context, LeerCuentoActivity::class.java)
            intent.putExtra("titulo", item.titulo)
            intent.putExtra("image", item.imagen)
            intent.putExtra("cuento", item.text)
            view.context.startActivity(intent)
        }
    }

}
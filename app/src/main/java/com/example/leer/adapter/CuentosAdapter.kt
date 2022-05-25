package com.example.leer.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.leer.R
import com.example.leer.data.Cuentos

class CuentosAdapter(val listCuentos: List<Cuentos>): RecyclerView.Adapter<CuentosHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CuentosHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CuentosHolder(layoutInflater.inflate(R.layout.card_list_cuentos, parent, false))
    }

    override fun onBindViewHolder(holder: CuentosHolder, position: Int) {
        val item = listCuentos[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = listCuentos.size
}
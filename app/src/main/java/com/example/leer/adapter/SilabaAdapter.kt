package com.example.leer.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.leer.R
import com.example.leer.data.ListSilabas
import com.example.leer.data.Silabas

class SilabaAdapter(val listSilabas: List<Silabas>): RecyclerView.Adapter<SilabaHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SilabaHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SilabaHolder(layoutInflater.inflate(R.layout.card_list_silabas, parent, false))
    }

    override fun onBindViewHolder(holder: SilabaHolder, position: Int) {
        val item:Silabas = listSilabas[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = listSilabas.size
}
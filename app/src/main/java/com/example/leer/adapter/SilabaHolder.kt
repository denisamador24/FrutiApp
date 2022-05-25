package com.example.leer.adapter

import android.media.MediaPlayer
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.leer.R
import com.example.leer.data.Silabas

class SilabaHolder(val view: View): RecyclerView.ViewHolder(view) {

    val letra = view.findViewById<TextView>(R.id.cardListSilaba_textViewLetra)

    val a = view.findViewById<TextView>(R.id.cardListSilaba_A)
    val e = view.findViewById<TextView>(R.id.cardListSilaba_E)
    val i = view.findViewById<TextView>(R.id.cardListSilaba_I)
    val o = view.findViewById<TextView>(R.id.cardListSilaba_O)
    val u = view.findViewById<TextView>(R.id.cardListSilaba_U)

    val cardA  = view.findViewById<CardView>(R.id.cardListSilaba_CardA)
    val cardE = view.findViewById<CardView>(R.id.cardListSilaba_CardE)
    val cardI = view.findViewById<CardView>(R.id.cardListSilaba_CardI)
    val cardO = view.findViewById<CardView>(R.id.cardListSilaba_CardO)
    val cardU = view.findViewById<CardView>(R.id.cardListSilaba_CardU)

    fun render(silabas: Silabas){
        letra.text = silabas.letra

        a.text = silabas.letrasSilaba.a
        e.text = silabas.letrasSilaba.e
        i.text = silabas.letrasSilaba.i
        o.text = silabas.letrasSilaba.o
        u.text = silabas.letrasSilaba.u

        cardA.setOnClickListener { ComenzarSonido(silabas.audio.a) }
        cardE.setOnClickListener { ComenzarSonido(silabas.audio.e) }
        cardI.setOnClickListener { ComenzarSonido(silabas.audio.i) }
        cardO.setOnClickListener { ComenzarSonido(silabas.audio.o) }
        cardU.setOnClickListener { ComenzarSonido(silabas.audio.u) }
    }

    private fun ComenzarSonido(uriSonido: Int){
        val mediaPlayer: MediaPlayer = MediaPlayer.create(view.context, uriSonido)
        mediaPlayer.start()
    }
}
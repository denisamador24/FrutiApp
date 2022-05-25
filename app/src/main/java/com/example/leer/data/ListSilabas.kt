package com.example.leer.data

import com.example.leer.R

class ListSilabas {

    companion object {
        val listSilabas = listOf<Silabas>(
            Silabas(
                "S",
                Silaba("Sa", "Se", "Si", "So", "Su"),
                SonidoSilaba(R.raw.bad, R.raw.bad, R.raw.bad, R.raw.bad, R.raw.bad,)
            ),
            Silabas(
                "S",
                Silaba("Sa", "Se", "Si", "So", "Su"),
                SonidoSilaba(R.raw.bad, R.raw.bad, R.raw.bad, R.raw.bad, R.raw.bad,)
            )
        )
    }
}
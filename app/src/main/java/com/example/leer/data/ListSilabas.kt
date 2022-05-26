package com.example.leer.data

import com.example.leer.R

class ListSilabas {

    companion object {
        val listSilabas = listOf<Silabas>(
            Silabas("P",
                Silaba("Pa", "Pe", "Pi", "Po", "Pu",),
                SonidoSilaba(R.raw.pa, R.raw.pe, R.raw.pi, R.raw.po, R.raw.pu)
                ),
            Silabas("M",
                Silaba("Ma", "Me", "Mi", "Mo", "Mu"),
                SonidoSilaba(R.raw.ma, R.raw.me, R.raw.mi, R.raw.mo, R.raw.mu)
                ),
            Silabas("F",
                Silaba("Fe", "Fi", "Fi", "Fo", "Fu"),
                SonidoSilaba(R.raw.fa, R.raw.fe, R.raw.fi, R.raw.fo, R.raw.fu)
                ),
            Silabas("R",
                Silaba("Ra", "Re", "Ri", "Ro", "Ru"),
                SonidoSilaba(R.raw.ra, R.raw.re, R.raw.ri, R.raw.ro, R.raw.ru)
                ),
            Silabas(
                "S",
                Silaba("Sa", "Se", "Si", "So", "Su"),
                SonidoSilaba(R.raw.sa, R.raw.se, R.raw.si, R.raw.so, R.raw.su)
            ),
        )
    }
}
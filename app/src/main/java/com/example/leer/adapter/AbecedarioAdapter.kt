package com.example.leer.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.leer.R
import de.hdodenhof.circleimageview.CircleImageView

class AbecedarioAdapter ( val context: Context, val listAbc: List<Int>): BaseAdapter() {
    override fun getCount(): Int {
        return listAbc.size
    }

    override fun getItem(position: Int): Any {
        return listAbc[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = View.inflate(context, R.layout.card_list_abecedario, null)
        val image = view.findViewById<CircleImageView>(R.id.cardListAbc_imageView)

        image.setImageResource(listAbc[position])

        return view
    }
}
package com.example.leer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.example.leer.adapter.AbecedarioAdapter
import com.example.leer.data.ListAbecedario

class AbecedarioActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abecedario)

        val gridView = findViewById<GridView>(R.id.activityAbecedario_GridVieLetras)
        val abecedarioAdapter = AbecedarioAdapter(applicationContext, ListAbecedario.listAbecedario)
        gridView.adapter = abecedarioAdapter
        gridView.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        Toast.makeText(this,"Seleccion de Letra $position", Toast.LENGTH_SHORT ).show()
    }

}
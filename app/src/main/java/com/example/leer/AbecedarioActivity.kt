package com.example.leer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.leer.adapter.AbecedarioAdapter
import com.example.leer.data.ListAbecedario

class AbecedarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abecedario)

        val gridView = findViewById<GridView>(R.id.activityAbecedario_GridVieLetras)
        val abecedarioAdapter = AbecedarioAdapter(applicationContext, ListAbecedario.listAbecedario)
        gridView.adapter = abecedarioAdapter
    }
}
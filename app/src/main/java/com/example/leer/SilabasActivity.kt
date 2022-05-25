package com.example.leer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.leer.adapter.SilabaAdapter
import com.example.leer.data.ListSilabas

class SilabasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_silabas)

        val recyclerView = findViewById<RecyclerView>(R.id.activitySilaba_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SilabaAdapter(ListSilabas.listSilabas)
    }
}
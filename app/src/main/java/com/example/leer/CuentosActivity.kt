package com.example.leer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.leer.adapter.CuentosAdapter
import com.example.leer.data.Cuentos
import com.example.leer.data.ListCuentos

class CuentosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuentos)

        try {
            val recycler = findViewById<RecyclerView>(R.id.activityCuentos_recyclerView)
            recycler.layoutManager = LinearLayoutManager(this)
            recycler.adapter = CuentosAdapter(ListCuentos.CuentosLis)
        }catch (ex: Exception){
            Toast.makeText(this, "Erroe $ex", Toast.LENGTH_LONG).show()
        }

    }
}
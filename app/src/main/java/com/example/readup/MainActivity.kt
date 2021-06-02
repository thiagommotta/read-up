package com.example.readup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.readup.databinding.ActivityMainBinding
import com.example.readup.model.TextosData



class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding
     private lateinit var adapter: ListAdapter
     private lateinit var textosData: ArrayList<TextosData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val listaDeTextos = binding.listaDeTextos
        listaDeTextos.adapter = adapter
        initTitulosList()
        setContentView(binding.root)




    }

    private fun initTitulosList() {

        textosData.add(TextosData("America"))



    }

}



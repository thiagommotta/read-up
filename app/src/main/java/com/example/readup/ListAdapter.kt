package com.example.readup

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.readup.databinding.ItemListaBinding
import com.example.readup.model.TextosData

class ListAdapter(private val textoList: ArrayList<TextosData>): RecyclerView.Adapter<ListAdapter.TextosViewHolder>() {
    class TextosViewHolder(val binding: ItemListaBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextosViewHolder {
        return TextosViewHolder(
            ItemListaBinding.inflate(LayoutInflater.from(parent.context), parent, false),
        )
    }

    override fun onBindViewHolder(holder: TextosViewHolder, position: Int) {
        val textosDatas: TextosData = textoList[position]
        holder.binding.tituloTexto.text = textosDatas.titulosDosTextos
    }

    override fun getItemCount(): Int {
        return textoList.size
    }

}


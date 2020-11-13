package com.example.digitalhousefoods.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.ui.model.Receitas

class DetailsAdapter(private val listReceitas: MutableList<Receitas>) :
    RecyclerView.Adapter<DetailsAdapter.DetailViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_receita, parent, false)
        return DetailViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        holder.imagemView.setImageResource(listReceitas[position].imagem)
        holder.txtNome.setText(listReceitas[position].nome)

        holder.itemView.setOnClickListener {
            MainActivity.fm.beginTransaction()
                .replace(R.id.fragmentContainer, FragmentReceita(), null)
                .addToBackStack(null).commit()
        }
    }

    override fun getItemCount(): Int {
        return listReceitas.size
    }

    class DetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagemView: ImageView = itemView.findViewById(R.id.imgRecyclerReceitaImage)
        var txtNome: TextView = itemView.findViewById(R.id.txt2RecyclerRestaurantName)
    }


}
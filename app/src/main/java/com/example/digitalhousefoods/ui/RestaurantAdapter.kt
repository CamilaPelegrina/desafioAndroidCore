package com.example.digitalhousefoods.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.ui.model.Restaurant
import kotlin.properties.Delegates

class RestaurantAdapter(private val listRestaurant: MutableList<Restaurant>) :
    RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {

    private var txtName by Delegates.notNull<Int>()
    private var imageView by Delegates.notNull<Int>()
    private var listDados = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_restaurant, parent, false)

        return RestaurantViewHolder(view)
    }


    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.imageView.setImageResource(listRestaurant[position].image)
        holder.txtName.setText(listRestaurant[position].name)
        holder.txtLocation.setText(listRestaurant[position].endereco)
        holder.txtHorarios.setText(listRestaurant[position].horario)


        holder.itemView.setOnClickListener {

            MainActivity.fm.beginTransaction().replace(R.id.fragmentContainer, FragmentDetails(), null)
             .addToBackStack(null).commit()
        }
    }

    override fun getItemCount(): Int {
        return listRestaurant.size
    }

    class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.imgRecyclerImage)
        var txtName: TextView = itemView.findViewById(R.id.txtRecyclerRestaurantName)
        var txtLocation: TextView = itemView.findViewById(R.id.txtRecyclerRestaurantEndereco)
        var txtHorarios: TextView = itemView.findViewById(R.id.txtRecyclerRestaurantHorario)
    }

}


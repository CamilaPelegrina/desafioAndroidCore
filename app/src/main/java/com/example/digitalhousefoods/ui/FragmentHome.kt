package com.example.digitalhousefoods.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.ui.model.Restaurant

class FragmentHome : Fragment() {
    private var listRestaurant = mutableListOf<Restaurant>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        return  view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        populateList()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerHome)

        recyclerView.adapter = RestaurantAdapter(listRestaurant)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
    }

    private fun populateList() {
        listRestaurant.clear()
        listRestaurant.add(Restaurant(R.drawable.image1, R.string.restaurant1, R.string.endereco1, R.string.horario1))
        listRestaurant.add(Restaurant(R.drawable.image4,R.string.restaurant2, R.string.endereco2, R.string.horario2))
        listRestaurant.add(Restaurant(R.drawable.image5,R.string.restaurant3, R.string.endereco3, R.string.horario3))
        listRestaurant.add(Restaurant(R.drawable.image3,R.string.restaurant4, R.string.endereco4, R.string.horario4))
        }
}
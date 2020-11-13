package com.example.digitalhousefoods.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.ui.model.Receitas

class FragmentDetails : Fragment(){

    private var listReceitas = mutableListOf<Receitas>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recycler_details, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        populateList()

        val recyclerView2 = view.findViewById<RecyclerView>(R.id.recyclerHome)

        recyclerView2.adapter = DetailsAdapter(listReceitas)
        recyclerView2.apply {
            layoutManager = GridLayoutManager(context, 2)
        }

    }

    private fun populateList() {
        listReceitas.clear()
        listReceitas.add( Receitas(R.drawable.image4, R.string.receita, R.string.descricao))
        listReceitas.add( Receitas(R.drawable.image4, R.string.receita, R.string.descricao))
        listReceitas.add( Receitas(R.drawable.image4, R.string.receita, R.string.descricao))
        listReceitas.add( Receitas(R.drawable.image4, R.string.receita, R.string.descricao))
        listReceitas.add( Receitas(R.drawable.image4, R.string.receita, R.string.descricao))
        listReceitas.add( Receitas(R.drawable.image4, R.string.receita, R.string.descricao))
    }
}

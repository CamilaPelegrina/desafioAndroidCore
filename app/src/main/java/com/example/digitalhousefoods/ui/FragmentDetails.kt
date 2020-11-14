package com.example.digitalhousefoods.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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
        (activity as AppCompatActivity).supportActionBar?.hide()
        //(activity as AppCompatActivity).setTheme(R.style.CustomActionBarTheme)
        //(activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //(activity as AppCompatActivity).supportActionBar?.title = ""

        fun handleOnBackPressed() {
            findNavController().navigate(R.id.action_fragmentDetails_to_fragmentHome)
        }

        val view: View = inflater.inflate(R.layout.recycler_details, container, false)
        //view.btnBackDetail.setOnClickListener {
          //  findNavController().navigate(R.id.action_fragmentDetails_to_fragmentHome)
        //}
        view.findViewById<AppCompatButton>(R.id.btnBackDetail).setOnClickListener{
            MainActivity.fm.beginTransaction().replace(R.id.fragmentContainer, FragmentHome(), null)
        }

        return view
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

package com.example.digitalhousefoods.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.digitalhousefoods.R

class FragmentReceita : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        (activity as AppCompatActivity).supportActionBar?.hide()
        //(activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //(activity as AppCompatActivity).supportActionBar?.title = ""

        val view: View = inflater.inflate(R.layout.fragment_receita, container, false)
       //view.btnBackReceita.setOnClickListener {
         //   findNavController().navigate(R.id.action_fragmentReceita_to_fragmentDetails)
        //}

        view.findViewById<AppCompatButton>(R.id.btnBackReceita).setOnClickListener{
            MainActivity.fm.beginTransaction().replace(R.id.fragmentContainer, FragmentDetails(), null)
        }

        return view
    }

}

package com.paudam.projectecafeteriapaupulido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.paudam.projectecafeteriapaupulido.databinding.FragmentBegudesBinding
import com.paudam.projectecafeteriapaupulido.databinding.FragmentPagamentBinding

class PagamentFragment : Fragment() {

    private val globalViewModel: GlobalViewModel by activityViewModels()
    private lateinit var binding: FragmentPagamentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentPagamentBinding.inflate(inflater)

        binding.textResTotal.text = globalViewModel.obtainPreuFinal().toString()

        //Menjars
        binding.textMagPreu.text = globalViewModel.pintarPreuMag().toString()
        binding.textCroissPreu.text = globalViewModel.pintarPreuCrois().toString()
        binding.textEntPreu.text = globalViewModel.pintarPreuE().toString()

        //Begudes
        binding.textCafePreu.text = globalViewModel.pintarPreuCafe().toString()
        binding.textXocoPreu.text = globalViewModel.pintarPreuXoco().toString()
        binding.textZumoPreu.text = globalViewModel.pintarPreuSuc().toString()

        //Postres
        binding.textTrufesPreu.text = globalViewModel.pintarPreuTrufes().toString()
        binding.textFlamPreu.text = globalViewModel.pintarPreuFlam().toString()

        binding.button2.setOnClickListener(){
            findNavController().navigate(
                R.id.action_pagamentFragment_to_pagamentDadesFragment,
                null)
        }

        return binding.root


    }
}
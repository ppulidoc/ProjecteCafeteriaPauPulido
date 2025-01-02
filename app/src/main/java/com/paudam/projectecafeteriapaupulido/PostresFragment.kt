package com.paudam.projectecafeteriapaupulido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.paudam.projectecafeteriapaupulido.databinding.FragmentBegudesBinding
import com.paudam.projectecafeteriapaupulido.databinding.FragmentMenjarsBinding
import com.paudam.projectecafeteriapaupulido.databinding.FragmentPostresBinding


class PostresFragment : Fragment() {
    private val postresViewModel: PostresViewModel by activityViewModels()
    private val globalViewModel: GlobalViewModel by activityViewModels()
    private lateinit var binding: FragmentPostresBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPostresBinding.inflate(inflater)

        binding.button2.setOnClickListener {

            val quantitatT = binding.quantTrufas.text.toString()
            val preuT = binding.preuTrufa.text.toString()
            val quantTInt = quantitatT.toIntOrNull()
            val preuTInt = preuT.toIntOrNull()

            if (quantTInt != null && preuTInt != null ) {
                postresViewModel.updateTrufes(quantTInt, preuTInt)
            }


            val quantitatF = binding.quantFlam.text.toString()
            val preuF = binding.preuFlam.text.toString()
            val quantFInt = quantitatF.toIntOrNull()
            val preuFInt = preuF.toIntOrNull()

            if (quantFInt != null && preuFInt != null ) {
                postresViewModel.updateFlam(quantFInt, preuFInt)
            }


            val totalPostres = postresViewModel.totalPostres()
            globalViewModel.obtainPostres(totalPostres)


            findNavController().navigate(
                R.id.action_postresFragment_to_pagamentFragment,
                null)

        }
        return binding.root
    }

}
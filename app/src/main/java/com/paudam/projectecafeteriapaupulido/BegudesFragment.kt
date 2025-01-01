package com.paudam.projectecafeteriapaupulido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.paudam.projectecafeteriapaupulido.databinding.FragmentBegudesBinding
import com.paudam.projectecafeteriapaupulido.databinding.FragmentMenjarsBinding

class BegudesFragment : Fragment() {

    private lateinit var binding: FragmentBegudesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentBegudesBinding.inflate(inflater)

        binding.button2.setOnClickListener {
            findNavController().navigate(
                R.id.action_begudesFragment_to_postresFragment,
                null)
        }


        return binding.root
    }

}
package com.paudam.projectecafeteriapaupulido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.paudam.projectecafeteriapaupulido.databinding.FragmentMenjarsBinding


class MenjarsFragment : Fragment() {

    private lateinit var binding: FragmentMenjarsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenjarsBinding.inflate(inflater)

        binding.button2.setOnClickListener {
            findNavController().navigate(
                R.id.action_menjarsFragment_to_begudesFragment,
                null,
                NavOptions.Builder()
                    .setPopUpTo(R.id.menjarsFragment, true)
                    .build()
            )
        }

        return binding.root


    }
}
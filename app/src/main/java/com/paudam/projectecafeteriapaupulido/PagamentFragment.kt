package com.paudam.projectecafeteriapaupulido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
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




        return binding.root


    }
}
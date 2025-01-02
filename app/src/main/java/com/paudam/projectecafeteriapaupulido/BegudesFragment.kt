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

class BegudesFragment : Fragment() {
    private val begudesViewModel: BegudesViewModel by activityViewModels()
    private val globalViewModel: GlobalViewModel by activityViewModels()
    private lateinit var binding: FragmentBegudesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentBegudesBinding.inflate(inflater)

        binding.button2.setOnClickListener {

            val quantitatC = binding.quantCafeLlet.text.toString()
            val preuC = binding.preuCafe.text.toString()
            val quantCInt = quantitatC.toIntOrNull()
            val preuCInt = preuC.toIntOrNull()

            if (quantCInt != null && preuCInt != null ) {
                begudesViewModel.updateCafe(quantCInt, preuCInt)
                globalViewModel.obtainCafePreuTotal(begudesViewModel.updateCafe(quantCInt,preuCInt))
            }


            val quantitatX = binding.quantXoco.text.toString()
            val preuX = binding.preuXoco.text.toString()
            val quantXInt = quantitatX.toIntOrNull()
            val preuXInt = preuX.toIntOrNull()

            if (quantXInt != null && preuXInt != null ) {
                begudesViewModel.updateXoco(quantXInt, preuXInt)
                globalViewModel.obtainXocoPreuTotal(begudesViewModel.updateXoco(quantXInt,preuXInt))
            }


            val quantitatS = binding.quantSuc.text.toString()
            val preuS = binding.preuSuc.text.toString()
            val quantSInt = quantitatS.toIntOrNull()
            val preuSInt = preuS.toIntOrNull()

            if (quantSInt != null && preuSInt != null ) {
                begudesViewModel.updateSuc( quantSInt, preuSInt)
                globalViewModel.obtainSucPreuTotal(begudesViewModel.updateSuc(quantSInt,preuSInt))
            }

            val totalBegudes = begudesViewModel.totalBegudes()
            globalViewModel.obtainBegudes(totalBegudes)


            findNavController().navigate(
                R.id.action_begudesFragment_to_postresFragment,
                null)
        }


        return binding.root
    }

}
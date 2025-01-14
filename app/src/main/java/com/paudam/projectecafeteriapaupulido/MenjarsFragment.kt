package com.paudam.projectecafeteriapaupulido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.paudam.projectecafeteriapaupulido.databinding.FragmentMenjarsBinding


class MenjarsFragment : Fragment() {
    private val menjarsViewModel: MenjarsViewModel by activityViewModels()
    private val globalViewModel: GlobalViewModel by activityViewModels()
    private lateinit var binding: FragmentMenjarsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenjarsBinding.inflate(inflater)

        binding.button2.setOnClickListener {

            val quantitatM = binding.quantMagdalena.text.toString()
            val preuM = binding.preuMagdalena.text.toString()
            val quantMInt = quantitatM.toIntOrNull()
            val preuMInt = preuM.toIntOrNull()

            if (quantMInt != null && preuMInt != null ) {
                menjarsViewModel.updateMadalenas(quantMInt, preuMInt)
                globalViewModel.obtainMagPreuTotal(menjarsViewModel.updateMadalenas(quantMInt,preuMInt))
            }


            val quantitatC = binding.quantCroissant.text.toString()
            val preuC = binding.preuCroissant.text.toString()
            val quantCInt = quantitatC.toIntOrNull()
            val preuCInt = preuC.toIntOrNull()

            if (quantCInt != null && preuCInt != null ) {
                menjarsViewModel.updateCroissants(quantCInt, preuCInt)
                globalViewModel.obtainCroisPreuTotal(menjarsViewModel.updateCroissants(quantCInt,preuCInt))
            }


            val quantitatE = binding.quantEntrepa.text.toString()
            val preuE = binding.preuEntrepa.text.toString()
            val quantEInt = quantitatE.toIntOrNull()
            val preuEInt = preuE.toIntOrNull()

            if (quantEInt != null && preuEInt != null ) {
                menjarsViewModel.updateEntrepa(quantEInt, preuEInt)
                    globalViewModel.obtainEPreuTotal(menjarsViewModel.updateEntrepa(quantEInt,preuEInt))
            }

            // Obtener el valor total de los menjars
            val totalMenjar = menjarsViewModel.totalMenjars()


            // Pasar el valor a GlobalViewModel
            globalViewModel.obtainMenjar(totalMenjar)

            globalViewModel.updateTotal(totalMenjar)


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
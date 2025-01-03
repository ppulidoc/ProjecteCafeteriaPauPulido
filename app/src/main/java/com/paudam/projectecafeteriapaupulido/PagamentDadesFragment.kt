package com.paudam.projectecafeteriapaupulido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.paudam.projectecafeteriapaupulido.databinding.FragmentPagamentDadesBinding


class PagamentDadesFragment : Fragment() {
    private val globalViewModel: GlobalViewModel by activityViewModels()
    private lateinit var binding: FragmentPagamentDadesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPagamentDadesBinding.inflate(inflater)

        binding.button2.setOnClickListener {
            Toast.makeText(requireContext(), "Ordre realitzada amb èxit", Toast.LENGTH_SHORT).show()
            binding.root.postDelayed({
                System.exit(0)
            }, 3000)
        }


        return binding.root
    }

}
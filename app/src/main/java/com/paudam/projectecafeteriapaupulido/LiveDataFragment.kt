package com.paudam.projectecafeteriapaupulido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.paudam.projectecafeteriapaupulido.databinding.FragmentLiveDataBinding


class LiveDataFragment : Fragment() {
    private val globalViewModel: GlobalViewModel by activityViewModels()
    private lateinit var binding: FragmentLiveDataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLiveDataBinding.inflate(inflater)

        // Observas el LiveData del total
        globalViewModel.total.observe(viewLifecycleOwner, Observer { total ->
            // Actualizas el TextView con el total
            binding.textView.text = "Total: $total"
        })

        return binding.root
    }
}
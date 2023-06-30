package com.example.task01

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.task01.databinding.FragmentLocationBinding

class LocationFragment : Fragment(R.layout.fragment_location) {
    private var binding: FragmentLocationBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLocationBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
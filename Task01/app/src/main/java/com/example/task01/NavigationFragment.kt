package com.example.task01

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.task01.databinding.FragmentNavigationBinding

class NavigationFragment : Fragment(R.layout.fragment_navigation) {
    private var binding: FragmentNavigationBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNavigationBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
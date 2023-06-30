package com.example.task01

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.task01.databinding.FragmentAnotherBinding
import com.google.android.material.snackbar.Snackbar

class AnotherFragment : Fragment(R.layout.fragment_another) {
    private var binding: FragmentAnotherBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAnotherBinding.bind(view)

        binding?.run {
            buttonMain.setOnClickListener {
                findNavController().navigate(
                    R.id.action_anotherFragment_to_mainFragment
                )
            }
        }

        val name = arguments?.getString(ARG_NAME)
        Snackbar.make(binding!!.root, name.orEmpty(), Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ARG_NAME = "ARG_NAME"

        fun createBundle(name: String) : Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_NAME, name)
            return bundle
        }
    }
}
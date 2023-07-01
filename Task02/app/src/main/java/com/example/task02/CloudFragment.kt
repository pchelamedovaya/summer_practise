package com.example.task02

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.task02.databinding.FragmentCloudBinding
import com.squareup.picasso.Picasso


class CloudFragment : Fragment(R.layout.fragment_cloud) {
    private var binding: FragmentCloudBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCloudBinding.bind(view)

        binding?.run {
            buttonMain.setOnClickListener {
                findNavController().navigate(
                    R.id.action_cloudFirstFragment_to_firstFragment
                )
            }
        }

        val id = arguments?.getInt(ARG_ID)

        Picasso.get()
            .load(id?.let { CloudRepository.getCloudById(it)?.url })
            .into(binding?.ivImage)
        binding?.textView0?.text="Id: $id"
        binding?.textView1?.text="Name: ${id?.let { CloudRepository.getCloudById(id)!!.name}}"
        binding?.textView2?.text="Description: ${id?.let { CloudRepository.getCloudById(id)!!.description}}"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ARG_ID = "ARG_ID"

        fun createBundle(id: Int) : Bundle {
            val bundle = Bundle()
            bundle.putInt(ARG_ID, id)
            return bundle
        }
    }
}

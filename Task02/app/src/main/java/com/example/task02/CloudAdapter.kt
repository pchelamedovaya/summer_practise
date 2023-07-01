package com.example.task02

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.task02.databinding.ItemCloudBinding

class CloudAdapter(
    private var list: List<Cloud>,
    private val glide: RequestManager,
    private val onItemClick: (Cloud) -> Unit,
) : RecyclerView.Adapter<CloudItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CloudItem =
        CloudItem(
            binding = ItemCloudBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            glide = glide,
            onItemClick = onItemClick
        )

    override fun onBindViewHolder(holder: CloudItem, position: Int) {
        holder.onBind(list[position])
        holder.itemView.setOnClickListener { view ->
            view.findNavController().navigate(
                R.id.action_firstFragment_to_cloudFirstFragment,
                CloudFragment.createBundle(position),
            )
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
package com.example.task02

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.example.task02.databinding.ItemCloudBinding

class CloudItem(
    private val binding: ItemCloudBinding,
    private val glide: RequestManager,
    private val onItemClick: (Cloud) -> Unit
) : ViewHolder(binding.root) {

    fun onBind(cloud: Cloud) {
        binding.run {
            tvTitle.text = cloud.name
            tvDescription.text = cloud.description

            glide
                .load(cloud.url)
                .into(ivImage)

            root.setOnClickListener {
                onItemClick(cloud)
            }
        }
    }
}
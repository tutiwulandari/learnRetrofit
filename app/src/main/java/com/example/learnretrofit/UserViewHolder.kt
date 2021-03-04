package com.example.learnretrofit

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.learnretrofit.data.ResultUsers
import com.example.learnretrofit.databinding.ItemUserBinding

class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemUserBinding.bind(view)

    fun bind(get: ResultUsers?) {
        binding.apply {
            nama.text = get?.name
            email.text = get?.email
            notelp.text = get?.phone
            val address = "${get?.address?.street}, ${get?.address?.city}, ${get?.address?.suite}, ${get?.address?.zipcode}"
            alamat.text = address
        }

    }
}

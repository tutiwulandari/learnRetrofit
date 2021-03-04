package com.example.learnretrofit.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learnretrofit.UserViewHolder
import com.example.learnretrofit.R

class UserAdapter(private val data: List<ResultUsers>?) : RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(v)
    }
    override fun getItemCount(): Int = data?.size ?: 0

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(data?.get(position))
    }

}
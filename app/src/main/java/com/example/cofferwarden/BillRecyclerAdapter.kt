package com.example.cofferwarden

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cofferwarden.databinding.RecyclerItemBinding

class BillRecyclerAdapter : RecyclerView.Adapter<BillRecyclerAdapter.BillViewHolder>() {

    inner class BillViewHolder(private val binding : RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BillViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BillViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
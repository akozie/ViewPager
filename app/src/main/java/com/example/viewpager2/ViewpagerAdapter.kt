package com.example.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class ViewpagerAdapter(var list: ArrayList<CardModel>): RecyclerView.Adapter<ViewpagerAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val item1: TextView = view.findViewById(R.id.contributors_name)
        val item2: TextView = view.findViewById(R.id.contributors_percentage)
        val item3: TextView = view.findViewById(R.id.contributors_package)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_details, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.apply {
            holder.item1.text = list[position].name
            holder.item2.text = list[position].percentage
            holder.item3.text = list[position].tag
        }
    }
}
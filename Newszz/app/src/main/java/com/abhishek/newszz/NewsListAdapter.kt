package com.abhishek.newszz

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class NewsListAdapter(private val items: ArrayList<String>): RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.itemnews,parent,false)
        return NewsViewHolder(view)
    }
    override fun getItemCount(): Int {
        return items.size
    }
    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val currentItem = items[position]
        holder.titleview.text=currentItem
    }

}
 class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
     val titleview : TextView =itemView.findViewById(R.id.title)
 }
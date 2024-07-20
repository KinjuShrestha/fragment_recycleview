package com.example.lab3_fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*

class Adapter(var data: Array<GroceryItem>) :RecyclerView.Adapter<ViewHolder>(){
    fun refreshData(newData:Array<GroceryItem>){
        data = newData
       notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grocery,parent,false)
    return ViewHolder(view)
    }

    override fun getItemCount(): Int {
     return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
   holder.groceryItem.text = data[position].name


    }

}
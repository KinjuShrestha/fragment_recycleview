package com.example.lab3_fragment

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(val view: View):RecyclerView.ViewHolder(view){
    val groceryItem:TextView = view.findViewById(R.id.textView)
}
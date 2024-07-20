package com.example.lab3_fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GroceryList : Fragment() {
   lateinit var addBtn: Button ;
    lateinit var editText: EditText ;
     var arrayOfGroceryItem: Array<GroceryItem> = arrayOf(GroceryItem("Kinju"), GroceryItem("Kinju"))




    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_grocery_list, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         addBtn = view.findViewById<Button>(R.id.addBtn)
         editText = view.findViewById<EditText>(R.id.groceryEditText)
        val adapter = Adapter(arrayOfGroceryItem)

        val recycleView: RecyclerView = view.findViewById(R.id.rv)
        recycleView.layoutManager = LinearLayoutManager(context)
        recycleView.adapter = adapter

       addBtn.setOnClickListener{
           println("addBtn is not null 123")

       }


//        addBtn.setOnClickListener{
//            arrayOfGroceryItem= arrayOfGroceryItem.plus(GroceryItem(name = editText.text.toString()))
//            adapter.refreshData(arrayOfGroceryItem)
//            println("this is innn")
//            println("array xxy: "+ arrayOfGroceryItem.size)
//            println(arrayOfGroceryItem)
//            editText.text.clear()
//        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onPause() {
        super.onPause()
    }
}

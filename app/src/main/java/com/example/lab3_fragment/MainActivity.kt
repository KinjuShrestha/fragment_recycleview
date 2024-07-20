package com.example.lab3_fragment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nextBtn = findViewById<Button>(R.id.btn1)
       // val hideBtn = findViewById<Button>(R.id.button2)
        val fragmentManager = supportFragmentManager

        nextBtn.setOnClickListener{
          val fragment= fragmentManager.findFragmentById(R.id.fragmentContainerView2)
            if(fragment is FirstFragment){
                val trans = fragmentManager.beginTransaction()
                trans.add(R.id.fragmentContainerView2,GroceryList())
                trans.addToBackStack(null)
                trans.commit()
            } else if(fragment is GroceryList){
                val trans = fragmentManager.beginTransaction()
                trans.add(R.id.fragmentContainerView2,FirstFragment())
                trans.addToBackStack(null)
                trans.commit()
            }
            else{
                val trans = fragmentManager.beginTransaction()
                trans.add(R.id.fragmentContainerView2,FirstFragment())
                trans.addToBackStack(null)
                trans.commit()
            }
        }
    }
}
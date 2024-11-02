package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.listview

//import kotlinx.android.synthetic.main.activity_main.listview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = arrayListOf<Country>( Country("England", R.mipmap.eng) ,Country("Germany", R.mipmap.de))

        val adapter = countryAdapter(this, list)
        listview.adapter = adapter

    }

}
package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.contryitem.view.imageView
import kotlinx.android.synthetic.main.contryitem.view.textView
import kotlinx.android.synthetic.main.contryitem.view.textView2



class countryAdapter(context: Context, list: ArrayList<Country>) : BaseAdapter() {

    val list = list
    val inflater : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val view = inflater.inflate(R.layout.contryitem,p2,false)

        view.textView2.text = list.get(p0).name
        view.imageView.setImageResource(list.get(p0).flagId)

        return view
    }
}
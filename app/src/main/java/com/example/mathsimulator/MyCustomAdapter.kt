package com.example.mathsimulator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdapter(var ctx:Context,var resource:Int, var Items: ArrayList<Model>): ArrayAdapter<Model>(ctx,resource,Items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(resource,null)

        val nameLectures: TextView = view.findViewById(R.id.nameL_tx)
        val aboutLectures: TextView = view.findViewById(R.id.aboutL_tx)
        val  image: ImageView = view.findViewById(R.id.imageV)

        nameLectures.text = Items[position].NameLectures
        aboutLectures.text = Items[position].AboutLectures
        image.setImageDrawable(ctx.resources.getDrawable(Items[position].Image))

        return view
    }
}
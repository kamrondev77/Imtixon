package com.example.imtixon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imtixon.R
import com.example.imtixon.model.Types

class CustomAdapter3(var context: Context, var types: ArrayList<Types>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return types.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler3, parent, false)
        return TypesViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val types1 = types[position]

        if( holder is TypesViewHolder) {

            val image1 = holder.im_view1
            val nameService = holder.tv_view1
            val discount = holder.tv_view2

            image1.setImageResource(types1.image)
            nameService.setText(types1.servicesName)
            discount.setText(types1.discount)
        }

    }

    class TypesViewHolder(var view: View): RecyclerView.ViewHolder(view) {

        var im_view1: ImageView
        var tv_view1: TextView
        var tv_view2: TextView


        init {
            im_view1 = view.findViewById(R.id.im_recyclerView3)
            tv_view1 = view.findViewById(R.id.tv_ver1)
            tv_view2 = view.findViewById(R.id.tv_ver2)
        }
    }
}
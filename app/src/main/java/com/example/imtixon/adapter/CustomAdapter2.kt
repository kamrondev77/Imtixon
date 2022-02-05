package com.example.imtixon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imtixon.MainActivity
import com.example.imtixon.R
import com.example.imtixon.model.Images
import com.example.imtixon.model.Services

class CustomAdapter2(val activity: MainActivity, var context: Context, var services: ArrayList<Services>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return services.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerviewver2, parent, false)
        return ServicesViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val service = services[position]

        if( holder is ServicesViewHolder) {

            val image1 = holder.im_view1
            val nameService = holder.tv_view1

            image1.setImageResource(service.image)
            nameService.setText(service.service)

            holder.layout_click.setOnClickListener {
                activity.openItemDetail(service)
            }
        }

    }

    class ServicesViewHolder(var view: View): RecyclerView.ViewHolder(view) {

        var im_view1: ImageView
        var tv_view1: TextView
        var layout_click = view.findViewById<LinearLayout>(R.id.lay_click)


        init {
            im_view1 = view.findViewById(R.id.im_recyclerView2)
            tv_view1 = view.findViewById(R.id.tv_hor2)
        }
    }
}
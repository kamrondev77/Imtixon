package com.example.imtixon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.imtixon.R
import com.example.imtixon.model.Images

class CustomAdapterDetail1(var context: Context, var images: ArrayList<Images>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerviewver1, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val image = images[position]

        if( holder is ImageViewHolder) {

            val image1 = holder.im_view1

            image1.setImageResource(image.image)
        }

    }

    class ImageViewHolder(var view: View): RecyclerView.ViewHolder(view) {

        var im_view1: ImageView

        init {
            im_view1 = view.findViewById(R.id.im_recyclerView1)
        }
    }
}
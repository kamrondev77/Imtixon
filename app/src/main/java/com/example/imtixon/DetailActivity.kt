package com.example.imtixon

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class DetailActivity : AppCompatActivity() {

    var context: Context? = null
    var recyclerViewHor1: RecyclerView? = null
    var recyclerViewHor2: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
    }

    fun initViews() {

        recyclerViewHor1 = findViewById(R.id.recyclerView1)
        recyclerViewHor1

    }
}
package com.example.imtixon

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imtixon.adapter.CustomAdapter1
import com.example.imtixon.adapter.CustomAdapter2
import com.example.imtixon.adapter.CustomAdapter3
import com.example.imtixon.model.Images
import com.example.imtixon.model.Services
import com.example.imtixon.model.Types

class MainActivity : AppCompatActivity() {

    var context: Context? = null
    var recyclerViewHor1: RecyclerView? = null
    var recyclerViewHor2: RecyclerView? = null
    var recyclerViewVer: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {

        context = this
        recyclerViewHor1 = findViewById(R.id.recyclerCiewHorizontal1)
        recyclerViewHor2 = findViewById(R.id.recyclerCiewHorizontal2)
        recyclerViewVer = findViewById(R.id.recyclerViewVertical)

        recyclerViewHor1!!.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerViewHor2!!.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerViewVer!!.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val images: ArrayList<Images> = java.util.ArrayList<Images>()
        images.add(Images(R.drawable.im_sample1))
        images.add(Images(R.drawable.im_sample2))
        images.add(Images(R.drawable.im_sample3))

        val services: ArrayList<Services> = java.util.ArrayList<Services>()
        services.add(Services(R.mipmap.outline_business_center_black_24dp, "Business Center"))
        services.add(Services(R.mipmap.outline_apartment_black_24dp, "Apartment"))
        services.add(Services(R.mipmap.outline_engineering_black_24dp, "Engineering"))
        services.add(Services(R.mipmap.outline_fitness_center_black_24dp, "Fitness Center"))
        services.add(Services(R.mipmap.outline_maps_home_work_black_24dp, "Maps for Housework"))
        services.add(Services(R.mipmap.outline_workspace_premium_black_24dp, "Workspace"))

        val types: ArrayList<Types> = java.util.ArrayList<Types>()

        types.add(Types(R.mipmap.outline_workspace_premium_black_24dp, "Blocchain technology", "UP TO 40% OFF"))
        types.add(Types(R.mipmap.outline_maps_home_work_black_24dp, "Apartment", "UP TO 30% OFF"))
        types.add(Types(R.mipmap.outline_engineering_black_24dp, "Engineering services", "NO DISCOUNT"))
        types.add(Types(R.mipmap.outline_fitness_center_black_24dp, "Lawyer service", "UP TO 25% OFF"))

        refreshAdapter1(images)
        refreshAdapter2(services)
        refreshAdapter3(types)
    }

    fun refreshAdapter1(images: ArrayList<Images>) {
        val adapter1 = CustomAdapter1(context!!, images)
        recyclerViewHor1!!.adapter = adapter1
    }

    fun refreshAdapter2(services: ArrayList<Services>) {
        val adapter2 = CustomAdapter2(this, context!!, services)
        recyclerViewHor2!!.adapter = adapter2
    }

    fun refreshAdapter3(types: ArrayList<Types>) {
        val adapter3 = CustomAdapter3(context!!, types)
        recyclerViewVer!!.adapter = adapter3
    }

    fun openItemDetail(service: Services) {
        var intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}
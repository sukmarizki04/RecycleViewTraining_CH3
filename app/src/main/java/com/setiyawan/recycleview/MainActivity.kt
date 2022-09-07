package com.setiyawan.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()
        arrayList.add(Model("Sukma Rizki","Universitas Malikussaleh", R.drawable.img_1))
        arrayList.add(Model("Sukma Rizki","Universitas Malikussaleh", R.drawable.user2))
        arrayList.add(Model("Sukma Rizki","Universitas Malikussaleh", R.drawable.img_1))
        arrayList.add(Model("Sukma Rizki","Universitas Malikussaleh", R.drawable.user2))
        arrayList.add(Model("Sukma Rizki","Universitas Malikussaleh", R.drawable.img_1))
        arrayList.add(Model("Sukma Rizki","Universitas Malikussaleh", R.drawable.user2))
        arrayList.add(Model("Sukma Rizki","Universitas Malikussaleh", R.drawable.img_1))
        arrayList.add(Model("Sukma Rizki","Universitas Malikussaleh", R.drawable.user2))
        arrayList.add(Model("Sukma Rizki","Universitas Malikussaleh", R.drawable.img_1))
        arrayList.add(Model("Sukma Rizki","Universitas Malikussaleh", R.drawable.user2))

        val myAdapter = MyAdapter(arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = myAdapter
    }
}
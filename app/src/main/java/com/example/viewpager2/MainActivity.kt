package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    lateinit var viewPager2: ViewPager2
    lateinit var adapter: ViewpagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val initList = CardList()

        viewPager2 = findViewById(R.id.view_page)
        adapter = ViewpagerAdapter(initList.initCardList)
        viewPager2.adapter = adapter
    }
}
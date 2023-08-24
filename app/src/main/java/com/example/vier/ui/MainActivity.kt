package com.example.vier.ui

import adapter.ViewpagerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewParent
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.vier.R
import com.example.vier.utli.ZoomOutPageTransformer
import com.google.android.material.tabs.TabLayout
import com.example.vier.ui.fragment.FirstFragment
import com.example.vier.ui.fragment.SecondFragment
import com.example.vier.ui.fragment.ThirdFragment

class MainActivity : AppCompatActivity() {
    lateinit var myAdapter:ViewpagerAdapter
    lateinit var list:ArrayList<Fragment>
    lateinit var titles:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        loadFragment()
        val vieewPager = findViewById<ViewPager>(R.id.view_pager)
        val tablayout = findViewById<TabLayout>(R.id.tablayout)
        myAdapter= ViewpagerAdapter(list,titles,supportFragmentManager)
        vieewPager.adapter=myAdapter
        tablayout.setupWithViewPager(vieewPager)
        vieewPager.setPageTransformer(true,ZoomOutPageTransformer())
    }

    private fun loadFragment() {
        list = ArrayList()
        titles= ArrayList()
        list.add(FirstFragment())
        titles.add("First")
        list.add(SecondFragment())
        titles.add("dva")
        list.add(ThirdFragment())
        titles.add("tri")

        list.add(FirstFragment())
        titles.add("First")
        list.add(SecondFragment())
        titles.add("dva")
        list.add(ThirdFragment())
        titles.add("tri")

        list.add(FirstFragment())
        titles.add("First")
        list.add(SecondFragment())
        titles.add("dva")
        list.add(ThirdFragment())
        titles.add("tri")

        list.add(FirstFragment())
        titles.add("First")
        list.add(SecondFragment())
        titles.add("dva")
        list.add(ThirdFragment())
        titles.add("tri")
    }
}
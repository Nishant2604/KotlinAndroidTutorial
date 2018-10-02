package com.nishantnischaya.kotlintutorial.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.nishantnischaya.kotlintutorial.adapters.HobbiesAdapter
import com.nishantnischaya.kotlintutorial.R
import com.nishantnischaya.kotlintutorial.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rc_view.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        rc_view.adapter = adapter
    }
}
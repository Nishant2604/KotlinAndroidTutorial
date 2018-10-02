package com.nishantnischaya.kotlintutorial.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nishantnischaya.kotlintutorial.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras

        bundle?.let{
            val msg = bundle.getString("message")

            showmessage.text = msg
        }
    }
}
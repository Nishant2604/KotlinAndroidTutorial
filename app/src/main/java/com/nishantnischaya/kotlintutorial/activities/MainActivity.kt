package com.nishantnischaya.kotlintutorial.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nishantnischaya.kotlintutorial.R
import com.nishantnischaya.kotlintutorial.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendmessage.setOnClickListener {
            val message: String = txtmessage.text.toString()

            showToast(message)
            
            val intent =  Intent(this, SecondActivity::class.java)
            intent.putExtra("message", message)
            startActivity(intent)
        }

        sharemessage.setOnClickListener{
            val message: String = txtmessage.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra("message", message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to:"))
        }

        recyclerView.setOnClickListener{
            val intent= Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}

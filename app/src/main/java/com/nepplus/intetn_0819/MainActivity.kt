package com.nepplus.intetn_0819

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener {

//            버튼이 눌리면 other activity로 이동

//            출발지 : main activity -> 도착지 : other activity

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)


        }


    }
}
package com.nepplus.intetn_0819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

//        화면에 들어오자마자 => 첨부된 데이터 있는지 확인 => 변수에 저장


        val receivedMessage = intent.getStringExtra( "message")

//        ui에 반영

       messageTxt.text = receivedMessage

    }
}
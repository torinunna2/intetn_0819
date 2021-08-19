package com.nepplus.intetn_0819

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_NICKNAME = 1000
    val REQ_FOR_PHONE = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)
        }

        sendMessageBtn.setOnClickListener {

//            전달할 내용을 변수에 담자.

            val inputMessage = messageEdt.text.toString()


//            저장한 변수를 들고 메세지 화면으로 이동

            val myIntent = Intent(this, ViewMessageActivity::class.java)
            myIntent.putExtra("message", inputMessage)
            startActivity(myIntent)


        }

        moveToOtherBtn.setOnClickListener {

//            버튼이 눌리면 other activity로 이동

//            출발지 : main activity -> 도착지 : other activity

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)


        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_NICKNAME) {

            if ( resultCode == Activity.RESULT_OK ) {

//                닉네임 가지러 가서 => 확인까지 한 상황.
//                첨부된 닉네임이 있을 것이다.

               val newNick = data?.getStringExtra("nick")

                nicknameTxt.text = newNick

            }

        }

    }

}
package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //今日の日付を取得
        fun getToday(): String {
            val date = Date()
            val format = SimpleDateFormat("yyyy年MM月dd日", Locale.getDefault())
            textView.text = format.toString()
            return format.format(date)
        }

        var hiduke = getToday()
        textView.text = hiduke
        textView.textSize = 20F

        add.setOnClickListener{
            val intent = Intent(this,AddActivity::class.java)
            startActivity(intent)
        }

    }
}
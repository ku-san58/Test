package com.example.test

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.E


class AddActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        //val EditText = syurui.text.toString()

        add_button.setOnClickListener { onAddbuttonTapped(it) }

        //戻るボタンタップ時メイン画面に戻る
        back.setOnClickListener { finish() }

    }


        //追加ボタンタップ時
        fun onAddbuttonTapped(view: View) {
            val intent = Intent(this, MainActivity::class.java)
            val EditText = syurui.text.toString()

        }


}



package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display_feed_message.*

class DisplayFeedMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_feed_message)

        btn_finish.setOnClickListener{
            val intent = Intent(this@DisplayFeedMessage,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
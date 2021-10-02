package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_admin_add_questions.*

class Admin_Add_Questions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_add_questions)

        btn_add_buddhist_q.setOnClickListener {
            val intent = Intent(this,Admin_Create_Question::class.java)
            startActivity(intent)
        }
    }

}
package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_qbuds_categories.*

class QBuds_Categories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qbuds_categories)

        btn_add_materials.setOnClickListener {
            val intent = Intent(this,Admin_Add_Materials::class.java)
            startActivity(intent)
        }

        btn_add_new_question.setOnClickListener {
            val intent = Intent(this,Admin_Add_Questions::class.java)
            startActivity(intent)
        }

        btn_show_question.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
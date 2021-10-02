package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_admin_view_material_list.*
import kotlinx.android.synthetic.main.activity_admin_view_material_list.btn_view_more
import kotlinx.android.synthetic.main.activity_viewfeedback_user.*

class Viewfeedback_user : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewfeedback_user)

        btn_view_feedback.setOnClickListener {
            val intent = Intent(this,ViewfeedbackContent::class.java)
            startActivity(intent)
        }
    }
}
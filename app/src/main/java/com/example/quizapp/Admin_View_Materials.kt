package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_admin_view_materials.*

class Admin_View_Materials : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_view_materials)

        btn_edit_material.setOnClickListener {
            val intent = Intent(this,Admin_Edit_Materials_Content::class.java)
            startActivity(intent)
        }
    }
}
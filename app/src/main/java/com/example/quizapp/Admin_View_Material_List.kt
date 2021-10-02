package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_admin_view_material_list.*

class Admin_View_Material_List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_view_material_list)

        btn_add_new_material.setOnClickListener {
            val intent = Intent(this,Admin_Add_Materials_Content::class.java)
            startActivity(intent)
        }

        btn_view_more.setOnClickListener {
            val intent = Intent(this,Admin_View_Materials::class.java)
            startActivity(intent)
        }
    }
}
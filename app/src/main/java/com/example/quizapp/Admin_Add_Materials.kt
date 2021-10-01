package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_admin_add_materials.*

class Admin_Add_Materials : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_add_materials)

        btn_add_buddhist.setOnClickListener {
            val intent = Intent(this,Admin_View_Material_List::class.java)
            startActivity(intent)
        }
    }
}
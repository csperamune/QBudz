package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_admin_edit_materials_content.*
import kotlinx.android.synthetic.main.activity_admin_view_material_list.*

class Admin_Edit_Materials_Content : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_edit_materials_content)

        val pdf: Int=0

        btn_view_more_list.setOnClickListener(View.OnClickListener {
                view: View-> val intent = Intent()
//            intent.setType("pdf/*")
            intent.type="application/pdf"
            intent.setAction(Intent.ACTION_GET_CONTENT)
            startActivityForResult(Intent.createChooser(intent,"Select PDF"),pdf)
        })

        btn_cancle.setOnClickListener {
            val intent = Intent(this,Admin_View_Materials::class.java)
            startActivity(intent)
        }
    }
}
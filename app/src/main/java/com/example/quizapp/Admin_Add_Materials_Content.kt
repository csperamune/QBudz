package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.functions.FirebaseFunctions
import kotlinx.android.synthetic.main.activity_admin_add_materials_content.*

private lateinit var firebaseDatabase: FirebaseDatabase
private lateinit var databaseReference: DatabaseReference

class Admin_Add_Materials_Content : AppCompatActivity() {

    var firebaseDatabase = FirebaseDatabase.getInstance()
    var databaseReference = firebaseDatabase.getReference("content")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_add_materials_content)

        btn_add_data.setOnClickListener {
            val topic = content_topic.text.toString()
            val subject = add_subject.selectedItem.toString()


        }
    }
}
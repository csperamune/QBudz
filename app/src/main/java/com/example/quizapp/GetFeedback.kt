package com.example.quizapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_feedbackmessage.*


class GetFeedback  : AppCompatActivity() {

    private lateinit var database : FirebaseDatabase
    private lateinit var referance : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_getfeedback)

        database = FirebaseDatabase.getInstance();
        referance = database.getReference("Users")
        getFeedback()

    }

    private fun getFeedback(){
        referance.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(p0: DataSnapshot) {
                Log.e("Cancel",p0.toString())
            }

            override fun onCancelled(p0: DatabaseError) {
                Log.e("Cancel",p0.toString())
            }
        })
    }
}
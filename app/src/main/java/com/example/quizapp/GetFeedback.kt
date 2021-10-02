package com.example.quizapp


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_getfeedback.*

class GetFeedback  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getfeedback)

        btn_display.setOnClickListener{
            val intent = Intent(this@GetFeedback,FeedbackDisplayMessage::class.java)
            startActivity(intent)
        }

//        database = FirebaseDatabase.getInstance();
//        referance = database.getReference("Users")
//        getFeedback()

//        btn_send.setOnClickListener {
////            if (editTextTextMultiLine.text.toString().isEmpty()){
////                Toast.makeText(this, "Please enter your feedback", Toast.LENGTH_SHORT).show()
////            }else{
////                val intent = Intent(this,GetFeedback::class.java)
////                startActivity(intent)
////                finish()
//            }
//        }

    }

//    private fun getFeedback(){
//        referance.addValueEventListener(object : ValueEventListener {
//            override fun onDataChange(p0: DataSnapshot) {
//                Log.e("Cancel",p0.toString())
//            }
//
//            override fun onCancelled(p0: DatabaseError) {
//                Log.e("Cancel",p0.toString())
//            }
//        })
//    }
}
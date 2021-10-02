package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_demo.*
import kotlinx.android.synthetic.main.fragment_demo.view.*

class DemoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_demo, container, false)
        val view = inflater.inflate(R.layout.fragment_demo, container, false)

        val fragmentName = arguments?.getString("fragmentName")

        rootView.fragment_name.text = fragmentName

        return rootView

       view.btn_startQuiz.setOnClickListener {
           MainActivity()
       }
        return view
    }


}

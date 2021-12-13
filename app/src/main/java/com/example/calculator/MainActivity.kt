package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buAl.setOnClickListener {
            setContentView(R.layout.activity_alphabel)
        }
        buCal.setOnClickListener {
            setContentView(R.layout.activity_calculator)
        }

    }

}
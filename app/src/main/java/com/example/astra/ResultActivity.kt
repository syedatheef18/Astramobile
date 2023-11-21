package com.example.astra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TestLooperManager
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var T:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        T=findViewById(R.id.tvv)

        val a=intent.getStringExtra("marks")

        val b= a!!.toInt()

        T.setText(a.toString())
    }
}
package com.example.astra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var b:Button
    lateinit var a: String
    lateinit var ed:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed=findViewById(R.id.ed)
        b=findViewById(R.id.atheef)

        b.setOnClickListener{
            a= ed.text.toString()
            if (a!=""){
                intent= Intent(this,MainActivity2::class.java)
                startActivity(intent)
            }
        }
    }
}
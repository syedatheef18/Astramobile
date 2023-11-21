package com.example.astra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    lateinit var option1:CheckBox
    lateinit var option2:CheckBox
    lateinit var option3:CheckBox
    lateinit var option4:CheckBox
    lateinit var next:Button
    lateinit var quit:Button
    lateinit var ques:TextView
    lateinit var marks:TextView
    var mark:Int=0
    var count:Int=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        option1=findViewById(R.id.option1)
        option2=findViewById(R.id.option2)
        option3=findViewById(R.id.option3)
        option4=findViewById(R.id.option4)
        next=findViewById(R.id.next)
        quit=findViewById(R.id.quit)
        ques=findViewById(R.id.corr)
        marks=findViewById(R.id.tv)

        option1.setOnClickListener {
            if (option2.isChecked) {
                option2.toggle()
            }
            if (option3.isChecked) {
                option3.toggle()
            }
            if (option4.isChecked) {
                option4.toggle()
            }
        }

        option2.setOnClickListener{
            if (option1.isChecked) {
                option1.toggle()
            }
            if (option3.isChecked) {
                option3.toggle()
            }
            if (option4.isChecked) {
                option4.toggle()
            }
        }

        option3.setOnClickListener{
            if (option1.isChecked) {
                option1.toggle()
            }
            if (option2.isChecked) {
                option2.toggle()
            }
            if (option4.isChecked) {
                option4.toggle()
            }
        }

        option4.setOnClickListener{
            if (option1.isChecked) {
                option1.toggle()
            }
            if (option2.isChecked) {
                option2.toggle()
            }
            if (option3.isChecked) {
                option3.toggle()
            }
        }


        next.setOnClickListener {
            if (count==1) {
                if (!option1.isChecked && option2.isChecked && !option3.isChecked && !option4.isChecked) {
                    mark += 1
                    val toast = Toast.makeText(applicationContext, "CORRECT", Toast.LENGTH_SHORT)
                    toast.show()
                }
                else{
                    val toast = Toast.makeText(applicationContext, "WRONG", Toast.LENGTH_SHORT)
                    toast.show()
                }
                toggg()
                ques.setText("Which keyword is used by method to refer to the current object that invoked it?")
                option1.setText("import")
                option2.setText("this")
                option3.setText("catch")
                option4.setText("abstract")
            }
            if (count==2) {
                if (!option1.isChecked && option2.isChecked && !option3.isChecked && !option4.isChecked) {
                    mark += 1
                    val toast = Toast.makeText(applicationContext, "CORRECT", Toast.LENGTH_SHORT)
                    toast.show()
                }
                else{
                    val toast = Toast.makeText(applicationContext, "WRONG", Toast.LENGTH_SHORT)
                    toast.show()
                }
                toggg()
                ques.setText("Which of these access specifiers can be used for an interface?")
                option1.setText("public")
                option2.setText("protected")
                option3.setText("private")
                option4.setText("All of the mentioned")
            }
            if (count==3) {
                if (option1.isChecked && !option2.isChecked && !option3.isChecked && !option4.isChecked) {
                    mark += 1
                    val toast = Toast.makeText(applicationContext, "CORRECT", Toast.LENGTH_SHORT)
                    toast.show()
                }
                else{
                    val toast = Toast.makeText(applicationContext, "WRONG", Toast.LENGTH_SHORT)
                    toast.show()
                }
                toggg()
                ques.setText("Which of the following is correct way of importing an entire package 'pkg'?")
                option1.setText("Import pkg.")
                option2.setText("import pkg.*")
                option3.setText("Import pkg.*")
                option4.setText("import pkg.")
            }
            if (count==4) {
                if (!option1.isChecked && !option2.isChecked && !option3.isChecked && option4.isChecked) {
                    mark += 1
                    val toast = Toast.makeText(applicationContext, "CORRECT", Toast.LENGTH_SHORT)
                    toast.show()
                }
                else{
                    val toast = Toast.makeText(applicationContext, "WRONG", Toast.LENGTH_SHORT)
                    toast.show()
                }
                toggg()
                ques.setText("What is the return type of Constructors?")
                option1.setText("int")
                option2.setText("float")
                option3.setText("void")
                option4.setText("None of the mentioned")
            }
            if(count==5){
                if (!option1.isChecked && !option2.isChecked && !option3.isChecked && option4.isChecked) {
                    mark += 1
                    val toast = Toast.makeText(applicationContext, "CORRECT", Toast.LENGTH_SHORT)
                    toast.show()
                }
                else{
                    val toast = Toast.makeText(applicationContext, "WRONG", Toast.LENGTH_SHORT)
                    toast.show()
                }
                toggg()
            }
            count += 1
            marks.setText("score"+mark.toString())
        }
        quit.setOnClickListener {
            intent=Intent(this,ResultActivity::class.java)
            intent.putExtra("marks",mark.toString())
            startActivity(intent)
        }

    }
    private fun toggg() {
        if (option1.isChecked) {
            option1.toggle()
        }
        if (option2.isChecked) {
            option2.toggle()
        }
        if (option3.isChecked) {
            option3.toggle()
        }
        if (option4.isChecked) {
            option4.toggle()
        }
    }
}
package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var cl: ConstraintLayout
    lateinit var btn: Button
    lateinit var edtxt: EditText
    lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cl = findViewById(R.id.cl)
        txt = findViewById(R.id.textView)
        edtxt = findViewById(R.id.editText)
        btn = findViewById(R.id.button)
        btn.setOnClickListener (object : View.OnClickListener {
            override fun onClick(p0: View?) {
                var dayOrNightStr = edtxt.text?.toString()
                when(dayOrNightStr?.toLowerCase()){
                    "day"->{val time = ChangeBackground()
                        time.changeBackground(ChangeBackground.day,cl)
                        edtxt.setTextColor(Color.BLACK)
                        txt.setTextColor(Color.BLACK)
                    }
                    "night"->{val time = ChangeBackground()
                        time.changeBackground(ChangeBackground.night,cl)
                        edtxt.setTextColor(Color.WHITE)
                        txt.setTextColor(Color.WHITE)
                    }
                }
            }

        })
    }
}
package com.example.set1tanjiawen

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isGone

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submit_btn = findViewById<Button>(R.id.btn_submit)
        submit_btn.setOnClickListener {

            val gradeText = findViewById<TextView>(R.id.textview_grade)
            val score = findViewById<EditText>(R.id.text_score)
            val mark = score.text.toString().toInt()
            val grade = "F"

            if (mark >= 80 && mark <= 100)
                gradeText.text = "Your grade is A"
            else if (mark >= 75 && mark <= 79)
                gradeText.text = "Your grade is A-"
            else if (mark >= 70 && mark <= 74)
                gradeText.text = "Your grade is B+"
            else if (mark >= 65 && mark <= 69)
                gradeText.text = "Your grade is B"
            else if (mark >= 60 && mark <= 64)
                gradeText.text = "Your grade is B-"
            else if (mark >= 55 && mark <= 59)
                gradeText.text = "Your grade is C+"
            else if (mark >= 50 && mark <= 54)
                gradeText.text = "Your grade is C"
            else
                gradeText.text = "Your grade is D"

        }

        val contact_btn = findViewById<Button>(R.id.btn_contact)
        contact_btn.setOnClickListener {

            val phoneIntent = Intent(Intent.ACTION_DIAL)
            phoneIntent.data = Uri.parse("tel:0361261600")
            startActivity(phoneIntent)
        }
    }

}
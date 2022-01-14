package com.example.unittestdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.show_data.*

class ShowData : AppCompatActivity() {
    private lateinit var name: String
    private lateinit var mobile: String

    private var number1: Int = 0
    private var number2: Int = 0
    private var sum: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show_data)

        name = intent.getStringExtra("name").toString()
        mobile = intent.getStringExtra("mobile").toString()


        addbtn.setOnClickListener {
            if (et_no_1.text != null && et_no_2.text != null) {
                number1 = et_no_1.text.toString().toInt()
                number2 = et_no_2.text.toString().toInt()

                addNumbers()
            } else {
                et_no_1.error = "Enter both numbers"
            }

        }
    }

    fun addNumbers() {

        sum = number1 + number2

        if (sum % 2 == 0) {
            textView3.text = name
            textView4.text = mobile
        } else {
            textView3.text = "Sorry Wrong Data"
            textView4.text = "1234567890"
        }
    }
}
package com.example.unittestdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var name: String
    private lateinit var mobile: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            name = edit_text_1.text.toString()
            mobile = edit_text_2.text.toString()
            validateTheInput(name, mobile)
        }

    }

    private fun validateTheInput(name: String, mobile: String) :Boolean{
        if (name.isEmpty() || mobile.isEmpty()) {
            edit_text_1.error="Enter Name and Mobile number"
            return false
        }
        if (mobile.length<10){
            edit_text_2.error="Enter 10 digit Mobile number"
            return false
        }
        if (!name.isEmpty() && !mobile.isEmpty()) {

            val intent = Intent(this, ShowData::class.java)
            intent.putExtra("name", name)
            intent.putExtra("mobile", mobile)
            startActivity(intent)
            return  true
        }
        return true
    }
}
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var continuebtn = findViewById<Button>(R.id.continue1)

        continuebtn.setOnClickListener {
            openActivity2()
        }
    }
    fun openActivity2() {
        var intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }

}

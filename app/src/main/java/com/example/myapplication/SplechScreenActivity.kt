package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplechScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splech_screen)


        var startbtn = findViewById<Button>(R.id.start)

        startbtn.setOnClickListener {
            openActivity2()
        }
    }
    fun openActivity2() {
        var intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }

}

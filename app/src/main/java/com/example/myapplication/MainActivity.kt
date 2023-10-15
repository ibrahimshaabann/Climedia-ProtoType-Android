package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler

class MainActivity : AppCompatActivity() {
    private  val mainActivitytimeout : Long = 2500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val timer = object : CountDownTimer(1000,1000){
            override fun onTick(millisUntilFinished: Long) {
            }

            override fun onFinish() {
                val mainActivity : Intent = Intent(this@MainActivity,SplechScreenActivity::class.java)
                startActivity(mainActivity)
            }
        }
        timer.start()
    }
}
package com.action.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var getStarted: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStarted=findViewById(R.id.button)

        getStarted.setOnClickListener {

           val intent =Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
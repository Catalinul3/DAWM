package com.example.zoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     /*  val buttonExit=findViewById<Button>(R.id.btn_exit)
        buttonExit.setOnClickListener{finish()}*/
    }
}
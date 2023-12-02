package com.example.my_health_companion.activites

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.my_health_companion.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        var Button1: Button = findViewById(R.id.button12)
        var textView: TextView = findViewById<TextView>(R.id.imageView6)
//        val mes1 = intent.getStringExtra("mes1")
//        val mes2 = intent.getStringExtra("mes2")
//
//        var str = "Здравствуйте, " + mes1 + " " + mes2 + "!"
//
//        textView.setText(str)


        Button1.setOnClickListener{
            val intent = Intent(this, LogActivity::class.java)
            startActivity(intent)
        }
    }
}
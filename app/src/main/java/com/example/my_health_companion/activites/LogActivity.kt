package com.example.my_health_companion.activites

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.my_health_companion.R

class LogActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_activity)
        var logButton: Button = findViewById(R.id.LogButton)
        var regButton: Button = findViewById(R.id.RegButton)

        logButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        regButton.setOnClickListener{
            val intent = Intent(this, RegActivity::class.java)
            startActivity(intent)
        }


    }


}




package com.example.my_health_companion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.my_health_companion.ui.theme.MyHealthCompanionTheme

class LogActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_activity)
        var logButton: Button = findViewById(R.id.LogButton)
        var regButton: Button = findViewById(R.id.RegButton)

        logButton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        regButton.setOnClickListener{
            val intent = Intent(this,RegActivity::class.java)
            startActivity(intent)
        }


    }


}




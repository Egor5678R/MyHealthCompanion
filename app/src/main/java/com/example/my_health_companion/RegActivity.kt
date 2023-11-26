package com.example.my_health_companion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
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

class RegActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reg_activity)
        var Button1: ImageButton = findViewById(R.id.regButton3)
        var Button2: Button = findViewById(R.id.RegButton)





        Button1.setOnClickListener{
            val intent = Intent(this,LogActivity::class.java)
            startActivity(intent)
        }

        Button2.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            val name: EditText = findViewById<EditText>(R.id.name)
            val patronymic: EditText = findViewById<EditText>(R.id.patronymic)

            val mes1 = name.text.toString()
            val mes2 = patronymic.text.toString()
            intent.putExtra("mes1", mes1)
            intent.putExtra("mes2", mes2)
            startActivity(intent)
        }
    }
}

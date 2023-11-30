package com.example.my_health_companion.activites

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat
import com.example.my_health_companion.R

class RegActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reg_activity)
        var Button1: ImageButton = findViewById(R.id.regButton3)
        var Button2: Button = findViewById(R.id.RegButton)





        Button1.setOnClickListener{
            val intent = Intent(this, LogActivity::class.java)
            startActivity(intent)
        }

        Button2.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            val firstName: EditText = findViewById<EditText>(R.id.name)

            val patronymic: EditText = findViewById<EditText>(R.id.patronymic)

            val mes1 = firstName.text.toString()
            val mes2 = patronymic.text.toString()
            intent.putExtra("mes1", mes1)
            intent.putExtra("mes2", mes2)
            startActivity(intent)
        }
    }
}

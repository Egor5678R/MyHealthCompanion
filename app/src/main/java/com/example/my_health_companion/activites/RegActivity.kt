package com.example.my_health_companion.activites

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import com.example.my_health_companion.R
import com.example.my_health_companion.backend.db.AppDatabase
import com.example.my_health_companion.backend.db.User


class RegActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reg_activity)
        var Button1: ImageButton = findViewById(R.id.regButton3)
        var Button2: Button = findViewById(R.id.RegButton)
        lateinit var context: Context


             // передача контекста активности в переменную "context"



        Button1.setOnClickListener{
            val intent = Intent(this, LogActivity::class.java)
            startActivity(intent)
        }

        Button2.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            val firstName: EditText = findViewById<EditText>(R.id.name)
            val lastName: EditText = findViewById<EditText>(R.id.lastname)
            val email: EditText = findViewById<EditText>(R.id.mailAndPhone)
            val password: EditText = findViewById<EditText>(R.id.password)

            val id: Int = 1
            val mes1 = firstName.text.toString()
            val mes2 = lastName.text.toString()
            val mes3 = email.text.toString()
            val mes4 = password.text.toString()

            val user = User(id ,mes1, mes2, mes3, mes4)
            val userDao = AppDatabase.getInstance(context).userDao()
            val users = userDao.getAllUsers()

        }
    }
}

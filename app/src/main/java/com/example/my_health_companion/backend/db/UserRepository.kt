package com.example.my_health_companion.backend.db

import com.example.my_health_companion.backend.db.User
import com.example.my_health_companion.backend.db.UserDao

class UserRepository(private val userDao : UserDao) {
    fun getUserById(id: Int): User {
        return userDao.getUserById(id)
    }
    fun insertUser(user: User){
        userDao.insertUser(user)
    }
}
package com.example.my_health_companion.backend

class UserRepository(private val userDao : UserDao) {
    fun getUserById(id: Int): User {
        return userDao.getUserById(id)
    }
    fun insertUser(user: User){
        userDao.insertAll(user)
    }
}
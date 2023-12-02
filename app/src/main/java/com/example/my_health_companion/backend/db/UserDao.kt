package com.example.my_health_companion.backend.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.my_health_companion.backend.db.User

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAllUsers(): List<User>
    @Query("SELECT * FROM users WHERE id = :id")
    fun getUserById(id: Int): User
    @Insert
    fun insertUser(user: User)
    @Delete
    fun deleteUser(user: User)
}

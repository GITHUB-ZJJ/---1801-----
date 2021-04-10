package com.example.myapplication.Code.DataBase

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.Code.Dao.UserDao

abstract class AppDatabase:RoomDatabase() {
    abstract fun userDao():UserDao
    companion object{
        private var instance:AppDatabase?=null
        @Synchronized
        fun getDatabase(context: Context):AppDatabase{
            instance?.let {
                return it
            }
            return Room.databaseBuilder(context.applicationContext,
                    AppDatabase::class.java,"app_database")
                    .build()
                    .apply {
                        instance=this
                    }
        }
    }
}
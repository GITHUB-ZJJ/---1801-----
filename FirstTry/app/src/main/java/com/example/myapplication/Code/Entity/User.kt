package com.example.myapplication.Code.Entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(indices = arrayOf(Index(value = ["userName"],unique = true)))
data class User(val userName:String,val passWord:String){
    @PrimaryKey(autoGenerate = true)
        val id:Long=0
}

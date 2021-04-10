package com.example.myapplication.Code.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CourseMessage(val Cname:String,val messageContent:String) {
    @PrimaryKey(autoGenerate = true)
        var id:Long=0
}
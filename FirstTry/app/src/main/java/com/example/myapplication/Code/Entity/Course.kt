package com.example.myapplication.Code.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Course(val cname:String,val desc:String){
    @PrimaryKey(autoGenerate = true)
        var cn:Long=1000
}
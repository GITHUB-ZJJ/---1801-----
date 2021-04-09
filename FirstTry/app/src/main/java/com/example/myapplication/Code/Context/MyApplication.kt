package com.example.myapplication.Code.Context

import android.app.Application
import android.content.Context

class MyApplication:Application() {
    companion object{
        private lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}
package com.example.myapplication.Code.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.PageLayoutBinding


class MainActivity : AppCompatActivity() {
    //private lateinit var binding:PageLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding= PageLayoutBinding.inflate(layoutInflater)
        setContentView(R.layout.page_layout)

       /* binding.btnLogin.setOnClickListener {
            intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnRegister.setOnClickListener {
            intent= Intent(this, RegisterActvity::class.java)
            startActivity(intent)
        }*/
    }
}
package com.example.myapplication.Code.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.PageLayoutBinding

class PageActivity : AppCompatActivity() {
    private lateinit var navController:NavController
    private lateinit var binding: PageLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.page_layout)
        val destinationMap= mapOf(
            R.id.courseFragment to binding.course.courseMotionLayout,
            R.id.messageFragment to binding.message.messageMotionLayout,
            R.id.accountFragment to binding.account.accountMotionLayout
        )
        navController=findNavController(R.id.fragment)
        setupActionBarWithNavController(
            navController,
            AppBarConfiguration(destinationMap.keys)
        )
        destinationMap.forEach{map->
            map.value.setOnClickListener {
                navController.navigate(map.key)
            }
        }

        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            controller.popBackStack()
            destinationMap.values.forEach{map->
                map.progress=0.001f
            }
            destinationMap[destination.id]?.transitionToEnd()

        }
    }
}
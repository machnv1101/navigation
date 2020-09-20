package com.machnv.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.machnv.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var controller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        controller = findNavController(R.id.mainNavHostFragment)
        //val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        binding.bottomNav.setupWithNavController(controller)
    }
}
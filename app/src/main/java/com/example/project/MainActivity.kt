package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNav.selectedItemId = R.id.vremya
        navController = Navigation.findNavController(this,R.id.nav_host_fragment)
        binding.bNav.setOnItemSelectedListener() {
            when(it.itemId){
                R.id.vremya ->{}
                R.id.qibla ->{}
                R.id.namaz ->{}
                R.id.dua ->{}
            }
            true
        }
    }
}
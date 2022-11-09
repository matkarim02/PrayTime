package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNav.selectedItemId = R.id.vremya
        binding.bNav.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.vremya ->{

                }
                R.id.qibla ->{}
                R.id.namaz ->{}
                R.id.dua ->{}
            }
            true
        }
    }
}
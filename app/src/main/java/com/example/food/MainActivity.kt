package com.example.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.food.databinding.ActivityAboutFoodBinding
import com.example.food.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

    binding.btnShow.setOnClickListener {
        startActivity(Intent(this, ListFoodActivity::class.java))
    }
    binding.btnAdd.setOnClickListener {
        startActivity(Intent(this, AddFoodActivity::class.java))
    }
    }
}
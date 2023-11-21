package com.example.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.food.Cache.MySharedPreference
import com.example.food.databinding.ActivityAboutFoodBinding

class AboutFoodActivity : AppCompatActivity() {
    lateinit var binding: ActivityAboutFoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val list = MySharedPreference.obektString
        val position = intent.getIntExtra("position",0)
        binding.txtName.text = list[position].name
        binding.foodProduct.text = list[position].ingredient
        binding.txtPreparationOrder.text = list[position].preparationOrder
    }
}
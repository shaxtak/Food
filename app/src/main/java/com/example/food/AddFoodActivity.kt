package com.example.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.food.Adapter.Models.Food
import com.example.food.Cache.MySharedPreference
import com.example.food.databinding.ActivityAddFoodBinding

class AddFoodActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddFoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Taom qo'shish"

        MySharedPreference.init(this)

        binding.btnSave.setOnClickListener {
            val name = binding.taomNomi.text.toString().trim()
            val products = binding.needFood.text.toString().trim()
            val preparationOrder = binding.foodPreparation.text.toString().trim()
            if (name != "" && products != "" && preparationOrder != "") {
                val list = MySharedPreference.obektString
                list.add(Food(name,products,preparationOrder))
                MySharedPreference.obektString = list
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Ma'lumot yetarli emas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
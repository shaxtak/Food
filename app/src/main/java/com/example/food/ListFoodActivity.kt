package com.example.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.food.Adapter.MyAdapter
import com.example.food.Cache.MySharedPreference
import com.example.food.databinding.ActivityListFoodBinding

class ListFoodActivity : AppCompatActivity() {
    private lateinit var myAdapter: MyAdapter
    private lateinit var binding: ActivityListFoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Barcha taomlar"
        MySharedPreference.init(this)

        myAdapter = MyAdapter(this, MySharedPreference.obektString)
        binding.listFood.adapter = myAdapter
        binding.listFood.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, AboutFoodActivity::class.java)
            intent.putExtra("position", position)
            startActivity(intent)
        }

    }
}
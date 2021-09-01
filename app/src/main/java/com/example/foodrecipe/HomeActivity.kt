package com.example.foodrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodrecipe.adapter.MainCategoryAdapter
import com.example.foodrecipe.adapter.SubCategoryAdapter
import com.example.foodrecipe.entities.Recipies

class HomeActivity : AppCompatActivity() {
    var mainCategory = ArrayList<Recipies>()
    var subCategory = ArrayList<Recipies>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}
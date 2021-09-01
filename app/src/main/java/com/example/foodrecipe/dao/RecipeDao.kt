package com.example.foodrecipe.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.foodrecipe.entities.Recipies

@Dao
interface RecipeDao {
    @get:Query("SELECT * FROM recipies ORDER BY id DESC")
    val allRecipies: List<Recipies>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipies: Recipies)
}
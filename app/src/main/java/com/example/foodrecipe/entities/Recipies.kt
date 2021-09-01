package com.example.foodrecipe.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Recipies")
data class Recipies (
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo()
    var dishName: String
) : Serializable
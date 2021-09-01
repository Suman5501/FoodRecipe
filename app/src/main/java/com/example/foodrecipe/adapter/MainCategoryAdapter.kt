package com.example.foodrecipe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodrecipe.R
import com.example.foodrecipe.entities.Recipies
import kotlinx.android.synthetic.main.item_sub_category.view.*

class MainCategoryAdapter: RecyclerView.Adapter<MainCategoryAdapter.RecipeViewHolder>() {

    var mainCategory = ArrayList<Recipies>()
    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view){

    }

    fun setData(data: List<Recipies>) {
        mainCategory = data as ArrayList<Recipies>
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main_category, parent, false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.itemView.tv_dish_name.text = mainCategory[position].dishName
    }

    override fun getItemCount(): Int {
       return mainCategory.size
    }
}
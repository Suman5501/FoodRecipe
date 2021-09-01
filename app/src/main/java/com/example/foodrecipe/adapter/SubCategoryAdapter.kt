package com.example.foodrecipe.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodrecipe.R
import com.example.foodrecipe.entities.Recipies
import kotlinx.android.synthetic.main.item_sub_category.view.*

class SubCategoryAdapter: RecyclerView.Adapter<SubCategoryAdapter.RecipeViewHolder>() {

    var ctx: Context? = null
    var subCategory = ArrayList<Recipies>()
    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view){

    }

    fun setData(data: List<Recipies>) {
        subCategory = data as ArrayList<Recipies>
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        ctx = parent.context
        return RecipeViewHolder(LayoutInflater.from(ctx).inflate(R.layout.item_sub_category, parent, false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.itemView.tv_dish_name.text = subCategory[position].dishName
    }

    override fun getItemCount(): Int {
       return subCategory.size
    }
}
package com.example.grocery

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroceryAdapter : RecyclerView.Adapter<GroceryAdapter.GroceryViewHolder>() {

    private var groceryList = emptyList<Grocery>()

    class GroceryViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val title: TextView = itemView.findViewById(R.id.title)
        val info: TextView = itemView.findViewById(R.id.info)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroceryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_grocery, parent , false)

        return GroceryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return groceryList.size
    }

    override fun onBindViewHolder(holder: GroceryViewHolder, position: Int) {
        holder.imageView.setImageResource(groceryList[position].image)
        holder.title.text = groceryList[position].title
        holder.info.text = groceryList[position].info
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Grocery>) {
        groceryList = list
        notifyDataSetChanged()
    }
}
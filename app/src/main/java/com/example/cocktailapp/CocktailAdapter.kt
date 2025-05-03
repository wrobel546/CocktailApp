package com.example.cocktailapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CocktailAdapter(
    private val cocktails: List<Cocktail>,
    private val onItemClick: (Cocktail) -> Unit
) : RecyclerView.Adapter<CocktailAdapter.CocktailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocktailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cocktail, parent, false)
        return CocktailViewHolder(view)
    }

    override fun onBindViewHolder(holder: CocktailViewHolder, position: Int) {
        val cocktail = cocktails[position]
        holder.bind(cocktail)
    }

    override fun getItemCount(): Int = cocktails.size

    inner class CocktailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val cocktailNameTextView: TextView = itemView.findViewById(R.id.cocktail_name)
        private val cocktailImageView: ImageView = itemView.findViewById(R.id.cocktail_image)

        fun bind(cocktail: Cocktail) {
            cocktailNameTextView.text = cocktail.name
            // Wczytanie obrazka (przykład)
            cocktailImageView.setImageResource(cocktail.imageResId)

            itemView.setOnClickListener {
                onItemClick(cocktail)
            }
        }
    }
}


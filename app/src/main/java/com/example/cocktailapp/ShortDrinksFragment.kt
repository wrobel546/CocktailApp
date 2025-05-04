package com.example.cocktailapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShortDrinksFragment : Fragment(R.layout.fragment_cocktail_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

        val shortDrinks = CocktailData.cocktails.filter { it.type == "Lekkie" }

        val adapter = CocktailAdapter(shortDrinks) { cocktail ->
            val intent = Intent(requireContext(), CocktailDetailActivity::class.java)
            intent.putExtra("cocktail_name", cocktail.name)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }
}

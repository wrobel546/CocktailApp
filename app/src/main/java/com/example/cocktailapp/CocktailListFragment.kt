package com.example.cocktailapp

import CocktailDetailFragment
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Toast

class CocktailListFragment : Fragment(R.layout.fragment_cocktail_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        val cocktails = CocktailData.cocktails.sortedBy { it.name }

        val adapter = CocktailAdapter(cocktails) { selectedCocktail ->
            val intent = Intent(requireContext(), CocktailDetailFragment::class.java)
            intent.putExtra("cocktail_name", selectedCocktail.name)
            startActivity(intent)
        }


        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2) // 2 kolumny
        recyclerView.adapter = adapter
    }
}

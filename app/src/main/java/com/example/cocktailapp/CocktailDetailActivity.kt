package com.example.cocktailapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CocktailDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cocktail_detail)

        if (savedInstanceState == null) {
            val cocktailName = intent.getStringExtra("cocktail_name") ?: return

            val fragment = CocktailDetailFragment.newInstance(cocktailName)
            supportFragmentManager.beginTransaction()
                .replace(R.id.detail_fragment_container, fragment)
                .commit()
        }
    }
}

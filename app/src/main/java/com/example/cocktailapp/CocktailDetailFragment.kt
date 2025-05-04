import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.cocktailapp.Cocktail
import com.example.cocktailapp.CocktailData
import com.example.cocktailapp.R

class CocktailDetailFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_cocktail_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cocktailName = arguments?.getString(ARG_COCKTAIL_NAME) ?: "Nieznany"
        val cocktail = CocktailData.cocktails.find { it.name == cocktailName }

        // Jeśli koktajl istnieje, ustawiamy jego nazwę, opis oraz składniki
        cocktail?.let {
            view.findViewById<TextView>(R.id.cocktail_name).text = it.name
            view.findViewById<TextView>(R.id.cocktail_description).text = it.description
            view.findViewById<TextView>(R.id.cocktail_ingredients).text = it.ingredients.joinToString("\n")

        }

        val imageView = view.findViewById<ImageView>(R.id.cocktail_image_large)
        cocktail?.let {
            imageView.setImageResource(it.imageResId)
        }

        if (savedInstanceState == null) {
            childFragmentManager.beginTransaction()
                .replace(R.id.timer_container, TimerFragment())
                .commit()
        }

        val fab = view.findViewById<View>(R.id.send_sms_fab)
        fab.setOnClickListener {
            cocktail?.let { cocktail ->
                val smsIntent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("smsto:") // Otwiera aplikację SMS z pustym odbiorcą
                    putExtra("sms_body", prepareSmsContent(cocktail))
                }
                try {
                    startActivity(smsIntent)
                } catch (e: ActivityNotFoundException) {
                    Toast.makeText(requireContext(), "Brak aplikacji do wysyłania SMS", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

    private fun prepareSmsContent(cocktail: Cocktail): String {
        return buildString {
            append("Składniki koktajlu ${cocktail.name}:\n")
            append(cocktail.ingredients.joinToString("\n"))
        }
    }

    companion object {
        private const val ARG_COCKTAIL_NAME = "cocktail_name"

        fun newInstance(name: String): CocktailDetailFragment {
            val fragment = CocktailDetailFragment()
            val args = Bundle()
            args.putString(ARG_COCKTAIL_NAME, name)
            fragment.arguments = args
            return fragment
        }
    }
}

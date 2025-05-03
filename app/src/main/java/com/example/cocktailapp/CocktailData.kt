package com.example.cocktailapp

data class Cocktail(
    val name: String,
    val description: String,
    val ingredients: List<String>, // Lista składników
    val imageResId: Int,
    val type: String
)

object CocktailData {
    val cocktails = listOf(
        Cocktail(
            "Mojito",
            "Wymieszaj 50 ml rumu, 1 łyżkę cukru, sok z połowy limonki, kilka listków mięty i dopełnij wodą gazowaną.",
            listOf("50 ml rumu", "1 łyżka cukru", "Sok z połowy limonki", "Kilka listków mięty", "Woda gazowana"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Hugo",
            "Połącz 100 ml prosecco (lub innego wina musującego) z 20 ml syropu z kwiatów czarnego bzu. Wyciśnij sok z jednej limonki, dodaj do koktajlu, a następnie wrzuć kilka liści świeżej mięty. Wypełnij szklankę lodem i dopełnij wodą gazowaną. Całość delikatnie wymieszaj.",
            listOf("100 ml prosecco (lub innego wina musującego)", "20 ml syropu z kwiatów czarnego bzu", "1 limonka", "Kilka liści świeżej mięty", "Woda gazowana", "Lód"),
            R.drawable.cookie,
            "Short"
        ),
                Cocktail(
            "Margarita",
            "Wstrząśnij 50 ml tequili, 25 ml likieru triple sec i 25 ml soku z limonki. Podawaj w szklance z solą na brzegu.",
            listOf("50 ml tequili", "25 ml likieru triple sec", "25 ml soku z limonki", "Sól na brzegu szklanki"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Daiquiri",
            "Połącz 50 ml białego rumu, 25 ml soku z limonki i 15 ml syropu cukrowego. Wstrząśnij i przecedź.",
            listOf("50 ml białego rumu", "25 ml soku z limonki", "15 ml syropu cukrowego"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Old Fashioned",
            "Rozpuść kostkę cukru w łyżeczce wody, dodaj 2 dash bitters i 50 ml bourbona. Wymieszaj i dodaj lód.",
            listOf("1 kostka cukru", "2 dash bitters", "50 ml bourbona", "Lód"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Pina Colada",
            "Zmiksuj 50 ml rumu, 100 ml soku ananasowego i 25 ml mleka kokosowego z lodem.",
            listOf("50 ml rumu", "100 ml soku ananasowego", "25 ml mleka kokosowego", "Lód"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Caipirinha",
            "Zgnieć limonkę z cukrem, dodaj 50 ml cachaça i lód. Wymieszaj.",
            listOf("1 limonka", "1 łyżka cukru", "50 ml cachaça", "Lód"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Mai Tai",
            "Wstrząśnij 30 ml rumu, 15 ml likieru orgeat, 15 ml likieru triple sec i sok z limonki. Podawaj z lodem.",
            listOf("30 ml rumu", "15 ml likieru orgeat", "15 ml likieru triple sec", "Sok z limonki", "Lód"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Negroni",
            "Wymieszaj 30 ml ginu, 30 ml Campari i 30 ml wermutu słodkiego. Podawaj z lodem.",
            listOf("30 ml ginu", "30 ml Campari", "30 ml wermutu słodkiego", "Lód"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Whiskey Sour",
            "Wstrząśnij 50 ml whiskey, 25 ml soku z cytryny, 15 ml syropu cukrowego. Podawaj w szklance z lodem.",
            listOf("50 ml whiskey", "25 ml soku z cytryny", "15 ml syropu cukrowego", "Lód"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Cosmopolitan",
            "Wstrząśnij 45 ml wódki, 15 ml likieru triple sec, 15 ml soku z limonki i odrobinę soku żurawinowego.",
            listOf("45 ml wódki", "15 ml likieru triple sec", "15 ml soku z limonki", "Sok żurawinowy"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Manhattan",
            "Wymieszaj 50 ml bourbonu, 20 ml wermutu słodkiego i kilka kropel angostury. Podawaj w kieliszku koktajlowym.",
            listOf("50 ml bourbonu", "20 ml wermutu słodkiego", "Kilka kropel angostury"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Bloody Mary",
            "Wymieszaj 45 ml wódki, 90 ml soku pomidorowego, sok z cytryny, kilka kropel tabasco, sól, pieprz i seler.",
            listOf("45 ml wódki", "90 ml soku pomidorowego", "Sok z cytryny", "Tabasco", "Sól", "Pieprz", "Seler"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Martini",
            "Wymieszaj 50 ml ginu i 10 ml wermutu wytrawnego. Podawaj z oliwką lub skórką cytryny.",
            listOf("50 ml ginu", "10 ml wermutu wytrawnego", "Oliwka lub skórka cytryny"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Gin Tonic",
            "Wymieszaj 50 ml ginu z 150 ml toniku. Podawaj w szklance z lodem i plasterkiem cytryny.",
            listOf("50 ml ginu", "150 ml toniku", "Lód", "Plasterek cytryny"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Tequila Sunrise",
            "Wymieszaj 50 ml tequili, 100 ml soku pomarańczowego i 10 ml grenadyny. Podawaj w wysokiej szklance.",
            listOf("50 ml tequili", "100 ml soku pomarańczowego", "10 ml grenadyny"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Black Russian",
            "Połącz 50 ml wódki i 20 ml likieru kawowego. Podawaj w szklance z lodem.",
            listOf("50 ml wódki", "20 ml likieru kawowego", "Lód"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "White Russian",
            "Połącz 50 ml wódki, 20 ml likieru kawowego i 30 ml śmietany. Podawaj w szklance z lodem.",
            listOf("50 ml wódki", "20 ml likieru kawowego", "30 ml śmietany", "Lód"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Tom Collins",
            "Połącz 50 ml ginu, 25 ml soku z cytryny, 15 ml syropu cukrowego i dopełnij wodą sodową.",
            listOf("50 ml ginu", "25 ml soku z cytryny", "15 ml syropu cukrowego", "Woda sodowa"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Aperol Spritz",
            "Wymieszaj 50 ml Aperolu, 100 ml prosecco i 50 ml wody gazowanej. Podawaj z lodem.",
            listOf("50 ml Aperolu", "100 ml prosecco", "50 ml wody gazowanej", "Lód"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Sidecar",
            "Wstrząśnij 50 ml koniaku, 25 ml likieru triple sec i 25 ml soku z cytryny. Podawaj w szklance z brzegiem w cukrze.",
            listOf("50 ml koniaku", "25 ml likieru triple sec", "25 ml soku z cytryny", "Cukier do brzegów szklanki"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "French 75",
            "Wymieszaj 30 ml ginu, 15 ml soku z cytryny, 10 ml syropu cukrowego, a następnie dopełnij szampanem.",
            listOf("30 ml ginu", "15 ml soku z cytryny", "10 ml syropu cukrowego", "Szampan"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Sazerac",
            "Połącz 50 ml żytniej whiskey, 1 łyżeczkę cukru, 2 dash bitters i kilka kropel absinthu. Wymieszaj z lodem.",
            listOf("50 ml żytniej whiskey", "1 łyżeczka cukru", "2 dash bitters", "Kilka kropel absinthu", "Lód"),
            R.drawable.cookie,
            "Short"
        ),
        Cocktail(
            "Cuba Libre",
            "Połącz 50 ml rumu, 100 ml soku z limonki i dopełnij colą. Podawaj z lodem.",
            listOf("50 ml rumu", "100 ml soku z limonki", "Kola", "Lód"),
            R.drawable.cookie,
            "Long"
        ),
        Cocktail(
            "Dark 'n' Stormy",
            "Wymieszaj 50 ml ciemnego rumu z 100 ml piwa imbirowego. Podawaj z lodem.",
            listOf("50 ml ciemnego rumu", "100 ml piwa imbirowego", "Lód"),
            R.drawable.cookie,
            "Long"
        ),
        Cocktail(
            "Bramble",
            "Wstrząśnij 40 ml ginu, 15 ml likieru jeżynowego, 10 ml soku z cytryny, a następnie dopełnij wodą gazowaną.",
            listOf("40 ml ginu", "15 ml likieru jeżynowego", "10 ml soku z cytryny", "Woda gazowana"),
            R.drawable.cookie,
            "Long"
        ),
        Cocktail(
            "Vesper",
            "Połącz 30 ml ginu, 10 ml wódki i 10 ml wermutu wytrawnego. Podawaj w kieliszku koktajlowym.",
            listOf("30 ml ginu", "10 ml wódki", "10 ml wermutu wytrawnego"),
            R.drawable.cookie,
            "Long"
        ),
        Cocktail(
            "Paloma",
            "Połącz 50 ml tequili, 100 ml soku grejpfrutowego i dopełnij wodą sodową.",
            listOf("50 ml tequili", "100 ml soku grejpfrutowego", "Woda sodowa"),
            R.drawable.cookie,
            "Long"
        ),
        Cocktail(
            "Singapore Sling",
            "Wstrząśnij 30 ml ginu, 15 ml likieru cherry, 10 ml soku z limonki i 60 ml soku ananasowego.",
            listOf("30 ml ginu", "15 ml likieru cherry", "10 ml soku z limonki", "60 ml soku ananasowego"),
            R.drawable.cookie,
            "Long"
        ),
        Cocktail(
            "Hurricane",
            "Wymieszaj 30 ml rumu, 30 ml likieru passoa, 30 ml soku z limonki, 30 ml soku pomarańczowego i 15 ml grenadyny.",
            listOf("30 ml rumu", "30 ml likieru passoa", "30 ml soku z limonki", "30 ml soku pomarańczowego", "15 ml grenadyny"),
            R.drawable.cookie,
            "Long"
        ),
        Cocktail(
            "Blue Lagoon",
            "Połącz 30 ml wódki, 30 ml likieru blue curacao, 100 ml soku cytrynowego i dopełnij wodą sodową.",
            listOf("30 ml wódki", "30 ml likieru blue curacao", "100 ml soku cytrynowego", "Woda sodowa"),
            R.drawable.cookie,
            "Long"
        ),
        Cocktail(
            "Zombie",
            "Zmiksuj 30 ml rumu, 30 ml soku ananasowego, 30 ml soku pomarańczowego, 10 ml grenadyny i 30 ml rumu dark.",
            listOf("30 ml rumu", "30 ml soku ananasowego", "30 ml soku pomarańczowego", "10 ml grenadyny", "30 ml rumu dark"),
            R.drawable.cookie,
            "Long"
        ),
        Cocktail(
            "Planter's Punch",
            "Połącz 45 ml rumu, 45 ml soku pomarańczowego, 45 ml soku ananasowego, 15 ml grenadyny i sok z limonki.",
            listOf("45 ml rumu", "45 ml soku pomarańczowego", "45 ml soku ananasowego", "15 ml grenadyny", "Sok z limonki"),
            R.drawable.cookie,
            "Long"
        )
    )
}

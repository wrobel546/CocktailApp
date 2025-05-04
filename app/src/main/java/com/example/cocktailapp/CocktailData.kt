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
            R.drawable.mojito,
            "Lekkie"
        ),
        Cocktail(
            "Hugo",
            "Połącz 100 ml prosecco (lub innego wina musującego) z 20 ml syropu z kwiatów czarnego bzu. Wyciśnij sok z jednej limonki, dodaj do koktajlu, a następnie wrzuć kilka liści świeżej mięty. Wypełnij szklankę lodem i dopełnij wodą gazowaną. Całość delikatnie wymieszaj.",
            listOf("100 ml prosecco (lub innego wina musującego)", "20 ml syropu z kwiatów czarnego bzu", "1 limonka", "Kilka liści świeżej mięty", "Woda gazowana", "Lód"),
            R.drawable.hugo,
            "Lekkie"
        ),
        Cocktail(
            "Margarita",
            "Wstrząśnij 50 ml tequili, 25 ml likieru triple sec i 25 ml soku z limonki. Podawaj w szklance z solą na brzegu.",
            listOf("50 ml tequili", "25 ml likieru triple sec", "25 ml soku z limonki", "Sól na brzegu szklanki"),
            R.drawable.margarita,
            "Mocne"
        ),
        Cocktail(
            "Daiquiri",
            "Połącz 50 ml białego rumu, 25 ml soku z limonki i 15 ml syropu cukrowego. Wstrząśnij i przecedź.",
            listOf("50 ml białego rumu", "25 ml soku z limonki", "15 ml syropu cukrowego"),
            R.drawable.daiquiri,
            "Mocne"
        ),
        Cocktail(
            "Old Fashioned",
            "Rozpuść kostkę cukru w łyżeczce wody, dodaj 2 dash bitters i 50 ml bourbona. Wymieszaj i dodaj lód.",
            listOf("1 kostka cukru", "2 dash bitters", "50 ml bourbona", "Lód"),
            R.drawable.old_fashioned,
            "Mocne"
        ),
        Cocktail(
            "Pina Colada",
            "Zmiksuj 50 ml rumu, 100 ml soku ananasowego i 25 ml mleka kokosowego z lodem.",
            listOf("50 ml rumu", "100 ml soku ananasowego", "25 ml mleka kokosowego", "Lód"),
            R.drawable.pina_colada,
            "Lekkie"
        ),
        Cocktail(
            "Caipirinha",
            "Zgnieć limonkę z cukrem, dodaj 50 ml cachaça i lód. Wymieszaj.",
            listOf("1 limonka", "1 łyżka cukru", "50 ml cachaça", "Lód"),
            R.drawable.caipirinha,
            "Mocne"
        ),
        Cocktail(
            "Mai Tai",
            "Wstrząśnij 30 ml rumu, 15 ml likieru orgeat, 15 ml likieru triple sec i sok z limonki. Podawaj z lodem.",
            listOf("30 ml rumu", "15 ml likieru orgeat", "15 ml likieru triple sec", "Sok z limonki", "Lód"),
            R.drawable.ma_tai,
            "Mocne"
        ),
        Cocktail(
            "Negroni",
            "Wymieszaj 30 ml ginu, 30 ml Campari i 30 ml wermutu słodkiego. Podawaj z lodem.",
            listOf("30 ml ginu", "30 ml Campari", "30 ml wermutu słodkiego", "Lód"),
            R.drawable.negroni,
            "Mocne"
        ),
        Cocktail(
            "Whiskey Sour",
            "Wstrząśnij 50 ml whiskey, 25 ml soku z cytryny, 15 ml syropu cukrowego. Podawaj w szklance z lodem.",
            listOf("50 ml whiskey", "25 ml soku z cytryny", "15 ml syropu cukrowego", "Lód"),
            R.drawable.whiskeysour,
            "Mocne"
        ),
        Cocktail(
            "Cosmopolitan",
            "Wstrząśnij 45 ml wódki, 15 ml likieru triple sec, 15 ml soku z limonki i odrobinę soku żurawinowego.",
            listOf("45 ml wódki", "15 ml likieru triple sec", "15 ml soku z limonki", "Sok żurawinowy"),
            R.drawable.cosmopolitan,
            "Mocne"
        ),
        Cocktail(
            "Manhattan",
            "Wymieszaj 50 ml bourbonu, 20 ml wermutu słodkiego i kilka kropel angostury. Podawaj w kieliszku koktajlowym.",
            listOf("50 ml bourbonu", "20 ml wermutu słodkiego", "Kilka kropel angostury"),
            R.drawable.manhattan,
            "Mocne"
        ),
        Cocktail(
            "Bloody Mary",
            "Wymieszaj 45 ml wódki, 90 ml soku pomidorowego, sok z cytryny, kilka kropel tabasco, sól, pieprz i seler.",
            listOf("45 ml wódki", "90 ml soku pomidorowego", "Sok z cytryny", "Tabasco", "Sól", "Pieprz", "Seler"),
            R.drawable.bloodymary,
            "Mocne"
        ),
        Cocktail(
            "Martini",
            "Wymieszaj 50 ml ginu i 10 ml wermutu wytrawnego. Podawaj z oliwką lub skórką cytryny.",
            listOf("50 ml ginu", "10 ml wermutu wytrawnego", "Oliwka lub skórka cytryny"),
            R.drawable.martini,
            "Mocne"
        ),
        Cocktail(
            "Gin Tonic",
            "Wymieszaj 50 ml ginu z 150 ml toniku. Podawaj w szklance z lodem i plasterkiem cytryny.",
            listOf("50 ml ginu", "150 ml toniku", "Lód", "Plasterek cytryny"),
            R.drawable.gintonic,
            "Lekkie"
        ),
        Cocktail(
            "Tequila Sunrise",
            "Wymieszaj 50 ml tequili, 100 ml soku pomarańczowego i 10 ml grenadyny. Podawaj w wysokiej szklance.",
            listOf("50 ml tequili", "100 ml soku pomarańczowego", "10 ml grenadyny"),
            R.drawable.tequilasunrise,
            "Mocne"
        ),
        Cocktail(
            "Black Russian",
            "Połącz 50 ml wódki i 20 ml likieru kawowego. Podawaj w szklance z lodem.",
            listOf("50 ml wódki", "20 ml likieru kawowego", "Lód"),
            R.drawable.blackrussian,
            "Mocne"
        ),
        Cocktail(
            "White Russian",
            "Połącz 50 ml wódki, 20 ml likieru kawowego i 30 ml śmietany. Podawaj w szklance z lodem.",
            listOf("50 ml wódki", "20 ml likieru kawowego", "30 ml śmietany", "Lód"),
            R.drawable.whiterussian,
            "Mocne"
        ),
        Cocktail(
            "Tom Collins",
            "Połącz 50 ml ginu, 25 ml soku z cytryny, 15 ml syropu cukrowego i dopełnij wodą sodową.",
            listOf("50 ml ginu", "25 ml soku z cytryny", "15 ml syropu cukrowego", "Woda sodowa"),
            R.drawable.tomcollins,
            "Lekkie"
        ),
        Cocktail(
            "Aperol Spritz",
            "Wymieszaj 50 ml Aperolu, 100 ml prosecco i 50 ml wody gazowanej. Podawaj z lodem.",
            listOf("50 ml Aperolu", "100 ml prosecco", "50 ml wody gazowanej", "Lód"),
            R.drawable.aperolspritz,
            "Lekkie"
        ),
        Cocktail(
            "Sidecar",
            "Wstrząśnij 50 ml koniaku, 25 ml likieru triple sec i 25 ml soku z cytryny. Podawaj w szklance z brzegiem w cukrze.",
            listOf("50 ml koniaku", "25 ml likieru triple sec", "25 ml soku z cytryny", "Cukier do brzegów szklanki"),
            R.drawable.sidecar,
            "Mocne"
        ),
        Cocktail(
            "French 75",
            "Wymieszaj 30 ml ginu, 15 ml soku z cytryny, 10 ml syropu cukrowego, a następnie dopełnij szampanem.",
            listOf("30 ml ginu", "15 ml soku z cytryny", "10 ml syropu cukrowego", "Szampan"),
            R.drawable.french75,
            "Lekkie"
        ),
        Cocktail(
            "Sazerac",
            "Połącz 50 ml żytniej whiskey, 1 łyżeczkę cukru, 2 dash bitters i kilka kropel absinthu. Wymieszaj z lodem.",
            listOf("50 ml żytniej whiskey", "1 łyżeczka cukru", "2 dash bitters", "Kilka kropel absinthu", "Lód"),
            R.drawable.sazerac,
            "Mocne"
        ),
        Cocktail(
            "Cuba Libre",
            "Połącz 50 ml rumu, 100 ml soku z limonki i dopełnij colą. Podawaj z lodem.",
            listOf("50 ml rumu", "100 ml soku z limonki", "Kola", "Lód"),
            R.drawable.cubalibre,
            "Lekkie"
        ),
        Cocktail(
            "Dark 'n' Stormy",
            "Wymieszaj 50 ml ciemnego rumu z 100 ml piwa imbirowego. Podawaj z lodem.",
            listOf("50 ml ciemnego rumu", "100 ml piwa imbirowego", "Lód"),
            R.drawable.darkstormy,
            "Mocne"
        ),
        Cocktail(
            "Bramble",
            "Wstrząśnij 40 ml ginu, 15 ml likieru jeżynowego, 10 ml soku z cytryny, a następnie dopełnij wodą gazowaną.",
            listOf("40 ml ginu", "15 ml likieru jeżynowego", "10 ml soku z cytryny", "Woda gazowana"),
            R.drawable.bramble,
            "Mocne"
        ),
        Cocktail(
            "Vesper",
            "Połącz 30 ml ginu, 10 ml wódki i 10 ml wermutu wytrawnego. Podawaj w kieliszku koktajlowym.",
            listOf("30 ml ginu", "10 ml wódki", "10 ml wermutu wytrawnego"),
            R.drawable.vesper,
            "Mocne"
        ),
        Cocktail(
            "Paloma",
            "Połącz 50 ml tequili, 100 ml soku grejpfrutowego i dopełnij wodą sodową.",
            listOf("50 ml tequili", "100 ml soku grejpfrutowego", "Woda sodowa"),
            R.drawable.paloma,
            "Lekkie"
        ),
        Cocktail(
            "Singapore Sling",
            "Wstrząśnij 30 ml ginu, 15 ml likieru cherry, 10 ml soku z limonki i 60 ml soku ananasowego.",
            listOf("30 ml ginu", "15 ml likieru cherry", "10 ml soku z limonki", "60 ml soku ananasowego"),
            R.drawable.singaporesling,
            "Mocne"
        ),
        Cocktail(
            "Hurricane",
            "Wymieszaj 30 ml rumu, 30 ml likieru passoa, 30 ml soku z limonki, 30 ml soku pomarańczowego i 15 ml grenadyny.",
            listOf("30 ml rumu", "30 ml likieru passoa", "30 ml soku z limonki", "30 ml soku pomarańczowego", "15 ml grenadyny"),
            R.drawable.hurricane,
            "Mocne"
        ),
        Cocktail(
            "Blue Lagoon",
            "Połącz 30 ml wódki, 30 ml likieru blue curacao, 100 ml soku cytrynowego i dopełnij wodą sodową.",
            listOf("30 ml wódki", "30 ml likieru blue curacao", "100 ml soku cytrynowego", "Woda sodowa"),
            R.drawable.bluelagoon,
            "Mocne"
        ),
        Cocktail(
            "Zombie",
            "Zmiksuj 30 ml rumu, 30 ml soku ananasowego, 30 ml soku pomarańczowego, 10 ml grenadyny i 30 ml rumu dark.",
            listOf("30 ml rumu", "30 ml soku ananasowego", "30 ml soku pomarańczowego", "10 ml grenadyny", "30 ml rumu dark"),
            R.drawable.zombie,
            "Mocne"
        ),
        Cocktail(
            "Planter's Punch",
            "Połącz 45 ml rumu, 45 ml soku pomarańczowego, 45 ml soku ananasowego, 15 ml grenadyny i sok z limonki.",
            listOf("45 ml rumu", "45 ml soku pomarańczowego", "45 ml soku ananasowego", "15 ml grenadyny", "Sok z limonki"),
            R.drawable.planterpunch,
            "Lekkie"
        ),
        Cocktail(
                "Bellini",
            "Połącz 100 ml soku brzoskwiniowego z 150 ml prosecco. Delikatnie wymieszaj i podawaj w kieliszku do szampana.",
            listOf("100 ml soku brzoskwiniowego", "150 ml prosecco"),
            R.drawable.bellini,
            "Lekkie"
        ),
        Cocktail(
            "Mimosa",
            "Wymieszaj 150 ml soku pomarańczowego z 100 ml szampana w kieliszku do szampana.",
            listOf("150 ml soku pomarańczowego", "100 ml szampana"),
            R.drawable.mimosa,
            "Lekkie"
        ),
        Cocktail(
            "Raspberry Collins",
            "Połącz 50 ml ginu, 25 ml soku malinowego, 20 ml soku z cytryny, cukier i dopełnij wodą gazowaną. Wymieszaj i podawaj w wysokiej szklance z lodem.",
            listOf("50 ml ginu", "25 ml soku malinowego", "20 ml soku z cytryny", "Cukier", "Woda gazowana", "Lód"),
            R.drawable.raspberrycollins,
            "Lekkie"
        ),
        Cocktail(
            "Seabreeze",
            "Wymieszaj 50 ml wódki, 120 ml soku żurawinowego i 60 ml soku grejpfrutowego. Wymieszaj i podawaj w szklance z lodem.",
            listOf("50 ml wódki", "120 ml soku żurawinowego", "60 ml soku grejpfrutowego", "Lód"),
            R.drawable.seabreeze,
            "Lekkie"
        ),
        Cocktail(
            "Gin Fizz",
            "Połącz 50 ml ginu, 25 ml soku z cytryny, 10 ml cukru, wymieszaj z lodem i dopełnij wodą gazowaną. Podawaj w wysokiej szklance.",
            listOf("50 ml ginu", "25 ml soku z cytryny", "10 ml cukru", "Woda gazowana", "Lód"),
            R.drawable.ginfizz,
            "Lekkie"
        )
    )
}
package com.kotlinproject1.app

object DummyData {
    fun getTopGames(): List<TopGames>{
        val topGames = mutableListOf<TopGames>()
        topGames.add(
            TopGames(
                poster = "001.jpg",
                title = "Halo Infinite",
                overview = "Halo Infinite is the twelfth installment in the Halo franchise, and the sixth in the main series of science fiction first-person shooters. It is the sequel to Halo 5: Guardians and the third chapter in the Reclaimer Saga sub-series that was started by Halo 4. It is also the first game powered by the completely new Slipspace engine developed by Microsoft.",
                genre = "Action, Shooter, Adventure",
                rating = "13+"
            ),
        )

        topGames.add(
            TopGames(
                poster = "002.jpg",
                title = "Forza Horizon 5",
                overview = "Your Ultimate Horizon Adventure awaits! Explore the vibrant and ever-evolving open world landscapes of Mexico with limitless, fun driving action in hundreds of the world’s greatest cars.\n" +
                        "Explore a world of striking contrast and beauty. Discover living deserts, lush jungles, historic cities, hidden ruins, pristine beaches, vast canyons and a towering snow-capped volcano.\n" +
                        "Immerse yourself in a deep campaign with hundreds of challenges that reward you for engaging in the activities you love. Meet new characters and choose the outcomes of their Horizon Story missions.\n" +
                        "Take on awe-inspiring weather events like towering dust storms and intense tropical storms as Mexico’s unique, dynamic seasons change the world every week. Keep coming back for new events, challenges, collectibles, and rewards, and new areas to explore.\n" +
                        "Team up with other players and enter the Horizon Arcade for a continuing series of fun, over-the-top challenges that keep you and your friends in the action and having fun with no menus, loading screens or lobbies.\n" +
                        "Create your own expressions of fun with the new EventLab gameplay toolset including custom races, challenges, stunts, and new game modes. Customize your cars in more ways than ever before. Use the Gift Drops feature to share your custom creations.",
                genre = "Action, Adventure, Sports, Racing",
                rating = "0+"
                ),
        )

        topGames.add(
            TopGames(
                poster = "003.jpg",
                title = "Resident Evil : Village",
                overview = "Experience survival horror like never before in the eighth major installment in the storied Resident Evil franchise - Resident Evil Village. Set a few years after the horrifying events in the critically acclaimed Resident Evil 7 biohazard, the all-new storyline begins with Ethan Winters and his wife Mia living peacefully in a new location, free from their past nightmares. Just as they are building their new life together, tragedy befalls them once again.",
                genre = "Action, Adventure",
                rating = "Not Rated",
            ),
        )

        topGames.add(
            TopGames(
                poster = "004.jpg",
                title = "Valheim",
                overview = "Valheim is a game about exploring a huge fantasy world inspired by norse mythology and viking culture. You start your adventure at the relatively peaceful center of Valheim. The further from the center you travel, the more challenging the world becomes. But you will also find more valuable materials that you can use to craft deadlier weapons and sturdier armor. You will also build your own viking strongholds and outposts all over the world. Eventually you will build a mighty longship and sail the great oceans in search of exotic lands … but be wary of sailing too far...",
                genre = "Action, Adventure, Indie",
                rating = "Not Rated",
            ),
        )

        topGames.add(
            TopGames(
                poster = "005.jpg",
                title = "It Takes Two",
                overview = "Bring your favorite co-op partner and together step into the shoes of May and Cody. As the couple is going through a divorce, through unknown means their minds are transported into two dolls which their daughter, Rose, made to represent them. Now they must reluctantly find a way to get back into their bodies, a quest which takes them through the most wild, unexpected and fantastical journey imaginable.",
                genre = "Action, Adventure, Puzzle, Platformer",
                rating = "10+",
            ),
        )
        return topGames
    }

    fun getNewGames(): List<NewGames>{
        val newGames = mutableListOf<NewGames>()
        newGames.add(
            NewGames(
                poster = "010.jpg",
                title = "Uncharted: Legacy of Thieves Collection",
                overview = "Seek your fortune and leave your mark on the map in the UNCHARTED: Legacy of Thieves Collection. Uncover the thrilling cinematic storytelling and the largest blockbuster action set pieces in the UNCHARTED franchise, packed with all the wit, cunning, and over the top moments of the beloved thieves – Nathan Drake and Chloe Frazer.",
                genre = "Action, Adventure",
                rating = "13+",
            )
        )

        newGames.add(
            NewGames(
                poster = "011.jpg",
                title = "Dying Light 2 Stay Human",
                overview = "Dying Light 2 brings to life a unique post-apocalyptic vision of the Modern Dark Ages - a brutal, bleak and unforgiving reality where you are as likely to perish at the hand of a human as you are by the infected. In this exhausted world, your quick thinking, exceptional parkour abilities and brutal combat skills are the only things that let you dive into darkness and emerge alive. Make morally grey decisions and witness how they impact the world at multiple levels, shape the transformation of the City, and ultimately decide its fate.",
                genre = "Action, Adventure, RPG",
                rating = "Not Rated",
            )
        )

        newGames.add(
            NewGames(
                poster = "012.jpg",
                title = "Not For Broadcast",
                overview = "You only came in to clean the studio but now you’ve ended up at the helm of the National Nightly News as a radical government wins in a landslide. What could possibly go wrong?\n" +
                        "But when every decision has dark consequences, will you fall in line and do as you’re told or fight back?\n" +
                        "Take control of the shots. Pick the ads. Censor the language. You decide what the public get to see and what’s Not For Broadcast.\n" +
                        "Vision mix 4 camera feeds in a completely unique gameplay mechanic that puts you in charge of a live news broadcast.\n" +
                        "Choose the headlines as the stories spiral in response to your decisions\n" +
                        "Make far-reaching choices in a rich, alternate 1980’s dystopian world that has to be seen to be believed...",
                genre = "Adventure, Simulation, Indie",
                rating = "Not Rated",
            )
        )

        newGames.add(
            NewGames(
                poster = "013.jpg",
                title = "Nobody Saves the World",
                overview = "Transform from a featureless nobody into a SLUG, a GHOST, a DRAGON, and MORE in this new take on Action RPGs from the creators of Guacamelee!\n" +
                        "\n" +
                        "Complete quests to discover and swap between 15+ varied and distinct Forms. Mix and match abilities in unexpected ways to unlock and complete even MORE challenging quests. Explore a vast overworld - on your own or with a friend online - while clearing shape-shifting dungeons in an effort to stop The Calamity and SAVE THE WORLD!.",
                genre = "Action, Adventure, RPG, Indie",
                rating = "13+",
            )
        )

        newGames.add(
            NewGames(
                poster = "014.jpg",
                title = "Sifu",
                overview = "Is one life enough to have Kung Fu?\n" +
                        "In Sifu, you play a young Kung-Fu student on a path of vengeance.\n" +
                        "Running after shadows from his past, one against all, he will have to draw deep into his unique mastery of Pak-Mei Kung-Fu to prevail.",
                genre = "Action, Fighting",
                rating = "17+",
            )
        )
        return newGames
    }
}
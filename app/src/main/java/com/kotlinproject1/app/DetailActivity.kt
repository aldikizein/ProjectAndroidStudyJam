package com.kotlinproject1.app

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlinproject1.app.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private var topGames: TopGames? = null
    private var newGames: NewGames? = null

    companion object{
        const val TOPGAMES_EXTRA = "topgames_extra"
        const val NEWGAMES_EXTRA = "newgames_extra"
        @JvmStatic
        fun start(context: Context, data: TopGames) {
            val starter = Intent(context, DetailActivity::class.java)
                .putExtra(TOPGAMES_EXTRA, data)
            context.startActivity(starter)
        }

        @JvmStatic
        fun start(context: Context, data: NewGames) {
            val starter = Intent(context, DetailActivity::class.java)
                .putExtra(NEWGAMES_EXTRA, data)
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initIntent()
        if(topGames != null){
            settopgames(topGames!!)
        }else{
            setnewgames(newGames!!)
        }
    }

    private fun settopgames(topGames: TopGames){
        with(binding){
            posterTopGames0.setImageResource(R.drawable.ic_baseline_arrow_circle_up_24)
            judul.text = topGames.title
            overview.text = topGames.overview
            genre.text = topGames.genre
            rating.text = topGames.rating
        }
    }

    private fun setnewgames(newgames: NewGames){
        with(binding){
            posterTopGames0.setImageResource(R.drawable.ic_baseline_arrow_circle_up_24)
            judul.text = newgames.title
            overview.text = newgames.overview
            genre.text = newgames.genre
            rating.text = newgames.rating
        }
    }

    private fun initIntent(){
        topGames = intent?.getParcelableExtra(TOPGAMES_EXTRA)
        newGames = intent?.getParcelableExtra(NEWGAMES_EXTRA)
    }
}
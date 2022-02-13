package com.kotlinproject1.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlinproject1.app.databinding.ActivityMainBinding
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            bnvMain.apply{
                setOnItemSelectedListener {
                    val fragment: Fragment = when (it.itemId) {
                        R.id.menuTopGames -> {
                            TopGamesFragment.newInstance()
                        }
                        R.id.menuNewestGames -> {
                            NewGamesFragment.newInstance()

                        }
                        else -> throw IllegalStateException("Menu Item ID Unknown")
                    }
                    supportFragmentManager.beginTransaction().replace(R.id.mainContainer, fragment).commit()
                    true
                }

                selectedItemId = R.id.menuTopGames
            }


        }
    }
}
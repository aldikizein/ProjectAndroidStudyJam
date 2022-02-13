package com.kotlinproject1.app

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopGames(
    val poster: String,
    val title: String,
    val overview: String,
    val genre : String,
    val rating : String,
): Parcelable

package com.stu71557.simplenavigation.models

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes

/**
 * The @DrawableRes annotation on the bannerResId
 * parameter Denotes that an integer parameter,
 * field or method return value is expected to be a drawable resource reference
 */
data class Movie(
    val id: Int,
    val title: String,
    @DrawableRes val posterResId: Int,
    val starring: String,
    val description: String,
    val runningTime: String,
    val maxSeats: Int = (0..15).random() //generates maximum random seats from 1 to 15
)

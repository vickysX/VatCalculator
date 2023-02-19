package com.example.vatcalculator.model

import androidx.annotation.StringRes

data class Country(
    @StringRes val countryName : Int,
    val standardRate : Double,
    val reducedRate : Double
)

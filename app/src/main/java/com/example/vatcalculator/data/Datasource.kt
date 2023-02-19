package com.example.vatcalculator.data

import com.example.vatcalculator.R
import com.example.vatcalculator.model.Country

object Datasource {
    fun loadCountries() : List<Country> {
        return listOf(
            Country(R.string.france, 0.2, 0.1),
            Country(R.string.it, 0.22, 0.1),
            Country(R.string.spain, 0.21, 0.1),
            Country(R.string.nl, 0.21, 0.09),
            Country(R.string.luxembourg, 0.17, 0.08),
            Country(R.string.portugal, 0.23, 0.13),
            Country(R.string.belgium, 0.21, 0.12),
            Country(R.string.germany, 0.19, 0.07),
            Country(R.string.uk, 0.2, 0.05),
            Country(R.string.ch, 0.077, 0.025)
        )
    }
}
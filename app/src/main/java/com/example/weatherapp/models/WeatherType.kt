package com.example.weatherapp.models

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.weatherapp.R
import com.example.weatherapp.ui.theme.RainyGradient
import com.example.weatherapp.ui.theme.SnowyGradient
import com.example.weatherapp.ui.theme.StormyGradient
import com.example.weatherapp.ui.theme.SunnyGradient

enum class WeatherType(
    val displayName: String,
    @DrawableRes val capybaraRes: Int,
    val gradient: List<Color>
) {
    SUNNY("Sunny", R.drawable.capy_sunny, SunnyGradient),
    RAINY("Rainy", R.drawable.capy_rainy, RainyGradient),
    THUNDER("Thunder", R.drawable.capy_thunder, StormyGradient),
    SNOWY("Snowy", R.drawable.capy_snow, SnowyGradient)
}
package com.example.weatherapp.models

data class DailyForecast(
    val date: String,
    val type: WeatherType,
    val high: Int,
    val low: Int,
    val summary: String
)
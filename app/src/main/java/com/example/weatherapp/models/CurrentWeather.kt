package com.example.weatherapp.models

data class CurrentWeather(
    val city: String,
    val temp: Int,
    val feelsLike: Int,
    val condition: String,
    val windDirection: String,
    val windKph: Int,
    val type: WeatherType
)

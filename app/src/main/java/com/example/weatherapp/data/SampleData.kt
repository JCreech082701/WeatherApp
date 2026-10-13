// Will be using this before assignment 2 where I will use an API to get actual data
package com.example.weatherapp.data

import com.example.weatherapp.models.CurrentWeather
import com.example.weatherapp.models.DailyForecast
import com.example.weatherapp.models.WeatherType

object SampleData {
    val current = CurrentWeather(
        city = "Halifax, Nova Scotia",
        temp = 6,
        feelsLike = 2,
        condition = "Light Rain",
        windDirection = "SW",
        windKph = 18,
        type = WeatherType.RAINY
    )

    val daily = listOf(
        DailyForecast(
            "Mon, Oct 12", WeatherType.RAINY, 10, 3,
            "Heavy rain. Chance of rain: 76%. Max winds of 41kph. Humidity at a high of 96%."
        ),
        DailyForecast(
            "Tues, Oct 13", WeatherType.SUNNY, 15, 3,
            "Mostly Sunny. Max winds of 32kph. Humidity at a high of 84%"
        ),
        DailyForecast("Wed, Oct 14", WeatherType.THUNDER, 13, 6,
            "Thunderstorms very likely to last all day. Chance of rain: 60%. Max winds of 55kph. Humidity at a high of 90%."
        ),
        DailyForecast(
            "Thurs, Oct 15", WeatherType.SNOWY, 1, -4,
            "Light snow. Chance of snow: 40%. Max winds of 25kph. Humidity at a high of 89%."
        ),
        DailyForecast(
            "Fri, Oct 16", WeatherType.SUNNY, 7, -1,
            "Sunny periods after snow yesterday. Max winds of 21kph. Humidity at a high of 88%."
        ),
        DailyForecast(
            "Sat, Oct 17", WeatherType.SUNNY, 8, 2,
            "Mostly sunny. Max winds of 22kph. Humidity at a high of 83%."
        ),
        DailyForecast(
            "Sun, Oct 18", WeatherType.RAINY, 9, 4,
            "Scattered Showers. Chance of rain: 55%. Max winds of 30kph. Humidity at a high of 92%"
        )
    )
}


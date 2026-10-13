package com.example.weatherapp.ui.screens

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.weatherapp.models.CurrentWeather
import com.example.weatherapp.ui.components.WeatherCard
import com.example.weatherapp.ui.theme.TextSoft

@Composable
fun CurrentScreen(current: CurrentWeather, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp)
    ) {
        Image(
            painter = painterResource(id = current.type.capybaraRes),
            contentDescription = "Capybara for ${current.type.displayName} weather",
            modifier = Modifier.size(240.dp)
        )

        Spacer(Modifier.height(16.dp))

        Text(current.condition, style = MaterialTheme.typography.titleLarge)
        Text("${current.temp}°C", style = MaterialTheme.typography.displayLarge)

        Spacer(Modifier.height(24.dp))

        WeatherCard(modifier = Modifier.fillMaxWidth()) {
            DetailRow("Feels like", "${current.feelsLike}°C")
            Spacer(Modifier.height(8.dp))
            DetailRow("Wind", "${current.windDirection} ${current.windKph} kph")
        }
    }
}

@Composable
private fun DetailRow(label: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(label, style = MaterialTheme.typography.bodyLarge, color = TextSoft)
        Text(value, style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.SemiBold)
    }
}
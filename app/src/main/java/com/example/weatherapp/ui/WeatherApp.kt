package com.example.weatherapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.weatherapp.data.SampleData
import com.example.weatherapp.ui.screens.CurrentScreen
import com.example.weatherapp.ui.screens.DailyScreen
import com.example.weatherapp.ui.theme.TextWhite

@Composable
fun WeatherApp() {
    var selectedTab by rememberSaveable { mutableStateOf(0) }
    val current = SampleData.current

    Scaffold(
        modifier = Modifier.background(Brush.verticalGradient(current.type.gradient)),
        containerColor = Color.Transparent,
        contentColor = TextWhite,

        // Topbar will be just Nova Scotia
        topBar = {
            Text(
                text = current.city,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .statusBarsPadding()
                    .padding(16.dp)
            )
        },

        // Bottombar will be Now & Daily
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Now") },
                    label = { Text("Now") }
                )
                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Daily") },
                    label = { Text("Daily") }
                )
            }
        }
    ) { innerPadding ->
        if (selectedTab == 0) {
            CurrentScreen(current, Modifier.padding(innerPadding))
        } else {
            DailyScreen(SampleData.daily, Modifier.padding(innerPadding))
        }
    }
}

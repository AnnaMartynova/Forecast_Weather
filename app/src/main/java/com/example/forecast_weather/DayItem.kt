package com.example.forecast_weather

data class DayItem(
    val citi: String,
    val time: String,
    val condition: String,
    val imageUrl: String,
    val currentTemp: String,
    val minTemp: String,
    val maxTemp: String
)

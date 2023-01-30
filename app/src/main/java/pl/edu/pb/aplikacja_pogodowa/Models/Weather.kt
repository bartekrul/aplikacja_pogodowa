package pl.edu.pb.aplikacja_pogodowa.Models

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)
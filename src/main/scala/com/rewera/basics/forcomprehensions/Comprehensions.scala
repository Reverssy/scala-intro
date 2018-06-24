package com.rewera.basics.forcomprehensions

object Comprehensions extends App {
  trait WeatherType
  case object Rainy extends WeatherType
  case object Cloudy extends WeatherType
  case object Sunny extends WeatherType

  case class Forecast(location: String, weather: WeatherType)

  val eveningForecast = Seq(
    Forecast("London", Rainy),
    Forecast("Paris", Cloudy),
    Forecast("Cracow", Rainy),
    Forecast("Dubrovnik", Sunny))

  val rainyPlaces = for ( forecast <- eveningForecast if forecast.weather == Rainy || forecast.weather == Cloudy )
    yield forecast.location

  rainyPlaces.foreach(location => println(location))

}

package com.rewera.basics.forcomprehensions

trait WeatherType
case object Rainy extends WeatherType
case object Cloudy extends WeatherType
case object Sunny extends WeatherType


case class Forecast(location: String, weather: WeatherType)

object Comprehensions {
  val eveningForecast = Seq(
    Forecast("London", Rainy),
    Forecast("Paris", Cloudy),
    Forecast("Cracow", Rainy),
    Forecast("Dubrovnik", Sunny)
  )

  val rainyPlaces = for(
    forecast <- eveningForecast if forecast.weather == Rainy || forecast.weather == Cloudy
  ) yield forecast.location

  def main(args: Array[String]): Unit = {
    rainyPlaces.foreach(location => println(location))
    rainyPlaces.foreach(println)
    rainyPlaces.foreach(println(_))
  }
}

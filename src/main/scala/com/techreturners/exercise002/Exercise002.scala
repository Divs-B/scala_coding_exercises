package com.techreturners.exercise002

class Exercise002 {
  val cityToCheck: String = "Manchester"

  def isFromManchester(person: Person): Boolean = person.city.contentEquals(cityToCheck)

  def canWatchFilm(person: Person, ageLimit: Int): Boolean = person.ageLimit > ageLimit


}

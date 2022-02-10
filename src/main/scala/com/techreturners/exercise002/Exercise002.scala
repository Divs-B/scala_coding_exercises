package com.techreturners.exercise002

class Exercise002 {
  val cityToCheck: String = "Manchester"
  val ageLimitToCheck: Int = 15

  def isFromManchester(person: Person): Boolean = person.city.contentEquals(cityToCheck)

  def canWatchFilm(person: Person, ageLimit: Int): Boolean = person.ageLimit > ageLimitToCheck


}

package com.techreturners.exercise002

class Exercise002 {
  val cityToCheck:String = "Manchester"
  val ageLimitToCheck: Int = 15
  def isFromManchester(person: Person): Boolean = if(person.city.contentEquals(cityToCheck)) true else false

  def canWatchFilm(person: Person, ageLimit: Int): Boolean = if(person.ageLimit>ageLimitToCheck) true else false


}

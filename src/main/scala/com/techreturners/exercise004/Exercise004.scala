package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime, LocalTime, Month}

class Exercise004(var dateTime: LocalDateTime) {

  def this(dateOnly: LocalDate) {
    this(LocalDateTime.of(dateOnly, LocalTime.of(00, 00)))
  }

  //override def LocalDateTime: LocalDateTime = LocalDateTime.

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight

  def getDateTimeWithGigaSecond: LocalDateTime = LocalDateTime.of(dateTime.getYear,
    dateTime.getMonth,
    dateTime.getDayOfMonth,
    dateTime.getHour,
    dateTime.getMinute,
    dateTime.getSecond).plusDays(11574).plusHours(1).plusMinutes(46).plusSeconds(40)


}

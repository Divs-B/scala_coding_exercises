package com.techreturners.exercise001

import scala.collection.immutable.{AbstractSeq, LinearSeq}
import scala.collection.mutable.ArrayBuffer
import scala.math.BigDecimal.RoundingMode

class Exercise001 {

  // Scala methods defined in various styles
  // Notice how the IDE identifies the return type even if
  // we don't specify it in the code
  // https://docs.scala-lang.org/tour/basics.html

  def capitalizeWord(word: String): String = word.substring(0,1).toUpperCase()+word.substring(1,word.length)

  def generateInitials(firstName: String, lastName: String) = firstName.substring(0,1)+"."+lastName.substring(0,1)

  def addVat(initialPrice: Double, interestRate: Double) : Double = BigDecimal(((initialPrice*interestRate)/100 + initialPrice)).setScale(2, RoundingMode.HALF_EVEN).doubleValue

  def reverse(sentence: String) : String = sentence.reverse

  /**
   * Here we show using a Scala sequence which is a type of collection
   * https://alvinalexander.com/scala/seq-class-methods-examples-syntax/
   *
   * @param users A collection of users
   * @return
   */
  def countLinuxUsers(users: Seq[User]): Int =
  {
    // Add your code here
    var counts: Int = 0
    if(users != null){
      for( i <- 1 to users.length-1) {
        if (users(i).osType == "Linux") {
          counts += 1
        } else
          counts = 0
      }
    }
    counts
  }

}

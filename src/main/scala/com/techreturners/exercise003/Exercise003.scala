package com.techreturners.exercise003

class Exercise003 {

  @throws("UnsupportedOperationException")
  def getIceCreamCode(iceCreamFlavour: String): Int = iceCreamFlavours.indexOf(iceCreamFlavour)

  @throws("UnsupportedOperationException") /*Assuming if array is empty might throw unsupported exception hence defining as mutable arraybuffer */
  def iceCreamFlavours: Array[String] = scala.collection.mutable.ArrayBuffer("Pistachio",
    "Raspberry Ripple",
    "Vanilla",
    "Mint Chocolate Chip",
    "Chocolate",
    "Mango Sorbet"
  ).toArray


}

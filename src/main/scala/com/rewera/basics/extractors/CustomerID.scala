package com.rewera.basics.extractors

object CustomerID {
  var counter: Int = 0

  def apply(name: String): String = {
    counter += 1
    s"$name--$counter"
  }

  def unapply(customerName: String): Option[String] = {
    val nameAndID = customerName.split("--")
    if (nameAndID.tail.nonEmpty) Some(nameAndID.head) else None
  }

  def main(args:Array[String]): Unit = {
    val customer1 = CustomerID("Maciek")
    println(customer1)
    val CustomerID(name) = customer1
    println(name)

    customer1 match {
      case CustomerID(nam) => println(nam)
      case _ => println("Could not extract a name")
    }
  }
}

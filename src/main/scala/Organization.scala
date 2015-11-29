package com.example
import scala.collection.mutable.ListBuffer

class Organization(val name: String) {
   val members = new ListBuffer[Person]()
}

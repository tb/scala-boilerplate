package com.example

object Example {
  def main(args: Array[String]) {
    val person = new Person("Tom")

    println(person.say("Hello!"))
  }
}
package com.example

class Person(val name: String, val github: String) {
  def this(name: String) = this(name, null)

  def say(message: String): String = {
    s"$name: $message"
  }
}

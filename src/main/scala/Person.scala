package com.example

class Person(val name: String) {
  def say(message: String): String = {
    s"$name: $message"
  }
}

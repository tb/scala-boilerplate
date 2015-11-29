package com.example

class Person(var firstName: String, var lastName: String) {
  def fullName: String = s"$firstName $lastName"

  def fullName_=(fullName: String) = {
    val parts = fullName.split(" ")
    firstName = parts(0)
    lastName = parts(1)
  }

  def greet: String = this.greet(false)

  def greet(formal: Boolean): String = {
    if (formal)
      s"Hello, my name is $fullName."
    else
      s"Hi, I'm $firstName!"
  }
}

class Developer(val first: String, val last: String) extends Person(first, last) {
  override def greet: String = this.greet(false)

  override def greet(formal: Boolean): String = {
    if (formal)
      s"Hello, my name is $fullName. I am developer."
    else
      s"Hi, I'm $firstName!"
  }
}

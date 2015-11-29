import com.example._
import org.scalatest._

class PersonSpec extends FlatSpec with Matchers {
  val person = new Person("Tomasz", "Bak")

  it should "get full name" in {
    person.fullName should equal("Tomasz Bak")
  }

  it should "set full name" in {
    val person = new Person("", "")
    person.fullName = "Martin Odersky"
    person.fullName should equal("Martin Odersky")
  }

  it should "greet" in {
    person.greet should equal("Hi, I'm Tomasz!")
  }

  it should "greet formally" in {
    person.greet(true) should equal("Hello, my name is Tomasz Bak.")
  }
}

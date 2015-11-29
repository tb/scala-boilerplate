import com.example._
import org.scalatest._

class DeveloperSpec extends FlatSpec with Matchers {
  val developer = new Developer("Tomasz", "Bak")

  it should "get full name" in {
    developer.fullName should equal("Tomasz Bak")
  }

  it should "set full name" in {
    val developer = new Person("", "")
    developer.fullName = "Martin Odersky"
    developer.fullName should equal("Martin Odersky")
  }

  it should "greet" in {
    developer.greet should equal("Hi, I'm Tomasz!")
  }

  it should "greet formally" in {
    developer.greet(true) should equal("Hello, my name is Tomasz Bak.")
  }
}

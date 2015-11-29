import com.example._
import org.scalatest._

class DeveloperSpec extends FlatSpec with Matchers {
  val developer = new Developer("Tomasz", "Bak")

  it should "greet" in {
    developer.greet should equal("Hi, I'm Tomasz!")
  }

  it should "greet formally" in {
    developer.greet(true) should equal("Hello, my name is Tomasz Bak. I am developer.")
  }
}

import com.example._
import org.scalatest._

class PersonSpec extends FlatSpec with Matchers {
  var person = new Person("Tom")

  it should "have name 'Tom'" in {
    person.name should equal("Tom")
  }

  it should "say 'Hello!'" in {
    person.say("Hello!") should equal ("Tom: Hello!")
  }
}

import com.example._
import org.scalatest._

class PersonSpec extends FlatSpec with Matchers {
  var person = new Person("Tom", "tb")

  it should "have name 'Tom'" in {
    person.name should equal("Tom")
  }

  it should "have github 'tb'" in {
    person.github should equal("tb")
  }

  it should "say 'Hello!'" in {
    person.say("Hello!") should equal ("Tom: Hello!")
  }
}

import com.example._
import org.scalatest._

class OrganizationSpec extends FlatSpec with Matchers {
  var organization = new Organization("Scala User Group")

  it should "have name" in {
    organization.name should equal("Scala User Group")
  }

  it should "have members" in {
    val tom = new Developer("Tomasz", "Bak")
    organization.members += tom
    organization.members should contain(tom)
  }
}

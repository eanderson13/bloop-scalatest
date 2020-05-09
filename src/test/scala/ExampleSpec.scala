import org.scalatest.{FlatSpec, Matchers}

class ExampleSpec extends FlatSpec with Matchers {

  "The example" should "be an example" in {
    Example.example shouldBe "example"
  }
}
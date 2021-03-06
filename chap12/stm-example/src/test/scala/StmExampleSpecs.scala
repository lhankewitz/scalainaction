
import org.specs2._
import org.specs2.mutable.Specification
import stmexample.StmExample._

class StmExampleSpecs extends Specification {

  "Atomic operations in composition" should {
    "be atomic" in {
      swap("service1")
      ref1.get.contains("service1") must beEqualTo(false)
      ref2.get.get("service1") must beEqualTo(Some(10))
    }
    "rollback on exception" in {
      swap("service3")
      ref1.get.contains("service3") must beEqualTo(true)
      ref2.get.contains("service3") must beEqualTo(false)
    }
  }
}
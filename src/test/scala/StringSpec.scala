import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

object StringSpec extends Properties("String") {
  property("reverse") = forAll { (v: String) => v.reverse.reverse == v }
  property("concat")  = forAll { (a: String, b: String) => (a + b).endsWith(b)}
}
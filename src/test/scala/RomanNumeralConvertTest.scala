import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
class RomanNumeralConvertTest extends AnyFlatSpec with Matchers {

  "A roman numeral " should "be converted in arabic number" in {
    val romanConverter = RomanNumeralConverter

    romanConverter.forNumber(1) should be ("I")
    romanConverter.forNumber(2) should be ("II")
    romanConverter.forNumber(3) should be ("III")
    romanConverter.forNumber(5) should be ("V")
    romanConverter.forNumber(4) should be ("IV")
    romanConverter.forNumber(6) should be ("VI")
    romanConverter.forNumber(10) should be ("X")
    romanConverter.forNumber(9) should be ("IX")
    romanConverter.forNumber(16) should be ("XVI")
    romanConverter.forNumber(26) should be ("XXVI")
    romanConverter.forNumber(46) should be ("XLVI")
    romanConverter.forNumber(58) should be ("LVIII")


  }

}

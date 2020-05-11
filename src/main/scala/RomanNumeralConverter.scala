object RomanNumeralConverter {
  val romanNumbers = List(("L", 50),
    ("XL", 40), ("X", 10),("IX", 9), ("V", 5),("IV", 4), ("I", 1))
  def forNumber(number: Int): String = {
    romanNumbers.foldLeft(("", number)) {
      case ((roman, value), elm) =>
        val numberOfOccurence = value / elm._2
        val currentRoman = roman + elm._1 * numberOfOccurence
        val currentValue = value - (numberOfOccurence * elm._2)
        (currentRoman, currentValue)
    }._1

  }
}

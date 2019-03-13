package cse

object PasswordUtilsScratch {
  def matches(first: String, second: String): Boolean = {
    if (first == null || second == null) return false
    if (first.length != second.length) return false

    first.toList.zip(second.toList).forall(pairs => {
      knownType(pairs._1) && knownType(pairs._2) &&
      checkType(pairs, isNumeric) &&
      checkType(pairs, isAlphanumeric) &&
      checkType(pairs, isSpecial)
    })
  }

  private def knownType(c: Char) : Boolean = {
    isNumeric(c) || isAlphanumeric(c) || isSpecial(c)
  }

  private def checkType(pairs: (Char, Char), typeSelector: Char => Boolean) = {
    if (isSpecial(pairs._1) || isSpecial(pairs._2)) {
      pairs._1 == pairs._2
    }
    else {
      typeSelector(pairs._1) && typeSelector(pairs._2) || (!typeSelector(pairs._1) && !typeSelector(pairs._2))
    }
  }

  private def isNumeric(c: Char): Boolean = {
    c.isDigit
  }
  private def isAlphanumeric(c: Char): Boolean = {
    c.isLetter
  }
  private def isSpecial(c: Char) : Boolean = {
    !c.isLetterOrDigit
  }
}

package companies.forgotten.Scala

class CheckIdStringIsRotatedPalindrome {
  def count(string: String): Boolean = {
    var chars = string.toList
    var i: Int = 0
    while (i < string.size) {
      if (isPalindrome(chars)) {
        return true
      }
      val first: List[Char] = List(chars.head)
      chars = chars.tail
      chars = chars ++ first
      i += 1
    }
    false
  }

  private def isPalindrome(string: List[Char]): Boolean = {
    var i: Int = 0
    while (i < string.length / 2) {
      if (!(string(i) == string(string.length - 1 - i))) {
        return false
      }
      i += 1
    }
    true
  }
}

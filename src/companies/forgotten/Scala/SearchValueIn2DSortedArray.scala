package companies.forgotten.Scala

class SearchValueIn2DSortedArray {
  def count(array: Array[Array[Int]], key: Int): (Int, Int) = {
    var x = array.length - 1
    var y = 0
    while (x >= 0 && y <= array(0).length - 1) {
      println((x, y))
      if (array(x)(y) > key) {
        x -= 1
      } else if (array(x)(y) < key) {
        y += 1
      } else {
        return (x, y)
      }
    }
    (-1, -1)
  }
}

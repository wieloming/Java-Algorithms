package companies.forgotten.Scala

class SearchValueIn2DSortedArray {

  type Position = (Int, Int)

  def count(array: Array[Array[Int]], key: Int): Option[Position] = {

    def count(array: Array[Array[Int]], x: Int, y: Int, key: Int): Option[Position] = {
      if (isIn2DArray(array, (x, y))) {
        if (array(x)(y) > key) count(array, x - 1, y, key)
        else if (array(x)(y) < key) count(array, x, y + 1, key)
        else Some.apply((x, y))
      } else {
        None
      }
    }

    def isIn2DArray(array: Array[Array[Int]], position: Position): Boolean = {
      position._1 >= 0 && position._2 <= array(0).length - 1
    }

    count(array, array.length - 1, 0, key)
  }


}

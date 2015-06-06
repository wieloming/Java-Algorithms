package companies.forgotten.Scala

class ConvertDoubleToRational {

  def count(number: Double): Unit = {
    var base = 1
    while (number * base != (number * base).toInt) {
      base *= 10
    }
    val numberToDivide = (number * base).toInt
    val largestCommonDiv = largestCommonDivisor(numberToDivide, base)
    println(numberToDivide/largestCommonDiv + " / " + base/largestCommonDiv)
  }

  private def largestCommonDivisor(number: Int, number2: Int):Int = {
    var largest = 1
    var i = 2
    while(i <= number){
      if(number % i == 0 && number2 % i == 0){
        largest = i
      }
      i += 1
    }
    largest
  }
}

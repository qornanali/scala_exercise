package exercise2

object Math {
  val SQRT_EPSILON = 0.00000001
  val SQRT_GUESS = 1.0
  val SQRT_IMPROVE = 2

  def abs(x: Double): Double = {
    if (x < 0) -x else x
  }

  def sqrt(x: Double): Double = {
    def isGoodEnough(guess: Double, x: Double): Boolean =
      abs(guess * guess - x) / x < SQRT_EPSILON

    def improve(guess: Double, x: Double): Double =
      (guess + x / guess) / SQRT_IMPROVE

    def iterate(guess: Double, x: Double): Double = {
      if (isGoodEnough(guess, x)) guess
      else iterate(improve(guess, x), x)
    }

    iterate(SQRT_GUESS, x)
  }
}

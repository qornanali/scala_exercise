package exercise1

object Operand {
  def and(x: Boolean, y: => Boolean): Boolean = {
    if (x) y else false
  }

  def or(x: Boolean, y: => Boolean): Boolean = {
    if (x) x else y
  }
}

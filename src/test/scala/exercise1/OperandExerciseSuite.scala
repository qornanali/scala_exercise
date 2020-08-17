package exercise1

import org.junit.Test

class OperandExerciseSuite {

  import exercise1.OperandExercise._

  @Test def `and(x, y) given x == true y == true, it should returns true`(): Unit = {
    assert(and(true, true))
  }

  @Test def `and(x, y) given x == false y == true, it should returns false`(): Unit = {
    assert(!and(false, true))
  }

  @Test def `and(x, y) given x == true y == false, it should returns false`(): Unit = {
    assert(!and(true, false))
  }

  @Test def `and(x, y) given x == false y == false, it should returns false`(): Unit = {
    assert(!and(false, false))
  }
}

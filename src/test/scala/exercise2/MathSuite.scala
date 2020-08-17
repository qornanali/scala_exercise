package exercise2

import org.junit.Assert.assertEquals
import org.junit.Test

class MathSuite {
  @Test def `abs(x) given x == 4, it should returns 4`(): Unit = {
    assertEquals(4, Math.abs(4), 0)
  }

  @Test def `abs(x) given x == -4, it should returns 4`(): Unit = {
    assertEquals(4, Math.abs(-4), 0)
  }

  @Test def `abs(x) given x == 0, it should returns 0`(): Unit = {
    assertEquals(0, Math.abs(0), 0)
  }

  @Test def `sqrt(x) given x == 4, it should returns a number close to 2`(): Unit = {
    assertEquals(2, Math.sqrt(4), 0.00000001)
  }

  @Test def `sqrt(x) given x == 4, it should returns a number close to 1.73205081`(): Unit = {
    assertEquals(1.73205081, Math.sqrt(3), 0.00000001)
  }

  @Test def `sqrt(x) given x == 00, it should returns a number close to 0.03162278`(): Unit = {
    assertEquals(0.03162278, Math.sqrt(0.001), 0.00000001)
  }
}

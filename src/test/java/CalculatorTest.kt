import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class CalculatorTest {

    val calculator = Calculator()

    @Test
    fun add() {
        assertEquals(6, calculator.add(2, 4))
    }

    @Test
    fun subtract() {
        assertEquals(3, calculator.subtract(6, 3))
    }

    @Test
    fun multiply() {
        assertEquals(12, calculator.multiply(4, 3))
    }

    @Test
    fun divide() {
        assertEquals(2.0, calculator.divide(8.0, 4.0))
    }
}
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PrinterTest {

    val printer = Printer(10)

    @Test
    fun getNumberOfSheets() {
        assertEquals(10, printer.numberOfSheets)
    }

    @Test
    fun setNumberOfSheets() {
        printer.numberOfSheets = 20
        assertEquals(20, printer.numberOfSheets)
    }

    @Test
    fun print() {
        val output: String = printer.print(4, 2)
        assertEquals("Printed 2 copies with 4 pages each", output)
        assertEquals(2, printer.numberOfSheets)
    }

    @Test
    fun notEnoughSheets() {
        val output: String = printer.print(5, 3)
        assertEquals("Not enough sheets!", output)
    }
}
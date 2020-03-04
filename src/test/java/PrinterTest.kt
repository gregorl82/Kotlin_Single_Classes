import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PrinterTest {

    val printer = Printer(10, 10)

    @Test
    fun getNumberOfSheets() {
        assertEquals(10, printer.numberOfSheets)
    }

    @Test
    fun getTonerAmount() {
        assertEquals(10, printer.tonerAmount)
    }

    @Test
    fun setNumberOfSheets() {
        printer.numberOfSheets = 20
        assertEquals(20, printer.numberOfSheets)
    }

    @Test
    fun setTonerAmount() {
        printer.tonerAmount = 20
        assertEquals(20, printer.tonerAmount)
    }

    @Test
    fun print() {
        val output: String = printer.print(4, 2)
        assertEquals("Printed 2 copies with 4 pages each", output)
        assertEquals(2, printer.numberOfSheets)
        assertEquals(2, printer.tonerAmount)
    }

    @Test
    fun notEnoughSheets() {
        printer.numberOfSheets = 4
        val output: String = printer.print(4, 2)
        assertEquals("Not enough sheets!", output)
    }

    @Test
    fun notEnoughToner() {
        printer.tonerAmount = 5
        val output: String = printer.print(4, 2)
        assertEquals("Not enough toner!", output)
    }
}
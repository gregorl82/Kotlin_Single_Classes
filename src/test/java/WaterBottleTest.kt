import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class WaterBottleTest {

    val waterBottle = WaterBottle()

    @Test
    fun getVolume() {
        assertEquals(100, waterBottle.volume)
    }

    @Test
    fun setVolume() {
        waterBottle.volume = 20
        assertEquals(20, waterBottle.volume)
    }

    @Test
    fun drink() {
        waterBottle.drink()
        assertEquals(90, waterBottle.volume)
    }

    @Test
    fun cannotHaveNegativeVol() {
        waterBottle.volume = 8
        waterBottle.drink()
        assertEquals(0, waterBottle.volume)
    }

    @Test
    fun empty() {
        waterBottle.empty()
        assertEquals(0, waterBottle.volume)
    }

    @Test
    fun fill() {
        waterBottle.drink()
        waterBottle.fill()
        assertEquals(100, waterBottle.volume)
    }
}
package interviewio

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ConvertToStringTest {

    @Test
    fun convertString() {
        val c = ConvertToString()
        assertEquals(listOf(1234234), c.convertString("1234234"))
        assertEquals(listOf(897, -190, 898238), c.convertString("897 -190 hello * jay 898238"))
        assertEquals(listOf(123, 1234234), c.convertString("00123, 1234234"))
        assertEquals(listOf(897, -190, 898238, 12), c.convertString("897 -190 hello * jay 898238 00000 12"))
    }
}

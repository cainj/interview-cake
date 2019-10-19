package interviewcake

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*


class MeshMessageTest {

    @Test
    fun twoHopPath1Test() {
        val expected = arrayOf("a", "c", "e")
        val actual = getPath(getNetwork(), "a", "e")
        assertNotNull(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoHopPath2Test() {
        val expected = arrayOf("d", "a", "c")
        val actual = getPath(getNetwork(), "d", "c")
        assertNotNull(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun oneHopPath1Test() {
        val expected = arrayOf("a", "c")
        val actual = getPath(getNetwork(), "a", "c")
        assertNotNull(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun oneHopPath2Test() {
        val expected = arrayOf("f", "g")
        val actual = getPath(getNetwork(), "f", "g")
        assertNotNull(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun oneHopPath3Test() {
        val expected = arrayOf("g", "f")
        val actual = getPath(getNetwork(), "g", "f")
        assertNotNull(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun zeroHopPath() {
        val expected = arrayOf("a")
        val actual = getPath(getNetwork(), "a", "a")
        assertNotNull(actual)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun noPathTest() {
        val actual = getPath(getNetwork(), "a", "f")
        assertNull(actual)
    }

    @Test
    fun startNodeNotPresentTest() {
        assertThrows(Exception::class.java) { getPath(getNetwork(), "h", "a") }
    }

    @Test
    fun endNodeNotPresentTest() {
        assertThrows(Exception::class.java) { getPath(getNetwork(), "a", "h") }
    }

    private fun getNetwork(): Map<String, Array<String>> {
        return object : HashMap<String, Array<String>>() {
            init {
                put("a", arrayOf("b", "c", "d"))
                put("b", arrayOf("a", "d"))
                put("c", arrayOf("a", "e"))
                put("d", arrayOf("a", "b"))
                put("e", arrayOf("c"))
                put("f", arrayOf("g"))
                put("g", arrayOf("f"))
            }
        }
    }
}
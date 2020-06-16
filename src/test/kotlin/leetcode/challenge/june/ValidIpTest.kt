package leetcode.challenge.june

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ValidIpTest {

    @Test
    fun validIPAddress() {
        val v = ValidIp()
        assertEquals("Neither", v.validIPAddress("256.256.256.256"))
        assertEquals("IPv4", v.validIPAddress("255.255.255.255"))
        assertEquals("IPv6", v.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"))
        assertEquals("Neither", v.validIPAddress(""))
        assertEquals("Neither", v.validIPAddress("02001:0db8:85a3:0:0:8A2E:0370:7334"))
    }
}

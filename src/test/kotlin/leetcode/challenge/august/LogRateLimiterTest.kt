package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LogRateLimiterTest {

    @Test
    fun shouldPrintMessage() {
        val logger = LogRateLimiter()

        assertEquals(true, logger.shouldPrintMessage(1, "foo"))
        assertEquals(true, logger.shouldPrintMessage(2, "bar"))
        assertEquals(false, logger.shouldPrintMessage(3, "foo"))
        assertEquals(false, logger.shouldPrintMessage(8, "bar"))
        assertEquals(false, logger.shouldPrintMessage(10, "foo"))
        assertEquals(true, logger.shouldPrintMessage(11, "foo"))
        assertEquals(false, logger.shouldPrintMessage(12, "foo"))
    }
}

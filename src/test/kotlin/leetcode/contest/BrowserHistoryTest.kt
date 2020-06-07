package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BrowserHistoryTest {
    @Test
    fun test() {
        val browser = BrowserHistory("google.com")
        assertEquals(browser.back(10), "google.com")
        assertEquals(browser.forward(10), "google.com")
        browser.visit("youtube.com")
        browser.visit("twitter.com")
        browser.visit("leetcode.com")
        assertEquals(browser.back(2), "youtube.com")
        assertEquals(browser.forward(2), "leetcode.com")
        assertEquals(browser.back(3), "google.com")
        browser.visit("linkedin.com")
        assertEquals(browser.back(1), "google.com")
        assertEquals(browser.forward(1), "linkedin.com")

    }
}

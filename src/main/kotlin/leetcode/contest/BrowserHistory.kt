package leetcode.contest

import java.util.*
import kotlin.math.max
import kotlin.math.min

/**
 * You have a browser of one tab where you start on the homepage and you can visit another url, get back in the
 * history number of steps or move forward in the history number of steps.
 *
 * Implement the BrowserHistory class:
 *
 * BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
 * void visit(string url) visits url from the current page. It clears up all the forward history.
 * string back(int steps) Move steps back in history. If you can only return x steps in the history
 * and steps > x, you will return only x steps. Return the current url after moving back in history
 * at most steps.
 * string forward(int steps) Move steps forward in history. If you can only forward x steps in the history
 * and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.
 *
 */
class BrowserHistory(homepage: String) {

    private val history = LinkedList<String>()
    private var currentPos = 0

    init {
        history.add(currentPos, homepage)
    }

    fun visit(url: String) {
        currentPos++
        history.add(currentPos, url)
        while (currentPos + 1 < history.size) history.removeLast()
    }

    fun back(steps: Int): String {
        currentPos = max(currentPos - steps, 0)
        return history[currentPos]
    }

    fun forward(steps: Int): String {
        currentPos = min(history.size - 1, currentPos + steps)
        return history[currentPos]
    }
}

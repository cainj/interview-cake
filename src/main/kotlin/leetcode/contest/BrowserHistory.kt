package leetcode.contest

import java.util.*

/**
 * You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.
 *
 * Implement the BrowserHistory class:
 *
 * BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
 * void visit(string url) visits url from the current page. It clears up all the forward history.
 * string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
 * string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.
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
        val i = currentPos + 1
        while (currentPos + 1 < history.size) history.removeAt(i)
    }

    fun back(steps: Int): String {
        val limit = if (currentPos - steps > -1) currentPos - steps else 0
        while (currentPos > limit) currentPos--
        return history[currentPos]
    }

    fun forward(steps: Int): String {
        val limit = if (currentPos + steps > history.size - 1) history.size - 1 else currentPos + steps
        while (currentPos < limit) currentPos++

        return history[currentPos]
    }
}

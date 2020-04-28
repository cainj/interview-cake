package leetcode.challenge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class FirstUniqueTest {

    @Test
    fun showFirstUnique() {
        val firstUnique = FirstUnique(intArrayOf(2, 3, 5))
        Assertions.assertEquals(2, firstUnique.showFirstUnique()) // return -1
        firstUnique.add(5)            // the queue is now [2,3,5,5]
        Assertions.assertEquals(2, firstUnique.showFirstUnique()) // return -1
        firstUnique.add(2)            // the queue is now [2,3,5,5,2]
        Assertions.assertEquals(3, firstUnique.showFirstUnique()) // return -1
        firstUnique.add(3)            // the queue is now [2,3,5,5,2,3]
        Assertions.assertEquals(-1, firstUnique.showFirstUnique())
    }

}

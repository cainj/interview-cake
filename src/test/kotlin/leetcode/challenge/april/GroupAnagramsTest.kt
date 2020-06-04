package leetcode.challenge.april

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GroupAnagramsTest {

    private val sn = GroupAnagrams()

    @Test
    fun groupAnagrams() {
        Assertions.assertEquals(sn.groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat")).size, 3)
    }
}

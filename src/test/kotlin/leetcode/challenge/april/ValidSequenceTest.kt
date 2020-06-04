package leetcode.challenge.april

import leetcode.binarytrees.Codec
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ValidSequenceTest {

    @Test
    fun isValidSequence() {
        val vs = ValidSequence()
        val codec = Codec()
        var tree = codec.deserialize("2,1,4,5,3,null,null")
        assertEquals(false, vs.isValidSequence(null, intArrayOf(1)))
        assertEquals(true, vs.isValidSequence(tree, intArrayOf(2, 1, 4, 5, 3)))
        tree = codec.deserialize("1,3,5,null,null,4,null,null,2,4,6,null,null")
        println(tree)
        assertEquals(true, vs.isValidSequence(tree, intArrayOf(1, 3, 4)))
        assertEquals(false, vs.isValidSequence(tree, intArrayOf(1, 2, 4)))
    }
}

package leetcode.binarytrees

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CodecTest {

    @Test
    fun test() {
        val codec = Codec()
        var root = TreeNode(1, right = TreeNode(2))
        assertEquals("1,null,2,null,null", codec.serialize(root))
        root = TreeNode(2, TreeNode(1), TreeNode(3))
        assertEquals("2,1,null,null,3,null,null", codec.serialize(root))
        assertEquals(root, codec.deserialize("2,1,null,null,3,null,null"))
        root = TreeNode(1, right = TreeNode(2))
        assertEquals(root, codec.deserialize("1,null,2,null,null"))
    }
}
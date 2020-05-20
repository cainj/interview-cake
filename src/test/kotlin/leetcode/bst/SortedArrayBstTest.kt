package leetcode.bst

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SortedArrayBstTest {

    @Test
    fun sortedArrayToBST() {
        val arrayToBst = SortedArrayBst()
        var tree = arrayToBst.sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9))
        val check = ValidateBst()
        assertEquals(true, check.isValidBST(tree))
        tree = null
        assertEquals(true, check.isValidBST(tree))
        //tree is not sorted
        tree = arrayToBst.sortedArrayToBST(intArrayOf(-10, -3, 1, 0, 5, 9))
        assertEquals(false, check.isValidBST(tree))
    }
}

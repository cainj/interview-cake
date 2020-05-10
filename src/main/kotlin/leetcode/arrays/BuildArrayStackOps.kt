package leetcode.arrays

class BuildArrayStackOps {

    fun buildArray(target: IntArray, n: Int): List<String> {
        val stack = mutableListOf<String>()
        var arrayIndex = 0
        var j = 1

        while (j <= n && arrayIndex <= target.size - 1) {
            stack.add("Push")
            if (target[arrayIndex] != j)
                stack.add("Pop")
            else
                arrayIndex++
            j++
        }

        return stack
    }
}

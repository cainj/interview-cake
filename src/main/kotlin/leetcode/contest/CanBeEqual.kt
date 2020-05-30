package leetcode.contest

class CanBeEqual {

    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        if (target.size != arr.size) return false

        val indices = IntArray(1001)

        for (i in arr)
            indices[i] = 1

        for(i in target.indices)
            if(indices[target[i]] != 1) return false

        return true
    }
}

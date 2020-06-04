package leetcode.challenge.april

class CountElements {

    fun countElements(arr: IntArray): Int {
        val keys = hashSetOf<Int>()

        for(i in arr)
            keys.add(i)

        var count = 0
        for(i in arr)
            if(keys.contains(i + 1))
                count++

        return count
    }
}

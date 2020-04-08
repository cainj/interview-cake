package leetcode.challenge

class CountElements {

    fun countElements(arr: IntArray): Int {
        val keys = IntArray(1001)

        for(i in arr.indices)
            keys[arr[i]] = keys[arr[i]] + 1

        var count = 0
        
        for(i in 0 until keys.size - 1)
            if(keys[i] > 0 && keys[i + 1] > 0)
                count += keys[i]

        return count
    }
}
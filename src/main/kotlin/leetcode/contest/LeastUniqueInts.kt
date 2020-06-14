package leetcode.contest

class LeastUniqueInts {

    fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
        val map = hashMapOf<Int, Int>()

        for (n in arr)
            map[n] = map.getOrDefault(n, 0) + 1

        val sortedMap: MutableList<Pair<Int, Int>> = map.toList().sortedBy { it.second }.toMutableList()

        for (i in 0 until k) {
            var kv = sortedMap.first()
            kv = kv.copy(second = kv.second - 1)
            if (kv.second == 0) sortedMap.removeAt(0)
            else sortedMap[0] = kv
        }

        return sortedMap.size
    }
}

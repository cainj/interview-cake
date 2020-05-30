package leetcode.recursionII

class QuickSort {

    fun quickSort(lst: IntArray): IntArray {
        /* Sorts an array in the ascending order in O(n log n) time */
        qSort(lst, 0, lst.size - 1)
        return lst
    }

    private fun qSort(lst: IntArray, lo: Int, hi: Int) {
        if (lo < hi) {
            val p = partition(lst, lo, hi)
            qSort(lst, lo, p - 1)
            qSort(lst, p + 1, hi)
        }
    }

    private fun partition(lst: IntArray, lo: Int, hi: Int): Int {
        /*
      Picks the last element hi as a pivot
      and returns the index of pivot value in the sorted array */
        val pivot = lst[hi]
        var i = lo
        for (j in lo until hi) {
            if (lst[j] < pivot) {
                val tmp = lst[i]
                lst[i] = lst[j]
                lst[j] = tmp
                i++
            }
        }
        val tmp = lst[i]
        lst[i] = lst[hi]
        lst[hi] = tmp
        return i
    }
}

package leetcode.challenge.june

class WeightedIndex(private val w: IntArray) {

    private var sum = 0
    init {
        for (i in w.indices) {
            sum += w[i]
            w[i] = sum
        }
    }

    fun pickIndex(): Int {
        val target = ((Math.random() * sum).toInt() + 1)

        var l = 0
        var r = w.size - 1
        while (l < r) {
            val mid = l + (r - l) / 2
            if (target > w[mid]) l = mid + 1
            else r = mid
        }

        return l
    }

}

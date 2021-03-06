package leetcode.challenge.july

class ArrangeCoins {

    fun arrangeCoins(n: Int): Int {
        var l = 0L
        var r = n.toLong()


        while (l <= r) {
            val k = l + (r - l) / 2
            val curr = k * (k + 1) / 2

            if (curr == n.toLong()) return k.toInt()

            if (n < curr) r = k - 1
            else l = k + 1
        }

        return r.toInt()
    }
}

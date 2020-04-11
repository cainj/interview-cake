package leetcode.challenge


class HappyNumber {

    fun isHappy(n: Int): Boolean {

        val set = hashSetOf<Int>()
        var ans = next(n)

        while (ans != 1) {
            if (!set.contains(ans))
                set.add(ans)
            else
                return false
            ans = next(ans)
        }

        return true
    }

    private fun next(n: Int): Int =
        if (n < 10) n * n
        else {
            val x = n % 10
            (x * x) + next(n / 10)
        }
}

package leetcode.contest

class SimplifiedFractions {

    fun simplifiedFractions(d: Int): List<String> {
        val fractions = mutableListOf<String>()
        for (denom in 1..d) {
            for (n in 1 until denom) {
                val gcd = gcd(denom, n)
                if (gcd > 1) continue
                fractions.add("$n/$denom")
            }
        }
        return fractions
    }

    private fun gcd(n1: Int, n2: Int): Int {
        var gcd = 1
        var i = 1
        while (i <= n1 && i <= n2) {
            // Checks if i is factor of both integers
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i
            ++i
        }
        return gcd
    }
}

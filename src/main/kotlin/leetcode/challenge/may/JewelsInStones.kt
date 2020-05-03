package leetcode.challenge.may

class JewelsInStones {

    fun numJewelsInStones(J: String, S: String): Int {
        val jewels = hashSetOf<Char>()

        for (c in J)
            jewels.add(c)

        var count = 0

        for (s in S)
            if (jewels.contains(s))
                count++

        return count
    }
}

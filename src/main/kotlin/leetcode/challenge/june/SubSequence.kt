package leetcode.challenge.june

class SubSequence {

    fun isSubsequence(s: String, t: String): Boolean {

        val map = hashMapOf<Char, List<Int>>()
        for (k in t.indices)
            map[t[k]] = map.getOrDefault(t[k], listOf<Int>()) + k

        var currMatchIndex = -1

        for (c in s.toCharArray()) {

            if (map[c] == null) return false

            var isMatched = false
            val indices = map[c]!!
            for (index in indices) {
                if (currMatchIndex < index) {
                    currMatchIndex = index
                    isMatched = true
                    break
                }
            }

            if (!isMatched) return false
        }

        return true
    }
}

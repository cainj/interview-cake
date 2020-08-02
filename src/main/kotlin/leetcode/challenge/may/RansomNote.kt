package leetcode.challenge.may

class RansomNote {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {

        val decoder = hashMapOf<Char, Int>()
        val ransom = hashMapOf<Char, Int>()

        for (c in magazine) decoder[c] = decoder.getOrDefault(c, 0) + 1
        for (c in ransomNote) ransom[c] = ransom.getOrDefault(c, 0) + 1


        for ((k, v) in ransom)
            if (v > decoder[k] ?: 0) return false

        return true
    }
}

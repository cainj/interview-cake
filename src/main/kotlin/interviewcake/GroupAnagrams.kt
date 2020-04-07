package interviewcake

class GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagrams = hashMapOf<String, MutableList<String>>()

        for (s in strs) {
            val grams = anagrams.getOrDefault(s.key(), mutableListOf<String>())
            grams.add(s)
            anagrams[s.key()] = grams
        }

        return anagrams.values.toList()
    }

    private fun String.key(): String {
        val chars = this.toCharArray()
        chars.sort()
        return String(chars)
    }
}
package interviewcake

class GroupAnagrams {

    fun groupAnagrams(strings: Array<String>): List<List<String>> {
        val anagrams = hashMapOf<Int, MutableList<String>>()

        for (s in strings) {
            val grams = anagrams.getOrDefault(s.key(), mutableListOf())
            grams.add(s)
            anagrams[s.key()] = grams
        }

        return anagrams.values.toList()
    }

    private fun String.key(): Int = this.toCharArray().sumBy { it.toInt() }
}
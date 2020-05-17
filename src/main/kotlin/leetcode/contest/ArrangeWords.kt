package leetcode.contest

class ArrangeWords {
    fun arrangeWords(text: String): String {
        val words = text.split(' ')
        val map = mutableListOf<Pair<Int, String>>()

        for (i in words.indices)
            map.add(words[i].length to words[i].toLowerCase())

        map.sortBy { it.first }
        val sorted = map.joinToString(" ") { it.second }
        val c = sorted[0]
        return c.toUpperCase() + sorted.substring(1, sorted.length)
    }
}

package leetcode.challenge.august

class GoatLatin {

    fun toGoatLatin(S: String): String {
        if (S.isEmpty()) return ""

        val words = S.split(' ')
        val sb = StringBuilder()

        for (i in words.indices) {
            val word = words[i]
            if (hashSetOf('a', 'e', 'i', 'o', 'u').contains(word[0].toLowerCase())) sb.append(word.plus(append(i)))
            else {
                val c = word[0]
                sb.append(word.substring(1, word.length).plus("$c${append(i)}"))
            }
            sb.append(' ')
        }

        return sb.deleteCharAt(sb.length - 1).toString()
    }

    private fun append(i: Int): String {
        val sb = StringBuilder()
        sb.append('m')

        for (j in 0..i + 1)
            sb.append('a')

        return sb.toString()
    }
}

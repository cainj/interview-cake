package leetcode

class ConvertTitle {

    fun convertToTitle(n: Int): String {
        var i = n
        val sb = StringBuilder()

        while (i > 0) {
            i--
            val c = 'A' + i % 26
            i /= 26
            sb.append(c)
        }

        return sb.reverse().toString()
    }
}

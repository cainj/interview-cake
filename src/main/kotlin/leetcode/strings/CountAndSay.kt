package leetcode.strings

class CountAndSay {

    fun countAndSay(n: Int): String {
        if (n < 0) return "0"
        if (n == 1) return "1"

        var prevDigit = "1"
        var digitBuilder = StringBuilder()
        var rover = n

        while (rover > 1) {
            var count = 0
            var currentChar = prevDigit[0]
            for (i in prevDigit.indices) {
                if (currentChar != prevDigit[i]) {
                    digitBuilder.append("$count${prevDigit[i - 1]}")
                    currentChar = prevDigit[i]
                    count = 0
                }
                count++
            }
            digitBuilder.append("$count${prevDigit[prevDigit.length - 1]}")
            prevDigit = digitBuilder.toString()
            digitBuilder = StringBuilder()
            rover--
        }

        return prevDigit
    }
}

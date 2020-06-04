package leetcode.challenge.april

class BackspaceCompare {

    fun backspaceCompareStack(S: String, T: String): Boolean = strip(S) == strip(T)

    private fun strip(string: String): List<Char> {
        val stack = mutableListOf<Char>()
        for (c in string)
            if (c == '#') {
                if (stack.size != 0)
                    stack.removeAt(stack.size - 1)
            } else
                stack.add(stack.size, c)


        return stack
    }

    fun backspaceCompare(S: String, T: String): Boolean {
        var i = S.length - 1
        var j = T.length - 1
        var skipT = 0
        var skipS = 0

        //while i || j >= 0
        //then move through the string backwards
        // compare the two chars at their posistion if you have reached a #
        //if you come across the # skip to the next then compare
        //S = "ab#c", T = "ac"

        while (i > -1 || j > -1) {

            while (i >= 0) { // Find position of next possible char in build(S)
                if (S[i] == '#') {
                    skipS++
                    i--
                } else if (skipS > 0) {
                    skipS--
                    i--
                } else break
            }
            while (j >= 0) { // Find position of next possible char in build(T)
                if (T[j] == '#') {
                    skipT++
                    j--
                } else if (skipT > 0) {
                    skipT--
                    j--
                } else break
            }

            if (i > -1 && j > -1 && S[i] != T[j])
                    return false
            else if ((i >= 0) != (j >= 0))
                return false

            i--
            j--

        }

        return true
    }
}

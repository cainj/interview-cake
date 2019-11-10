package interviewcake

fun initialHasPalindromePermutation(input: String): Boolean {

    val chars = input.toCharArray()
    val palindromeMap = mutableMapOf(0 to HashSet<Char>(), 1 to HashSet())

    for (c in input) {
        if (!palindromeMap[0]!!.contains(c) && !palindromeMap[1]!!.contains(c))
            palindromeMap[1]!!.add(c)
        else if (palindromeMap[0]!!.contains(c)) {
            palindromeMap[0]!!.remove(c)
            palindromeMap[1]!!.add(c)
        } else {
            palindromeMap[1]!!.remove(c)
            palindromeMap[0]!!.add(c)
        }
    }
    return palindromeMap[1]!!.size < 2
}

fun hasPalindromePermutation(input: String): Boolean {

    val palindromeHash = HashSet<Char>()

    for (c in input) {
        if (palindromeHash.contains(c))
            palindromeHash.remove(c)
        else
            palindromeHash.add(c)
    }
    return palindromeHash.size < 2
}

package leetcode.challenge.june

class PhoneNumber {

    private val numberPad = hashMapOf<Char, String>(
        '2' to "abc",
        '3' to "def",
        '4' to "ghi",
        '5' to "jkl",
        '6' to "mno",
        '7' to "pqrs",
        '8' to "tuv",
        '9' to "wxyz"
    )

    private val ans = mutableListOf<String>()

    fun letterCombinations(digits: String): List<String> =
        if (digits.isEmpty()) emptyList()
        else {
            ans.clear()
            backtrack("", digits)
            ans
        }

    private fun backtrack(combination: String, digits: String) {
        if (digits.isEmpty()) ans.add(combination)
        else {
            val digit = digits[0]
            val letters = numberPad[digit]!!
            for (i in letters.indices) {
                val letter = numberPad[digit]?.substring(i, i + 1)
                backtrack(combination + letter, digits.substring(1))
            }
        }
    }
}

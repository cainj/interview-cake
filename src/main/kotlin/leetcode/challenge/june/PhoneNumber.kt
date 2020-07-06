package leetcode.challenge.june

/**
 * Given a string containing digits from 2-9 inclusive, return all possible
 * letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 *
 * Note that 1 does not map to any letters.
 *
 * '2' to "abc",
 * '3' to "def",
 * '4' to "ghi",
 * '5' to "jkl",
 * '6' to "mno",
 * '7' to "pqrs",
 * '8' to "tuv",
 * '9' to "wxyz"
 *
 * Example: "2"
 *
 * Output: ["a", "b", "c"]
 *
 * Example:
 * Input: "23"
 *
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 *
 * Although the above answer is in lexicographical order, your answer could be in any order
 * you want.
 *
 */
class PhoneNumber {

    private val numberPad = hashMapOf(
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

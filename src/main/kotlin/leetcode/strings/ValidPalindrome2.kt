package leetcode.strings

/**
 * Given a non-empty string s, you may delete at most one character.
 * Judge whether you can make it a palindrome.
 *
 * Example 1:
 * Input: "aba"
 * Output: True
 *
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 *
 * Input: "abcdeba"
 * Output:  False
 */
class ValidPalindrome2 {

    fun validPalindrome(s: String): Boolean {

        var i = 0
        var j = s.length - 1

        while (j >= i) {
            if (s[i] != s[j])
                return isPalindrome(i + 1, j, s) || isPalindrome(i, j - 1, s)
            i++
            j--
        }
        return true
    }

    private fun isPalindrome(i: Int, j: Int, s: String): Boolean {
        var start = i
        var end = j
        while (end > start) {
            if (s[start] != s[end])
                return false
            start++
            end--
        }
        return true
    }
}

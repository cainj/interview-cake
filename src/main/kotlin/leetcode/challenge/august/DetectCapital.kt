package leetcode.challenge.august

class DetectCapital {

    fun detectCapitalUse(word: String): Boolean {

        var uppercase = 0
        var lowercase = 0

        for (c in word) {
            if (c.isUpperCase()) uppercase++
            else lowercase++
        }
        return (word.length == uppercase
                || word.length == lowercase
                || (word[0].isUpperCase() && lowercase == word.length - 1))
    }
}

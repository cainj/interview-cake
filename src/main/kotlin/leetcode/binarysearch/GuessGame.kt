package leetcode.binarysearch

/**
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return         -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class GuessGame(private val answer: Int) {

    fun guessNumber(n: Int): Int {
        var lowestGuess = 1
        var highestGuess = n

        while (true) {
            val g = lowestGuess + (highestGuess - lowestGuess) / 2

            when (guess(g)) {
                0 -> return g
                1 -> lowestGuess = g + 1
                -1 -> highestGuess = g - 1
                else -> throw Exception("Should not reach here")
            }
        }
    }

    private fun guess(g: Int): Int {
        return when {
            g > answer -> -1
            g < answer -> 1
            else -> 0
        }
    }
}

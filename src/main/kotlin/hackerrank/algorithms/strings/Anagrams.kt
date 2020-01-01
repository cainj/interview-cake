package hackerrank.algorithms.strings

// Complete the anagram function below.
fun anagram(s: String): Int {
    //1. Check to see if string has an even amount of characters, if not then return -1
    //2. Else split the string into two equal parts, then sort the characters
    //3. Remove the character in a from b, then take the size of b for number of changes needed.

    return if (s.length % 2 == 1)
        -1
    else {
        val half = s.length / 2
        val x = s.substring(0, half)
        val y = s.substring(half, s.length).toMutableList()
        for (c in x) {
            y.remove(c)
        }

        y.size
    }
}

fun main() {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s = readLine()!!
        val result = anagram(s)

        println(result)
    }
}

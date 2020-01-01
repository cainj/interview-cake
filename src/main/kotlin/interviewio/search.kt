package interviewio

fun grep(haystack: String, needle: String): List<Int> {

    val solution = mutableListOf<Int>()
    var rover = 0
    for (i in haystack.indices) {
        if (i + needle.length > haystack.length)
            break
        else
            for (j in needle.indices) {
                if (haystack[i + j] != needle[j])
                    break
                rover = j
            }
        if (rover == needle.length - 1)
            solution.add(i)
    }
    return solution
}

fun main() {
    val tree = grep("aaaba", "aab")
    println(tree)
}

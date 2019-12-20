package interview_io

/*
Your previous Plain Text content is preserved below:

Given two strings, A and B, of equal length, find whether it is possible to split both strings at the same index such that merging the first part of A and the second part of B forms a palindrome. Return a location of the split. If the solution can not be found, return -1.

Palindrome is a word that reads the same backward as forward.

Example:
A="qwwe" and B="as/dq" return 3, since we can cut the strings like "qww" and "q"

i
q|waw|e
a|sad|q
     j

qwwq
assa

   once a[i] != b[j]
A linear solution is expected
 */

// A = "qwdeq" . and B = "asdwq" -> qwdwq -> 2
// A = "qwdeq" and B = "qwdeq"

//get the length of A, then divide that by 2
//then take that index from that point on B and compare it to A
// Length of A / 2 + Length of B / 2 = Length of the String  = O(n)

fun palidrome(a: String, b: String): Int {
    val half = a.length / 2
    var index = 0
    for (i in a.indices) {
        if (a[i] != b[(a.length - 1) - i]) {
            index = i
            break
        }

    }

    if (index > half
        || isPalindrome(a.substring(index..(a.length - 1) - index))
        || isPalindrome(b.substring(index..(b.length - 1) - index))
    )
        return index

    return -1
}

fun isPalindrome(string: String): Boolean {
    for (i in 0..string.length / 2) {
        if (string[i] != string[string.length - 1 - i])
            return false
    }

    return true
}

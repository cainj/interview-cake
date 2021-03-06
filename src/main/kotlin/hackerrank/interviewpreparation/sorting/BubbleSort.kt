package hackerrank.interviewpreparation.sorting

import utils.swap
import java.util.*

// Complete the countSwaps function below.
fun countSwaps(a: Array<Int>) {
    var swaps = 0
    for (i in a.indices) {
        for (j in i until a.size) {
            if (a[i] > a[j]) {
                a.swap(i, j)
                swaps++
            }
        }
    }
    println("Array is sorted in $swaps swaps")
    println("First Element: ${a[0]}")
    println("Last Element: ${a[a.size - 1]}")
    println(a.toList())
}

fun main() {

    val scan = Scanner(System.`in`)
    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    countSwaps(a)
}

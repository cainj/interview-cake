package hacker_rank.interview_preparation.sorting

import utils.swap
import java.util.*

// Complete the minimumSwaps function below.
fun minimumSwaps(arr: Array<Int>): Int {
    var swap = 0
    var first = 0
    val last = arr.size - 1
    while (first < last) {
        while (arr[first] == first + 1 && first < last)
            first++
        if (first < last) {
            swap(arr[first] - 1, first, arr)
            swap++
        }
    }
    return swap
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val res = minimumSwaps(arr)

    println(res)
}

//7 1 3 2 4 5 6
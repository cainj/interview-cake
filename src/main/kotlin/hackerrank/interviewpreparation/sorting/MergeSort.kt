package hackerrank.interviewpreparation.sorting

import java.util.*

fun countInversions(arr: Array<Int>): Long {
    val temp = Array(arr.size) { 0 }
    return mergeSort(arr, temp, 0, arr.size - 1)
}

fun mergeSort(arr: Array<Int>, temp: Array<Int>, left: Int, right: Int): Long {
    var inversionCount = 0L
    if (right > left) {
        val mid = (left + right) / 2
        inversionCount += mergeSort(arr, temp, left, mid)
        inversionCount += mergeSort(arr, temp, mid + 1, right)
        /**merge the two parts*/
        inversionCount += merge(arr, temp, left, mid + 1, right)
    }
    return inversionCount
}

fun merge(arr: Array<Int>, temp: Array<Int>, left: Int, mid: Int, right: Int): Long {
    var inversionCount = 0L
    var i = left /* i is index for left subarray*/
    var j = mid /* j is index for right subarray*/
    var k = left /* k is index for resultant merged subarray*/
    while ((i <= mid - 1) && (j <= right)) {
        if (arr[i] <= arr[j]) {
            temp[k] = arr[i]
            k += 1
            i += 1

        } else {
            temp[k] = arr[j]
            k += 1
            j += 1

            /*this is tricky -- see above explanation/diagram for merge()*/
            inversionCount += (mid - i)
        }
    }
/* Copy the remaining elements of left subarray
           (if there are any) to temp*/
    while (i <= mid - 1) {
        temp[k] = arr[i]
        i += 1
        k += 1
    }
    /* Copy the remaining elements of right subarray
           (if there are any) to temp*/
    while (j <= right) {
        temp[k] = arr[j]
        k += 1
        j += 1

    }
    /*Copy back the merged elements to original array*/
    i = left
    while (i <= right) {
        arr[i] = temp[i]
        i += 1
    }
    return inversionCount
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
        val result = countInversions(arr)

        println(result)
    }
}

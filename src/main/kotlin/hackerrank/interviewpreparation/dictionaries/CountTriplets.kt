package hackerrank.interviewpreparation.dictionaries

//Complete the countTriplets function below.
fun countTriplets(arr: LongArray, r: Long): Long {
    val pair = hashMapOf<Long, Long>()
    val triples = hashMapOf<Long, Long>()
    var count = 0L

    for (num in arr) {

        count += triples.getOrDefault(num, 0)

        if (pair.containsKey(num))
            triples[r * num] = (triples[r * num] ?: 0) + pair[num]!!

        pair[num * r] = (pair[num * r] ?: 0) + 1
    }
    return count
}

fun main() {
    val nr = readLine()!!.trimEnd().split(" ")
    val r = nr[1].toLong()
    val arr = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toLongArray()
    val ans = countTriplets(arr, r)

    println(ans)
}

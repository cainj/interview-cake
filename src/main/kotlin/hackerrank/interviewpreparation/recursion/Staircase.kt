package hackerrank.interviewpreparation.recursion

import java.util.*


// Complete the stepPerms function below.
fun stepPerms(n: Int): Int {
    if (n == 1)
        return 1
    val memo = IntArray(n + 1)
    memo[0] = 1
    return countSteps(n, memo)
}

fun countSteps(n: Int, memo: IntArray): Int {
    return when {
        n < 0 -> 0
        memo[n] != 0 -> memo[n]
        n == 1 -> 1
        else -> {
            memo[n] = countSteps(n - 3, memo) + countSteps(n - 2, memo) + countSteps(n - 1, memo)
            memo[n]
        }
    }
}

fun countStepsList(lead: List<Int>, steps: List<Int>, stepsLeft: Int): List<List<Int>> {
    return when {
        stepsLeft == 0 -> listOf(lead)
        stepsLeft < 0 -> emptyList()
        else -> {
            val filtered = steps.filter { stepsLeft - it > -1 }
            filtered.map { step -> countStepsList(lead + step, steps, stepsLeft - step) }.flatten()
        }
    }
}

fun main() {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine().trim().toInt()

    for (sItr in 1..s) {
        val n = scan.nextLine().trim().toInt()
        val res = stepPerms(n)
        println(res)
    }
}

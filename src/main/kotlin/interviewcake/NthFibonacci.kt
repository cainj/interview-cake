package interviewcake

val memo = hashMapOf(0 to 0, 1 to 1, 2 to 1)

fun fib(nth: Int): Int {

    require(nth > -1)

    return memo.computeIfAbsent(nth) {
        var rover = 1
        var next = 1
        var counter = 3
        var answer = 0

        while (counter <= nth) {
            answer = rover + next
            rover = next
            next = answer
            counter++
        }
        answer
    }

}

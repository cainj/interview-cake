package interviewcake

fun findDuplicate(numbers: Array<Int>): Int {

    //We are going to do some swapping
    //We know that we have an array from 1..n and the array size is n + 1
    //Instead for doing binary search, using a linked list graph????
    //take the number at each index
    //1. if the number taken already has itself in the position to be swapped that's a duplicate!
    //2. if not then swap
    //3. after swapping if the current number in the position != to position swap else move index

//    var currentPosition = 1
//
//    while (currentPosition < numbers.size + 1) {
//
//        val currentNumber = numbers[currentPosition - 1]
//        when {
//            currentPosition == currentNumber -> currentPosition++
//            (numbers[currentPosition - 1] == numbers[currentNumber - 1]) -> return currentNumber
//            else -> swap(currentPosition - 1, currentNumber - 1, numbers)
//        }
//    }

    var position = numbers.size
    var totalCycles = 0
    var cyclePosition = numbers[position - 1]
    var hops = 0

    while (position < numbers.size + 1) {
        val currentNumber = numbers[position - 1]

        // when checking for the cycle position if it crosses with the same
        // current position then increment the counter
        if (cyclePosition == currentNumber)
            totalCycles++

        //cycle detected at this position
        if (totalCycles > 1)
            return cyclePosition

        //else if no cycle detected at this position
        // move to the next position
        else if (hops == numbers.size - 1) {
            cyclePosition = numbers[cyclePosition - 1]
            totalCycles = 0
            hops = 0
        }
        hops++
        position = currentNumber
    }

    return 0
}


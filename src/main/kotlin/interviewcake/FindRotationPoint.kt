package interviewcake

fun findRotationPoint(words: Array<String>): Int {

    //Iterate through the array of words
    //take the word then the next word
    //compare to see if the word > next
    //if it is then return the index of the next word
    //if not return 0
    //O(n) is the runtime for this solution
//    for (i in 0 until words.size - 1) {
//        if (words[i] > words[i + 1])
//            return i + 1
//    }

    var floor = 0
    var ceiling = words.size - 1
    val firstWord = words[0]

    //find the middle word in the array
    // if firstWord < middle word it must in upper half
    // set the floor to the midPoint + 1
    // else it's in the lower half
    // set the ceiling to the midpoint
    //O(lg n)
    while (floor < ceiling) {
        val midPoint = floor + ((ceiling - floor) / 2)
        if (words[midPoint] >= firstWord) {
            floor = midPoint
        } else {
            ceiling = midPoint
        }

        // if floor and ceiling have converged
        if (floor + 1 == ceiling) {

            // between floor and ceiling is where we flipped to the beginning
            // so ceiling is alphabetically first
            break;
        }
    }


    return ceiling
}

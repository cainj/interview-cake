package interviewcake


fun canTwoMoviesFillFlight(moviesLengths: IntArray, flightLength: Int): Boolean {
    val sums = mutableSetOf<Int>()
    for (i in moviesLengths.indices) {
        val length = moviesLengths[i]
        if (length > 0 && sums.contains(length)) {
            return true
        } else
            sums.add(flightLength - length)
    }
    return false
}

package interviewcake

fun findRepeat(numbers: IntArray): Int {

    //To find the number we sort the array
    //then
    //iterate over the array using two indexes
    //i for the current
    //j for the next
    //if they equal each other then return number
    //else return 0

    var floor = 1
    var ceiling = numbers.size - 1

    while (floor < ceiling) {
        val bounds = (ceiling - floor)
        val midpoint = floor + bounds / 2
        val lowerRangeFloor = floor
        val upperRangeFloor = midpoint + 1
        val upperRangeCeiling = ceiling
        var itemsInLowerRange = 0

        for (item in numbers) {
            if (item in lowerRangeFloor..midpoint) {
                itemsInLowerRange++
            }
        }

        val distinctPossibleIntegersInLowerRange = midpoint - lowerRangeFloor + 1

        if (itemsInLowerRange > distinctPossibleIntegersInLowerRange) {

            // there must be a duplicate in the lower range
            // so use the same approach iteratively on that range
            floor = lowerRangeFloor
            ceiling = midpoint
        } else {

            // there must be a duplicate in the upper range
            // so use the same approach iteratively on that range
            floor = upperRangeFloor
            ceiling = upperRangeCeiling
        }
    }

    return floor

}

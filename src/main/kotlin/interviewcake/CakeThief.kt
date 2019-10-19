package interviewcake

import kotlin.math.max


data class CakeType(val weight: Int, val value: Int) : Comparable<CakeType> {
    override fun compareTo(other: CakeType): Int {
        return if (this.value < other.value) 1 else -1
    }
}


fun maxDuffelBagValue(cakes: Array<CakeType>, capacity: Int): Long {

    cakes.sort()
    var maxHeist = 0L

    for (cakeIndex in cakes.indices) {
        var remaining = capacity
        var currentIndex = cakeIndex
        var duffleBagValue = 0L


        while (currentIndex < cakes.size) {
            if (cakes[currentIndex].weight == 0)
                if (cakes[currentIndex].value == 0)
                    currentIndex++
                else
                    throw Exception("Cant have zero weight with value")
            else {
                val cakeWeight = cakes[currentIndex].weight

                if (remaining - cakeWeight > -1) {
                    duffleBagValue += cakes[currentIndex].value
                    remaining -= cakeWeight
                } else {
                    currentIndex++
                }
            }
        }
        maxHeist = max(duffleBagValue, maxHeist)
    }

    return maxHeist
}


class InfinityException : RuntimeException("Max value is infinity!")

fun maxDuffelBagValuesInCake(cakeTypes: Array<CakeType>, weightCapacity: Int): Long {

    // we make an array to hold the maximum possible value at every
    // duffel bag weight capacity from 0 to weightCapacity
    // starting each index with value 0
    val maxValuesAtCapacities = LongArray(weightCapacity + 1)

    for (currentCapacity in 0..weightCapacity) {

        // set a variable to hold the max monetary value so far for currentCapacity
        var currentMaxValue: Long = 0

        for ((weight, value) in cakeTypes) {

            // if a cake weighs 0 and has a positive value the value of our duffel bag is infinite!
            if (weight == 0 && value != 0) {
                throw InfinityException()
            }

            // if the current cake weighs as much or less than the current weight capacity
            // it's possible taking the cake would get a better value
            if (weight <= currentCapacity) {

                // so we check: should we use the cake or not?
                // if we use the cake, the most kilograms we can include in addition to the cake
                // we're adding is the current capacity minus the cake's weight. we find the max
                // value at that integer capacity in our array maxValuesAtCapacities
                val maxValueUsingCake = value + maxValuesAtCapacities[currentCapacity - weight]

                // now we see if it's worth taking the cake. how does the
                // value with the cake compare to the currentMaxValue?
                currentMaxValue = max(maxValueUsingCake, currentMaxValue)
            }
        }

        // add each capacity's max value to our array so we can use them
        // when calculating all the remaining capacities
        maxValuesAtCapacities[currentCapacity] = currentMaxValue
    }

    return maxValuesAtCapacities[weightCapacity]
}

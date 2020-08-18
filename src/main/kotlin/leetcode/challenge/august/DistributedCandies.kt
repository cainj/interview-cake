package leetcode.challenge.august

class DistributedCandies {
    fun distributeCandies(candies: Int, numPeople: Int): IntArray {
        var goodies = candies
        val people = IntArray(numPeople) { 0 }
        var distributed = 1
        var i = 0

        while (goodies > 0) {
            if (i != 0 && i % numPeople == 0) i = 0
            if (distributed > goodies) distributed = goodies

            people[i++] += distributed
            goodies -= distributed
            distributed++
        }

        return people
    }
}

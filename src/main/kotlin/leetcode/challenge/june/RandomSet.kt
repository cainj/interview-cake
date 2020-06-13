package leetcode.challenge.june

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.MutableList
import kotlin.collections.MutableMap
import kotlin.collections.set


internal class RandomizedSet {
    var nums: MutableList<Int> = ArrayList<Int>()
    var positions: MutableMap<Int, Int> = HashMap()

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element.  */
    fun insert(`val`: Int): Boolean {
        if (positions.containsKey(`val`)) return false
        nums.add(`val`)
        positions[`val`] = nums.size - 1
        return true
    }

    /** Removes a value from the set. Returns true if the set contained the specified element.  */
    fun remove(`val`: Int): Boolean {
        if (!positions.containsKey(`val`))
            return false
        val pos = positions[`val`]!!
        nums[pos] = nums[nums.size - 1]
        positions[nums[pos]] = pos
        nums.removeAt(nums.size - 1)
        positions.remove(`val`)
        return true
    }

    /** Get a random element from the set.  */
    val random: Int
        get() = nums[(Math.random() * nums.size).toInt()]
}

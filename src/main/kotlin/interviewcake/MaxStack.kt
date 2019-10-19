package interviewcake

import kotlin.math.max

class MaxStack {

    private val ints = arrayListOf<Int>()
    private val maxAtPops = arrayListOf<Int>()

    fun push(item: Int) = ints.add(item).also {
        if (maxAtPops.size > 0)
            maxAtPops.add(max(maxAtPops.last(), item))
        else
            maxAtPops.add(item)
    }

    fun pop(): Int = ints.removeAt(ints.size - 1).also {
        maxAtPops.removeAt(maxAtPops.size - 1)
    }

    fun max() = maxAtPops.last()
}

package interviewcake

import utils.swap
import java.util.*
import kotlin.random.Random


fun shuffle(intArray: Array<Char>) {
    if (intArray.size <= 1)
        return

    for (index in intArray.indices) {
        val random = getRandom(index, intArray.size - 1)
        if (index != random)
            swap(index, random, intArray)
    }
}


fun getRandom(floor: Int, ceiling: Int): Int = Random.nextInt((ceiling - floor) + 1) + floor;

fun main() {
    val initial = arrayOf('a', 'b', 'c')
    val shuffled = initial.copyOfRange(0, initial.size)
    shuffle(shuffled)
    System.out.printf("initial array: %s\n", initial.contentToString())
    System.out.printf("shuffled array: %s\n", shuffled.contentToString())
}

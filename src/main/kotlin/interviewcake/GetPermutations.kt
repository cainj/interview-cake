package interviewcake

import utils.swap


fun getPermutations(inputString: String): Set<String> {

    // generate all permutations of the input string

    return recursivePermutation(
        0,
        inputString.toCharArray(),
        hashSetOf(inputString)
    )
}

fun recursivePermutation(
    index: Int,
    input: CharArray,
    perms: HashSet<String>
): Set<String> {

    if (index >= input.size)
        return perms
    else {
        for (j in input.indices) {
            val pair: Pair<Char, CharArray> = createHeadAndTail(index, j, input.copyOf())
            perms.add(pair.first.plus(String(pair.second)))
            println("Head: ${pair.first}, Tail: ${String(pair.second)}")
            recursivePermutation(index + 1, pair.second, perms)
        }
    }
    return perms
}

fun createHeadAndTail(i: Int, j: Int, input: CharArray): Pair<Char, CharArray> {
    swap(i, j, input)
    return Pair(input.head(), input.tail())
}


fun CharArray.tail() = drop(1).joinToString(separator = "").toCharArray()

fun CharArray.head() = first()
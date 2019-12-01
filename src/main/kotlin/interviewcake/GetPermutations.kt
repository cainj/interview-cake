package interviewcake

fun getPermutations(input: String): HashSet<String> {
    return input.foldIndexed(hashSetOf<List<String>>()) { index, accum, next ->
        accum.add(recursivePermutation(next.toString(), input.removeRange(index..index), emptyList()))
        accum
    }.flatten().toHashSet()
}

fun recursivePermutation(result: String, input: String, accum: List<String>): List<String> =
    when {
        input.isEmpty() ->
            accum + result
        else -> input.indices.flatMap { i ->
            recursivePermutation(result + input[i], input.removeRange(i..i), accum)
        }
    }

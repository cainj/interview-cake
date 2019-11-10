package interviewcake

fun sortScores(sortScores: IntArray, highScore: Int): IntArray {
    val scoreCounts = IntArray(highScore + 1) { 0 }
    val sortedScores = IntArray(sortScores.size) { 0 }
    for (index in sortScores.indices)
        scoreCounts[sortScores[index]] += 1

    var scoreCountIndex = highScore
    var sortIndex = 0
    while (scoreCountIndex > -1 && sortIndex < sortScores.size) {
        val count = scoreCounts[scoreCountIndex]
        if (count > 0) {
            for (i in sortIndex until sortIndex + count)
                sortedScores[i] = scoreCountIndex
            sortIndex += count
        }
        scoreCountIndex--
    }
    return sortedScores
}

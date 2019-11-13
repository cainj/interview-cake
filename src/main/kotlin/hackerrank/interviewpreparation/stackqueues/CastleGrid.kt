package hackerrank.interviewpreparation.stackqueues

import java.util.*

data class Pos(val x: Int, val y: Int)

// Complete the minimumMoves function below.
fun minimumMoves(grid: Array<String>, startX: Int, startY: Int, goalX: Int, goalY: Int): Int {
    val ans = Array(grid.size) { IntArray(grid.size) }
    for (i in grid.indices) {
        for (j in grid.indices) {
            if (grid[i][j] == '.')
                ans[i][j] = 100
        }
    }
    val dequeue = ArrayDeque<Pos>()
    val visited = hashSetOf<Pos>()
    dequeue.add(Pos(startX, startY))
    ans[startX][startY] = 0

    while (dequeue.isNotEmpty()) {
        val pos = dequeue.remove()
        if (!visited.contains(pos)) {
            visited.add(pos)
            findMinimumPath(dequeue, pos, grid, ans)
        }
    }

    return ans[goalX][goalY]
}

fun findMinimumPath(deque: Deque<Pos>, pos: Pos, grid: Array<String>, rover: Array<IntArray>) {
    val value = rover[pos.x][pos.y]

    //far down
    var count = pos.x
    while (count < grid.size && grid[count][pos.y] == '.') {
        addStep(count, pos.y, value, rover)
        deque.add(Pos(count, pos.y))
        count++
    }

    //far up
    count = pos.x
    while (count > -1 && grid[count][pos.y] == '.') {
        addStep(count, pos.y, value, rover)
        deque.add(Pos(count, pos.y))
        count--
    }

    //far right
    count = pos.y
    while (count < grid[pos.x].length && grid[pos.x][count] == '.') {
        addStep(pos.x, count, value, rover)
        deque.add(Pos(pos.x, count))
        count++
    }

    //far left
    count = pos.y
    while (count > -1 && grid[pos.x][count] == '.') {
        addStep(pos.x, count, value, rover)
        deque.add(Pos(pos.x, count))
        count--
    }
}

fun addStep(x: Int, y: Int, value: Int, rover: Array<IntArray>) =
    if (rover[x][y] > value + 1)
        rover[x][y] = value + 1
    else Unit

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val grid = Array<String>(n) { "" }

    for (i in 0 until n) {
        val gridItem = scan.nextLine()
        grid[i] = gridItem
    }

    val startXStartY = scan.nextLine().split(" ")

    val startX = startXStartY[0].trim().toInt()
    val startY = startXStartY[1].trim().toInt()
    val goalX = startXStartY[2].trim().toInt()
    val goalY = startXStartY[3].trim().toInt()
    val result = minimumMoves(grid, startX, startY, goalX, goalY)

    println(result)
}

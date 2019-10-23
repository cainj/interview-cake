package karat

import java.util.*

/**
 * You should write your code inside a function
 * Your function should take the input(s) as argument(s)
 * Your function should return the answer as a data-structure
 * You can validate/test your code by calling your function and printing the data-structure it returns
 * Your function should return the same output if it is called multiple times in a row
 *
 * Imagine we have an image. We'll represent this image as a simple 2D array where every pixel is a 1 or a 0.
 * The image you get is known to have a single rectangle of 0s on a background of 1s.
 *
 * image1 = [
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 0, 0, 0, 1],
 * [1, 1, 1, 0, 0, 0, 1],
 * [1, 1, 1, 1, 1, 1, 1],
 * ]
 *
 * Write a function that takes in the image and returns one of the following representations of the rectangle of 0's:
 * top-left coordinate and bottom-right coordinate OR top-left coordinate, width, and height.
 * Sample output variations (only one is necessary):
 *
 * findRectangle(image1) =>
 * x: 3, y: 2, width: 3, height: 2
 * 2,3 3,5 -- row,column of the top-left and bottom-right corners
 *
 * Other test cases:
 * image2 = [
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 1, 0],]
 *
 * findRectangle(image2) =>
 * x: 6, y: 4, width: 1, height: 1
 * 4,6 4,6
 *
 * image3 = [
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 0, 0],
 * [1, 1, 1, 1, 1, 0, 0],
 * ]
 *
 * findRectangle(image3) =>
 * x: 5, y: 3, width: 2, height: 2
 * 3,5 4,6
 *
 * image4 = [
 * [0, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 1, 1],
 * [1, 1, 1, 1, 1, 1, 1],
 * ]
 *
 * findRectangle(image4) =>
 * x: 0, y: 0, width: 1, height: 1
 * 0,0 0,0
 *
 * image5 = [
 * [0],
 * ]
 * findRectangle(image5) =>
 * x: 0, y: 0, width: 1, height: 1
 * 0,0 0,0
 *
 * n: number of rows in the input image
 * m: number of columns in the input image
 */


typealias Image = Array<Array<Int>>

data class Pos(val x: Int, val y: Int)
data class Rectangle(val width: Int, val height: Int, val topLeft: Pos, val bottomRight: Pos)

val START = Pos(0, 0)

fun findRectangle(image: Image): Rectangle {
    val start = findStartingPoint(image)
    return findingRectangle(start, image)
}

private fun findingRectangle(start: Pos, image: Image): Rectangle {
    var currentPos = start
    var width = 1
    var height = 1

    var nextMove = nextMove(start, image)
    while (currentPos != nextMove) {
        height += (nextMove.x - currentPos.x)
        width += (nextMove.y - currentPos.y)
        currentPos = nextMove
        nextMove = nextMove(currentPos, image)
    }

    height += (nextMove.y - currentPos.y)
    width += (nextMove.x - currentPos.x)

    return Rectangle(width, height, start, currentPos)
}

fun findRectangles(image: Image): List<List<Pos>> {
    val startingPositions = findStartingPoints(image)
    val rectangles = startingPositions.map { findingRectangle(it, image) }
    return rectangles.map { listOf(it.topLeft, Pos(it.width, it.height)) }
}

private fun nextMove(pos: Pos, image: Image): Pos {
    val moves = moves(pos)
    for (direction in moves) {
        try {
            if (image[direction.x][direction.y] == 0) {
                return direction
            }
        } catch (e: Exception) {
            println("cannot move here: $pos")
        }
    }
    return pos
}

/**
 * Using BFS
 */
private fun findStartingPoints(image: Image): List<Pos> {
    val positions = mutableListOf<Pos>()
    val visitedStartingPoints = hashSetOf<Pos>()
    val dequeue = ArrayDeque<Pos>()
    val visited: HashSet<Pos> = hashSetOf()
    dequeue.offer(START)
    while (dequeue.isNotEmpty()) {
        val pos = dequeue.pop()
        visited.add(pos)
        if (isTopLeftCorner(pos, image) && !visitedStartingPoints.contains(pos)) {
            positions.add(pos)
            visitedStartingPoints.add(pos)
        }

        dequeue.addAll(validDirections(pos, image).filterNot { visited.contains(it) })
    }
    return positions
}

/**
 * Using BFS
 */
private fun findStartingPoint(image: Image): Pos {
    val start = Pos(0, 0)
    val dequeue = ArrayDeque<Pos>()
    val visited: HashSet<Pos> = hashSetOf(START)
    dequeue.offer(START)
    while (dequeue.isNotEmpty()) {
        val pos = dequeue.pop()
        visited.add(pos)
        if (isTopLeftCorner(pos, image))
            return pos
        dequeue.addAll(validDirections(pos, image).filterNot { visited.contains(it) })
    }
    return start
}

private fun moves(pos: Pos): Array<Pos> =
    //diagonal, right, down : order matters
    arrayOf(
        Pos(pos.x + 1, pos.y),
        Pos(pos.x, pos.y + 1)
    )


private fun validDirections(pos: Pos, image: Image): List<Pos> {
    return arrayOf(
        Pos(pos.x - 1, pos.y),
        Pos(pos.x, pos.y - 1)
    ).plus(moves(pos)).filter { direction ->
        try {
            image[direction.x][direction.y] == 0 || image[direction.x][direction.y] == 1
        } catch (e: ArrayIndexOutOfBoundsException) {
            false
        }
    }
}

private fun isTopLeftCorner(pos: Pos, image: Image): Boolean {
    val directions = arrayOf(
        Pos(pos.x - 1, pos.y),
        Pos(pos.x, pos.y - 1)
    )

    return directions.all { direction ->
        try {
            image[direction.x][direction.y] == 1
        } catch (e: Exception) {
            true
        }
    } && image[pos.x][pos.y] == 0
}

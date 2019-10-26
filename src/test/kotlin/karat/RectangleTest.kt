package karat

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RectangleTest {


    @Test
    fun sampleTest() {
        /**
         * findRectangle(image1) =>
         * x: 3, y: 2, width: 3, height: 2
         * 2,3 3,5 -- row,column of the top-left and bottom-right corners
         */

        val image = arrayOf(
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 0, 0, 0, 1),
            arrayOf(1, 1, 1, 0, 0, 0, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1)
        )

        val expected = Rectangle(3, 2, Pos(2, 3), Pos(3, 5))
        val actual = findRectangle(image)
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sampleTest2() {
        /**
         * findRectangle(image2) =>
         * x: 6, y: 4, width: 1, height: 1
         * 4,6 4,6
         */


        val image = arrayOf(
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 0)
        )

        val expected = Rectangle(1, 1, Pos(4, 6), Pos(4, 6))
        val actual = findRectangle(image)
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sampleTest3() {
        /**
         *findRectangle(image3) =>
         * x: 5, y: 3, width: 2, height: 2
         * 3,5 4,6
         */


        val image = arrayOf(
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 0, 0),
            arrayOf(1, 1, 1, 1, 1, 0, 0)
        )

        val expected = Rectangle(2, 2, Pos(3, 5), Pos(4, 6))
        val actual = findRectangle(image)
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sampleTest4() {
        /**
         *findRectangle(image5) =>
         * x: 0, y: 0, width: 1, height: 1
         * 0,0 0,0
         */


        val image = arrayOf(
            arrayOf(0, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1)
        )

        val expected = Rectangle(1, 1, Pos(0, 0), Pos(0, 0))
        val actual = findRectangle(image)
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun sampleTest5() {
        /**
         *findRectangles(image1) =>
        // (using top-left and bottom-right):
        [
        [[0,0],[0,0]],
        [[2,0],[2,0]],
        [[2,3],[3,5]],
        [[3,1],[5,1]],
        [[5,3],[6,4]],
        [[7,6],[7,6]],
        ]
        // (using top-left and width/height):
        [
        [[0,0],[1,1]],
        [[2,0],[1,1]],
        [[2,3],[3,2]],
        [[3,1],[1,3]],
        [[5,3],[2,2]],
        [[7,6],[1,1]],
        ]
         */


        val image = arrayOf(
            arrayOf(0, 1, 1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 1),
            arrayOf(0, 1, 1, 0, 0, 0, 1),
            arrayOf(1, 0, 1, 0, 0, 0, 1),
            arrayOf(1, 0, 1, 1, 1, 1, 1),
            arrayOf(1, 0, 1, 0, 0, 1, 1),
            arrayOf(1, 1, 1, 0, 0, 1, 1),
            arrayOf(1, 1, 1, 1, 1, 1, 0)
        )

        val expected = setOf(
            listOf(Pos(0, 0), Pos(1, 1)),
            listOf(Pos(2, 0), Pos(1, 1)),
            listOf(Pos(3, 1), Pos(1, 3)),
            listOf(Pos(2, 3), Pos(3, 2)),
            listOf(Pos(5, 3), Pos(2, 2)),
            listOf(Pos(7, 6), Pos(1, 1))
        )
        val actual = findRectangles(image)
        Assertions.assertTrue(expected.containsAll(actual))
    }

}

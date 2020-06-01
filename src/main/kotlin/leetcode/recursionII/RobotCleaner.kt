package leetcode.recursionII

import java.util.*

class RobotCleaner {

    fun cleanRoom(robot: Robot) = backTrack(robot, 0, 0, 0, hashSetOf())

    private fun backTrack(robot: Robot, row: Int, col: Int, p: Int, visited: HashSet<Pair<Int, Int>>) {

        visited.add(row to col)
        robot.clean()

        for( i in 0 .. 3) {
            val dir = (p + i) % 4
            var r = row
            var c = col
            when (dir) {
                0 -> r = row - 1
                1 -> c = col + 1
                2 -> r = row + 1
                3 -> c = col - 1
            }

            if(!visited.contains(r to c) && robot.move()){
                backTrack(robot, r, c, dir, visited)
                goBack(robot)
            }
            robot.turnRight()
        }
    }

    private fun goBack(r: Robot){
        r.turnLeft()
        r.turnLeft()
        r.move()
        r.turnRight()
        r.turnRight()
    }
}

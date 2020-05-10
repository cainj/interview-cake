package leetcode.stacks

class RoomKeys {

    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val visited = hashSetOf<Int>()
        helper(0, visited, rooms)

        return visited.size == rooms.size
    }

    private fun helper(room: Int, visited: MutableSet<Int>, rooms: List<List<Int>>) {
        visited.add(room)
        val keys = rooms[room]

        for (key in keys) {
            if (visited.contains(key)) continue
            helper(key, visited, rooms)
        }
    }
}

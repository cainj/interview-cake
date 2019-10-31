package hacker_rank

import java.util.*

class RoadSortOrder : Comparator<Road> {
    override fun compare(o1: Road?, o2: Road?): Int {
        return o1?.time?.plus(o2?.time ?: 0) ?: 0
    }
}

data class Road(val to: Int, val from: Int, val time: Int)

// Complete the minTime function below.
fun minTime(arr: Array<Array<Int>>, machines: Array<Int>): Int {

    //setup adjacency list
    val roads = Array(arr.size) {
        Road(arr[it][0], arr[it][1], arr[it][2])
    }

    //Sort the roads
    roads.sortWith(RoadSortOrder())

    val disjointSet = DisjointSet<Int>()
    for (city in 0..arr.size + 1)
        disjointSet.makeSet(city)


    val result = mutableListOf<Edge>()

    for (edge in roads) {
        if (isNotCycle(edge, disjointSet)) {
            val root1 = disjointSet.findSet(edge.to)
            val root2 = disjointSet.findSet(edge.from)

            if (root1 == root2)
                continue
            else {
                result.add(edge)
                disjointSet.union(edge.to, edge.from)
            }

        }
    }
    return 0
}

fun hasMachine(city: Int, machines: Array<Int>): Boolean = machines.contains(city)


fun main() {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val roads = Array(n - 1) { Array(3) { 0 } }

    for (i in 0 until n - 1) {
        roads[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val machines = Array(k) { 0 }
    for (i in 0 until k) {
        val machinesItem = scan.nextLine().trim().toInt()
        machines[i] = machinesItem
    }

    val result = minTime(roads, machines)

    println(result)
}

package hacker_rank

import java.util.*

typealias RoadTime = Pair<City, Int>

class City(val id: Int, val roads: HashSet<RoadTime> = hashSetOf(), val hasMachine: Boolean = false)

// Complete the minTime function below.
fun minTime(roads: Array<Array<Int>>, machines: Array<Int>): Int {

    //setup adjacency list
    val cities = Array(roads.size + 1) { City(it, hasMachine = hasMachine(it, machines)) }
    for (road in roads) {
        val city1 = cities[road[0]]
        val city2 = cities[road[1]]
        city1.roads.add(city2 to road[2])
        city2.roads.add(city1 to road[2])
    }

    //traverse through the roads and find all cities that have machines
    //then find all possible paths between those cities and the machines
    val start = cities.find { it.hasMachine }!!
    val initialPath = hashSetOf(start to 0)
    val visited = hashSetOf(start)
    val goal = findGoal(start, machines)
    findPaths(initialPath, visited, goal)
    return 0
}

fun findGoal(city: City, machines: Array<Int>): Int {
    return machines.find { it != city.id }!!
}

fun hasMachine(city: Int, machines: Array<Int>): Boolean = machines.contains(city)

fun findPaths(path: Set<RoadTime>, visited: Set<City>, goal: Int): List<Set<Int>> {
    TODO()
}


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

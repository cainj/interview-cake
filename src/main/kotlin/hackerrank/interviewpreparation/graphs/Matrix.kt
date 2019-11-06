package hackerrank.interviewpreparation.graphs

import java.util.*

// Complete the minTime function below.
fun minTime(roads: Array<Array<Int>>, machines: Array<Int>): Int {

    val n = roads.size
    // Mark each group with a machine.
    val base = Array(n + 1) { machines.contains(it) }
    val sets = List(n + 1) { hashSetOf(it) }

    // Put each city in its own group.
    val nodes = Array(n + 1) { it }
    val m = hashMapOf<Int, HashSet<Pair<Int, Int>>>()

    var time = 0
    // Build map indexed by road value.
    for (road in roads) {
        val set = m[road[2]]
        if (set != null)
            set.add(road[0] to road[1])
        else
            m[road[2]] = hashSetOf(road[0] to road[1])
    }

    for (rs in m.toSortedMap(reverseOrder())) {
        for (pair in rs.component2()) {
            val b1 = nodes[pair.first]

            val b2 = nodes[pair.second]

            if (base[b1] && base[b2]) {
                time += rs.component1()
            } else {
                base[b1] = base[b1] || base[b2]
                for (s in sets[b2]) {
                    sets[b1].add(s)
                    nodes[s] = b1
                }
            }

        }

    }

    return time
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

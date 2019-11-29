package hackerrank.interviewpreparation.graphs

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*
import java.util.stream.IntStream


class SortNoDecreasingOrder : Comparator<Edge> {
    override fun compare(o1: Edge?, o2: Edge?): Int {
        return o1?.weight?.minus(o2?.weight ?: 0) ?: 0
    }
}

class Edge(val from: Int, val to: Int, val weight: Int)

/*
 * Complete the 'kruskals' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts WEIGHTED_INTEGER_GRAPH g as parameter.
 */

/*
 * For the weighted graph, <name>:
 *
 * 1. The number of nodes is <name>Nodes.
 * 2. The number of edges is <name>Edges.
 * 3. An edge exists between <name>From[i] and <name>To[i]. The weight of the edge is <name>Weight[i].
 *
 */

fun kruskals(gNodes: Int, gFrom: List<Int>, gTo: List<Int>, gWeight: List<Int>): Int {
    val edges = mutableListOf<Edge>()
    for (index in gFrom.indices)
        edges.add(Edge(gFrom[index], gTo[index], gWeight[index]))

    //sort the edges
    edges.sortWith(SortNoDecreasingOrder())

    val disjointSet = DisjointSet<Int>()
    for (node in 1..gNodes)
        disjointSet.makeSet(node)

    val result = mutableListOf<Edge>()

    for (edge in edges) {
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

    return result.sumBy { it.weight }
}

fun isNotCycle(edge: Edge, disjointSet: DisjointSet<Int>) =
    disjointSet.findSet(edge.to) != disjointSet.findSet(edge.from)

object Solution {
    @Throws(IOException::class)
    @JvmStatic
    fun main() {
        val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

        val gNodesEdges =
            bufferedReader.readLine().replace("\\s+$".toRegex(), "").split(" ".toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray()

        val gNodes = Integer.parseInt(gNodesEdges[0])
        val gEdges = Integer.parseInt(gNodesEdges[1])

        val gFrom = ArrayList<Int>()
        val gTo = ArrayList<Int>()
        val gWeight = ArrayList<Int>()

        IntStream.range(0, gEdges).forEach {
            try {
                val gFromToWeight = bufferedReader.readLine().replace("\\s+$".toRegex(), "").split(" ".toRegex())
                    .dropLastWhile { it.isEmpty() }
                    .toTypedArray()

                gFrom.add(Integer.parseInt(gFromToWeight[0]))
                gTo.add(Integer.parseInt(gFromToWeight[1]))
                gWeight.add(Integer.parseInt(gFromToWeight[2]))
            } catch (ex: IOException) {
                throw RuntimeException(ex)
            }
        }

        val res = kruskals(gNodes, gFrom, gTo, gWeight)

        // Write your code here.
        bufferedReader.close()
        println(res)
    }
}

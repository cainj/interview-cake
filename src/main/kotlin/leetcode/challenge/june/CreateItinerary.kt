package leetcode.challenge.june

import java.util.*

/**
 * Given a list of airline tickets represented by pairs of departure and arrival airports [from, to],
 * reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK.
 * Thus, the itinerary must begin with JFK.
 *
 * Note:
 *
 * If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when
 * read as a single string.
 *
 * For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
 * All airports are represented by three capital letters (IATA code).
 * You may assume all tickets form at least one valid itinerary.
 * One must use all the tickets once and only once.
 *
 * Example 1:
 * Input: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
 * Output: ["JFK", "MUC", "LHR", "SFO", "SJC"]
 *
 * Example 2:
 * Input: [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
 * Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
 * Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"].
 * But it is larger in lexical order.
 */
class CreateItinerary {

    fun findItinerary(tickets: List<List<String>>): List<String> {
        val connections = hashMapOf<String, PriorityQueue<String>>()

        for (ticket in tickets) {
            val queue = connections.getOrDefault(ticket[0], PriorityQueue())
            queue.add(ticket[1])
            connections[ticket[0]] = queue
        }

        return createItinerary("JFK", connections, mutableListOf())
    }

    private fun createItinerary(
        airport: String,
        connections: HashMap<String, PriorityQueue<String>>,
        itinerary: MutableList<String>
    ): List<String> {

        val queue = connections[airport]

        while (queue != null && queue.isNotEmpty())
            createItinerary(queue.poll(), connections, itinerary)

        itinerary.add(0, airport)
        return itinerary
    }
}

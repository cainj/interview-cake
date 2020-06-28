package leetcode.challenge.june

import java.util.*

class CreateItinerary {

    fun findItinerary(tickets: List<List<String>>): List<String> {
        val connections = hashMapOf<String, PriorityQueue<String>>()

        for (ticket in tickets) {
            val queue = connections.getOrDefault(ticket[0], PriorityQueue<String>())
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

package hackerrank.codepair

class Vehicle {

    private val list = mutableListOf<String>()
    private val visited = hashSetOf<String>()

    fun buildVehicle(parts: HashMap<String, List<String>>): List<String> {
        dfs("vehicle", parts)
        return list
    }

    private fun dfs(key: String, parts: HashMap<String, List<String>>) {
        if (visited.contains(key)) return
        visited.add(key)

        if (parts[key] != null)
            for (p in parts[key]!!) dfs(p, parts)

        list.add(key)
    }
}

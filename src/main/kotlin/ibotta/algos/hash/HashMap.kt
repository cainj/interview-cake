package ibotta.algos.hash

class HashMap<K, V>(private var capacity: Int = MAX_CAPACITY, private var loadFactor: Float = INITIAL_LOAD_FACTOR) {

    private var store: Array<MutableList<MapEntry<K, V>>> = Array(capacity) { mutableListOf<MapEntry<K, V>>() }
    var size: Int = 0

    init {
        if (capacity > MAX_CAPACITY)
            capacity = MAX_CAPACITY
        if (loadFactor < 0.0f || loadFactor > 1.0f)
            loadFactor = INITIAL_LOAD_FACTOR
    }

    data class MapEntry<K, V>(var key: K, var value: V)

    operator fun set(key: K, value: V) {
        when (get(key)) {
            null -> {
                rehash()
                store[hash(key)].add(MapEntry(key, value))
                size++
            }
            else -> findEntry(key).value = value
        }
    }

    /** Returns the value to which the specified key is mapped */
    operator fun get(key: K): V? {
        val entries = store[hash(key)]
        for (value in entries)
            if (value.key == key)
                return value.value

        return null
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key  */
    fun remove(key: K) {
        val entries = store[hash(key)]
        for (entry in entries) {
            if (entry.key == key) {
                entries.remove(entry)
                size--
                return
            }
        }
    }

    private fun rehash() {
        if ( size.toFloat() / store.size > loadFactor) {
            capacity *= 2
            val temp = store
            store = Array(capacity * 2) { mutableListOf<MapEntry<K, V>>() }
            for (entries in temp)
                for(entry in entries)
                    this[entry.key] = entry.value
        }

    }

    private fun hash(key: K): Int = key.hashCode() % store.size

    private fun findEntry(key: K): MapEntry<K, V> = store[hash(key)].find { it.key == key }!!

    companion object {
        fun <K, V> emptyHashMap() = HashMap<K, V>()
        const val MAX_CAPACITY = 512 //make sure that it's the power of 2 minimize collisions
        const val INITIAL_LOAD_FACTOR = .75f
    }

}

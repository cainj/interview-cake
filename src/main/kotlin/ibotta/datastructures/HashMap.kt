package ibotta.datastructures

import ibotta.datastructures.HashMap.Companion.emptyHashMap

class HashMap<K, T>(private var capacity: Int = MAX_CAPACITY, private var loadFactor: Float = INITIAL_LOAD_FACTOR) {

    private var store: Array<MutableList<MapEntry<K, T>>> = Array(capacity) { mutableListOf<MapEntry<K, T>>() }

    var size: Int = 0

    init {
        if (capacity > MAX_CAPACITY)
            capacity = MAX_CAPACITY
        if (loadFactor < 0.0f || loadFactor > 1.0f)
            loadFactor = INITIAL_LOAD_FACTOR
    }

    data class MapEntry<K, T>(var key: K, var value: T)

    operator fun set(key: K, value: T) {
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
    operator fun get(key: K): T? {
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
            store = Array(capacity * 2) { mutableListOf<MapEntry<K, T>>() }
            for (entries in temp)
                for(entry in entries)
                    this[entry.key] = entry.value
        }

    }

    private fun hash(key: K): Int = key.hashCode() % store.size

    private fun findEntry(key: K): MapEntry<K, T> = store[hash(key)].find { it.key == key }!!

    companion object {
        fun <K, T> emptyHashMap() = HashMap<K, T>()
        const val MAX_CAPACITY = 512 //make sure that it's the power of 2 minimize collisions
        const val INITIAL_LOAD_FACTOR = .75f
    }

}

fun main() {
    val hashMap = emptyHashMap<Any, Any>()
    hashMap[1] = 1
    check(hashMap[1] == 1)
    hashMap[1] = 2
    hashMap[2] = 2
    hashMap[3] = 3
    check(hashMap[1] == 2)
    check(hashMap[2] == 2)
    check(hashMap[3] == 3)
    println(hashMap.size)
    check(hashMap.size == 3)
    hashMap.remove(1)
    hashMap.remove(2)
    check(hashMap.size == 1)
    hashMap["this"] = "that"
    hashMap["yin"] = "yang"
    check(hashMap["this"] == "that")
    check(hashMap["yin"] == "yang")
}

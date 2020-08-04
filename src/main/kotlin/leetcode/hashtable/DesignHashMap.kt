package leetcode.hashtable

class DesignHashMap {

    data class Entry(val key: Int, val value: Int)

    /** Initialize your data structure here. */
    private val buckets = Array<ArrayList<Entry>>(100000) { ArrayList() }

    /** value will always be non-negative. */
    fun put(key: Int, value: Int) {
        remove(key)

        val hash = hash(key)
        val bucket = buckets[hash]

        bucket.add(Entry(key, value))
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    fun get(key: Int): Int {
        val hash = hash(key)
        val bucket = buckets[hash]

        for (e in bucket)
            if (e.key == key) return e.value

        return -1
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    fun remove(key: Int) {
        val hash = hash(key)
        val bucket = buckets[hash]
        var entry: Entry? = null

        for (e in bucket)
            if (e.key == key) {
                entry = e
                break
            }

        if (entry != null) bucket.remove(entry)
    }

    private fun hash(key: Int): Int = key % buckets.size

}

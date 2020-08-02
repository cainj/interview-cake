package leetcode.challenge.august

class HashSet {

    /** Initialize your data structure here. */
    private val hash = hashMapOf<Int, Int>()

    fun add(key: Int) {
        hash[key] = 1
    }

    fun remove(key: Int) {
        hash.remove(key)
    }

    /** Returns true if this set contains the specified element */
    fun contains(key: Int): Boolean = hash.containsKey(key)
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */

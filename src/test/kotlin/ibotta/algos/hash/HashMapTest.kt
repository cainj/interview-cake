package ibotta.algos.hash

import ibotta.algos.hash.HashMap
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HashMapTest {

    @Test
    fun simpleTest() {
        val hashMap = HashMap.emptyHashMap<Any, Any>()
        hashMap[1] = 1
        check(hashMap[1] == 1)
        hashMap[1] = 2
        hashMap[2] = 2
        hashMap[3] = 3
        Assertions.assertEquals(hashMap[1], 2)
        Assertions.assertEquals(hashMap[2], 2)
        Assertions.assertEquals(hashMap[3], 3)
        println(hashMap.size)
        Assertions.assertEquals(hashMap.size, 3)
        hashMap.remove(1)
        hashMap.remove(2)
        Assertions.assertEquals(hashMap.size, 1)
        hashMap["this"] = "that"
        hashMap["yin"] = "yang"
        Assertions.assertEquals(hashMap["this"], "that")
        Assertions.assertEquals(hashMap["yin"], "yang")
    }
}

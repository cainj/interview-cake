package leetcode.contest

class MakeFilesUnique {

    fun getFolderNames(names: Array<String>): Array<String> {
        val map = hashMapOf<String, Int>()

        for (i in names.indices) {
            val key = names[i]
            if (map.contains(key)) {
                var num = map[key]!!
                num++
                while (map.contains("$key(${num})")) num++
                names[i] = "$key(${num})"
                map[key] = num
                map["$key(${num})"] = 0
            } else map[key] = 0
        }

        return names
    }
}

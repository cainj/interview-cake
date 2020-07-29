package leetcode.challenge.june

class TaskScheduler {

    fun leastInterval(tasks: CharArray, n: Int): Int {
        val chars = IntArray(26)

        for (task in tasks)
            chars[task - 'A']++

        chars.sort()
        val max = chars[25] - 1
        var idleSlots = max * n

        for (i in 24 downTo 0)
            idleSlots -= Math.min(chars[i], max)


        idleSlots = Math.max(0, idleSlots)
        return idleSlots + tasks.size
    }
}

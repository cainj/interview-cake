package leetcode.stacks

import java.util.*

class DailyTemperatures {

    //Time complexity is O(n)
    //Space complexity is O(n)
    fun dailyTemperatures(T: IntArray): IntArray {
        val ans = IntArray(T.size)

        // brute force
        // for(i in T.indices)
        //     for(j in i..T.size - 1){
        //         if(T[i] < T[j]){
        //             ans[i] = j - i
        //             break
        //         }
        // }
        val stack = LinkedList<Pair<Int, Int>>()
        val n = T.size - 1

        for (i in n downTo 0) {
            while (stack.isNotEmpty() && T[i] >= stack.peek().second)
                stack.pop()

            if (stack.isNotEmpty())
                ans[i] = stack.peek().first - i

            stack.push(i to T[i])
        }

        return ans
    }
}

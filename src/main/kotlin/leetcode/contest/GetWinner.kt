package leetcode.contest

class GetWinner {

    fun getWinner(arr: IntArray, k: Int): Int {
        if (k >= arr.size) return arr.max()!!

        var wins = 0
        var max = 0

        for (i in 1 until arr.size) {
            if (arr[max] > arr[i]) wins++
            else {
                wins = 1
                max = i
            }

            if (wins == k) return arr[max]
        }

        return arr[max]
    }
}

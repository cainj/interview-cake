package leetcode.challenge.august

class SortParity {

    fun sortArrayByParity(A: IntArray): IntArray {
        var swapIndex = 0

        for (i in A.indices){
            if(A[i] % 2 == 0) {
                val temp = A[swapIndex]
                A[swapIndex++] = A[i]
                A[i] = temp
            }
        }
        return A
    }
}

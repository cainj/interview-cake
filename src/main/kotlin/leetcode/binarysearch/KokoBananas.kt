package leetcode.binarysearch

class KokoBananas {

    fun minEatingSpeed(piles: IntArray, H: Int): Int {
        fun kokoFinishedBananas(eatRate: Int): Boolean {
            var hours = 0
            var i = 0
            for (bananas in piles) {
                hours += (bananas / eatRate)
                if (bananas % eatRate != 0) hours++
                if (hours > H) return false
            }

            return true
        }

        var l = 1
        var r = piles.max() ?: 0

        while (l < r) {
            val mid = l + (r - l) / 2

            if (kokoFinishedBananas(mid)) r = mid
            else l = mid + 1
        }

        return l
    }
}

//piles = [3,6,7,11]
//hour 1: piles = [0,6,7,11]
//hour 2: piles = piles = [0,2,7,11]
//hour 3: piles = [0,0,7,11]
//hour 4: piles = [0,0,3,11]
//hour 5: piles = [0,0,0,11]
//hour 6: piles = [0,0,0,7]
//hour 7: piles = [0,0,0,3]
//hour 8: piles = [0,0,0,0]

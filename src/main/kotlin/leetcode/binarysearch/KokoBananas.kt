package leetcode.binarysearch

/**
 * Koko loves to eat bananas.  There are N piles of bananas, the i-th pile has piles[i] bananas.
 * The guards have gone and will come back in H hours.
 *
 * Koko can decide her bananas-per-hour eating speed of K.  Each hour, she chooses some pile of bananas,
 * and eats K bananas from that pile.  If the pile has less than K bananas, she eats all of them instead,
 * and won't eat any more bananas during this hour.
 * Koko likes to eat slowly, but still wants to finish eating all the bananas before the guards come back.
 *
 * Return the minimum integer K such that she can eat all the bananas within H hours.
 * Example 1:
 * Input: piles = [3,6,7,11], H = 8
 * Output: 4
 *
 * Example 2:
 * Input: piles = [30,11,23,4,20], H = 5
 * Output: 30
 *
 * Example 3:
 * Input: piles = [30,11,23,4,20], H = 6
 * Output: 23
 */

class KokoBananas {

    fun minEatingSpeed(piles: IntArray, H: Int): Int {
        fun kokoFinishedBananas(eatRate: Int): Boolean {
            var hours = 0

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

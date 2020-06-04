package leetcode.challenge.april

class StringShifts {

    fun stringShift(str: String, shifts: Array<IntArray>): String {
        var newString = str

        for (s in shifts)
            newString = shift(s[0], s[1], newString)

        return newString
    }

    private fun shift(direction: Int, amount: Int, str: String): String {
        var reserve = ""
        val shift = amount % str.length
        var rover = 0

        return when (direction) {
            0 -> {
                while (shift != rover) {
                    reserve += str[rover]
                    rover++
                }
                str.drop(shift) + reserve
            }
            1 -> {
                while (shift != rover) {
                    reserve = str[str.length - 1 - rover] + reserve
                    rover++
                }
                reserve + str.dropLast(shift)
            }

            else -> throw Exception("Does not meet requirements")
        }
    }
}

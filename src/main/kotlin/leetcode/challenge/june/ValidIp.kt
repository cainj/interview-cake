package leetcode.challenge.june

class ValidIp {

    fun validIPAddress(IP: String): String =
        when {
            isIPv4(IP) -> "IPv4"
            isIPv6(IP) -> "IPv6"
            else -> "Neither"
        }


    private fun isIPv4(ip: String): Boolean {
        val regex =
            Regex("^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$")
        if (!regex.matches(ip)) return false

        return true
    }

    private fun isIPv6(ip: String): Boolean {
        val s = ip.split(':')
        val regex = Regex("[0-9a-fA-F]{1,4}")

        if (s.size != 8) return false

        for (num in s)
            if (!regex.matches(num)) return false

        return true
    }
}

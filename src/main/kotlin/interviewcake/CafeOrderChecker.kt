package interviewcake


fun isFirstComeFirstServed(takeOutOrders: IntArray, dineInOrders: IntArray, servedOrders: IntArray): Boolean =
    checkOrderRecursive(takeOutOrders, dineInOrders, servedOrders)

private fun checkOrder(orders: IntArray, servedOrders: IntArray): Boolean {
    var servedIndex = 0
    var orderIndex = 0

    while (servedIndex < servedOrders.size && orderIndex < orders.size) {
        if (orders[orderIndex] == servedOrders[servedIndex])
            orderIndex++
        servedIndex++
    }
    return orderIndex == orders.size
}

fun checkOrderBruteForce(takeOutOrders: IntArray, dineInOrders: IntArray, servedOrders: IntArray): Boolean =
    checkOrder(takeOutOrders, servedOrders)
            && checkOrder(dineInOrders, servedOrders)
            && takeOutOrders.size + dineInOrders.size == servedOrders.size

private tailrec fun checkOrderRecursive(takeOutOrders: IntArray, dineInOrders: IntArray, servedOrders: IntArray): Boolean =
    if (takeOutOrders.isNotEmpty() && takeOutOrders[0] == servedOrders[0])
        checkOrderRecursive(
            takeOutOrders.copyOfRange(1, takeOutOrders.size),
            dineInOrders,
            servedOrders.copyOfRange(1, servedOrders.size)
        )
    else if (dineInOrders.isNotEmpty() && dineInOrders[0] == servedOrders[0])
        checkOrderRecursive(
            takeOutOrders,
            dineInOrders.copyOfRange(1, dineInOrders.size),
            servedOrders.copyOfRange(1, servedOrders.size)
        )
    else
        servedOrders.isEmpty() && takeOutOrders.isEmpty() && dineInOrders.isEmpty()

package interviewcake

fun reverse(originalHeadOfList: LinkedListNode?): LinkedListNode? {

    // take originalHeadOfList and create new head of list
    //check to see if the head of list is not null
    //if it is throw exception
    //if not check if it has next if it doesn't then it's reversed
    //if not then it's already revers

    if (originalHeadOfList?.next == null) return originalHeadOfList

    var currentHeadOfList = originalHeadOfList

    while (originalHeadOfList.next != null) {
        val hold = originalHeadOfList.next
        originalHeadOfList.next = hold?.next
        hold?.next = currentHeadOfList
        currentHeadOfList = hold
    }


    return currentHeadOfList
}

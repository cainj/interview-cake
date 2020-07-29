package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ExcelTitleColumnTest {

    @Test
    fun titleToNumber() {
        val tn = ExcelTitleColumn()
        assertEquals(27, tn.titleToNumber("AA"))
        assertEquals(28, tn.titleToNumber("AB"))
        assertEquals(701, tn.titleToNumber("ZY"))
        assertEquals(1, tn.titleToNumber("A"))
    }
}

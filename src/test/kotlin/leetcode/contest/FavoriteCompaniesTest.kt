package leetcode.contest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FavoriteCompaniesTest {

    @Test
    fun peopleIndexes() {
        val fc = FavoriteCompanies()
        assertEquals(
            listOf(0, 1, 4),
            fc.peopleIndexes(
                listOf(
                    listOf("leetcode", "google", "facebook"),
                    listOf("google", "microsoft"),
                    listOf("google", "facebook"),
                    listOf("google"),
                    listOf("amazon")
                )
            )
        )
    }
}

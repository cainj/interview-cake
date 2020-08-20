package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GoatLatinTest {

    @Test
    fun toGoatLatin() {
        val goatLatin = GoatLatin()
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", goatLatin.toGoatLatin("I speak Goat Latin"))
        assertEquals(
            "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
            goatLatin.toGoatLatin("The quick brown fox jumped over the lazy dog")
        )
    }
}

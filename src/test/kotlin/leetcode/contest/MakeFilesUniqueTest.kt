package leetcode.contest

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MakeFilesUniqueTest {

    @Test
    fun getFolderNames() {
        val makeFilesUnique = MakeFilesUnique()
        Assertions.assertArrayEquals(
            arrayOf("pes", "fifa", "gta", "pes(2019)"),
            makeFilesUnique.getFolderNames(arrayOf("pes", "fifa", "gta", "pes(2019)"))
        )
        Assertions.assertArrayEquals(
            arrayOf("gta", "gta(1)", "gta(2)", "avalon"),
            makeFilesUnique.getFolderNames(arrayOf("gta", "gta(1)", "gta", "avalon"))
        )
        Assertions.assertArrayEquals(
            arrayOf("onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece(4)"),
            makeFilesUnique.getFolderNames(arrayOf("onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece"))
        )
        Assertions.assertArrayEquals(
            arrayOf("wano", "wano(1)", "wano(2)", "wano(3)"),
            makeFilesUnique.getFolderNames(arrayOf("wano", "wano", "wano", "wano"))
        )
        Assertions.assertArrayEquals(
            arrayOf("kaido","kaido(1)","kaido(2)","kaido(1)(1)"),
            makeFilesUnique.getFolderNames(arrayOf("kaido", "kaido(1)", "kaido", "kaido(1)"))
        )
    }
}

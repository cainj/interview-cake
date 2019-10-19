package interviewcake

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*


class WordCloudDataTest {

    // tests

    // There are lots of valid solutions for this one. You
    // might have to edit some of these tests if you made
    // different design decisions in your solution.

    @Test
    fun simpleSentenceTest() {
        val text = "I like cake"
        val expected = object : HashMap<String, Int>() {
            init {
                put("I", 1)
                put("like", 1)
                put("cake", 1)
            }
        }
        val actual = WordCloudData(text)
        assertEquals(expected, actual.getWordsToCounts())
    }

    @Test
    fun longerSentenceTest() {
        val text = "Chocolate cake for dinner and pound cake for dessert"
        val expected = object : HashMap<String, Int>() {
            init {
                put("and", 1)
                put("pound", 1)
                put("for", 2)
                put("dessert", 1)
                put("Chocolate", 1)
                put("dinner", 1)
                put("cake", 2)
            }
        }
        val actual = WordCloudData(text)
        assertEquals(expected, actual.getWordsToCounts())
    }

    @Test
    fun punctuationTest() {
        val text = "Strawberry short cake? Yum!"
        val expected = object : HashMap<String, Int>() {
            init {
                put("cake", 1)
                put("Strawberry", 1)
                put("short", 1)
                put("Yum", 1)
            }
        }
        val actual = WordCloudData(text)
        assertEquals(expected, actual.getWordsToCounts())
    }

    @Test
    fun hyphenatedWordsTest() {
        val text = "Dessert - mille-feuille cake"
        val expected = HashMap<String, Int>()
        expected.apply {
            put("cake", 1)
            put("Dessert", 1)
            put("mille-feuille", 1)
        }
        val actual = WordCloudData(text)
        assertEquals(expected, actual.getWordsToCounts())
    }

    @Test
    fun ellipsesBetweenWordsTest() {
        val text = "Mmm...mmm...decisions...decisions"
        val expected = object : HashMap<String, Int>() {
            init {
                put("Mmm", 1)
                put("mmm", 1)
                put("decisions", 2)
            }
        }
        val actual = WordCloudData(text)
        assertEquals(expected, actual.getWordsToCounts())
    }

    @Test
    fun apostrophesTest() {
        val text = "Allie's Bakery: Sasha's Cakes"
        val expected = object : HashMap<String, Int>() {
            init {
                put("Bakery", 1)
                put("Cakes", 1)
                put("Allie's", 1)
                put("Sasha's", 1)
            }
        }
        val actual = WordCloudData(text)
        assertEquals(expected, actual.getWordsToCounts())
    }

    @Test
    fun complicatedTest() {
        val text =   "We came, we saw, we conquered...then we ate Bill's (Mille-Feuille) cake.  The bill came to five dollars."
        val expected = object : HashMap<String, Int>() {
            init {
                put("We", 1)
                put("we", 3)
                put("came", 2)
                put("saw", 1)
                put("conquered", 1)
                put("then", 1)
                put("ate", 1)
                put("Bill's", 1)
                put("Mille-Feuille", 1)
                put("cake", 1)
                put("The", 1)
                put("bill", 1)
                put("to", 1)
                put("five", 1)
                put("dollars", 1)
            }
        }
        val actual = WordCloudData(text)
        assertEquals(expected, actual.getWordsToCounts())
    }
}
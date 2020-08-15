package leetcode.challenge.august

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class NonOverlappingIntervalsTest {

    @Test
    fun test() {
        val nol = NonOverlappingIntervals()
        assertEquals(
            1,
            nol.eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(3, 4)))
        )

        assertEquals(
            187, nol.eraseOverlapIntervals(
                arrayOf(
                    intArrayOf(-100, -87),
                    intArrayOf(-99, -44),
                    intArrayOf(-98, -19),
                    intArrayOf(-97, -33),
                    intArrayOf(-96, -60),
                    intArrayOf(-95, -17),
                    intArrayOf(-94, -44),
                    intArrayOf(-93, -9),
                    intArrayOf(-92, -63),
                    intArrayOf(-91, -76),
                    intArrayOf(-90, -44),
                    intArrayOf(-89, -18),
                    intArrayOf(-88, 10),
                    intArrayOf(-87, -39),
                    intArrayOf(-86, 7),
                    intArrayOf(-85, -76),
                    intArrayOf(-84, -51),
                    intArrayOf(-83, -48),
                    intArrayOf(-82, -36),
                    intArrayOf(-81, -63),
                    intArrayOf(-80, -71),
                    intArrayOf(-79, -4),
                    intArrayOf(-78, -63),
                    intArrayOf(-77, -14),
                    intArrayOf(-76, -10),
                    intArrayOf(-75, -36),
                    intArrayOf(-74, 31),
                    intArrayOf(-73, 11),
                    intArrayOf(-72, -50),
                    intArrayOf(-71, -30),
                    intArrayOf(-70, 33),
                    intArrayOf(-69, -37),
                    intArrayOf(-68, -50),
                    intArrayOf(-67, 6),
                    intArrayOf(-66, -50),
                    intArrayOf(-65, -26),
                    intArrayOf(-64, 21),
                    intArrayOf(-63, -8),
                    intArrayOf(-62, 23),
                    intArrayOf(-61, -34),
                    intArrayOf(-60, 13),
                    intArrayOf(-59, 19),
                    intArrayOf(-58, 41),
                    intArrayOf(-57, -15),
                    intArrayOf(-56, 35),
                    intArrayOf(-55, -4),
                    intArrayOf(-54, -20),
                    intArrayOf(-53, 44),
                    intArrayOf(-52, 48),
                    intArrayOf(-51, 12),
                    intArrayOf(-50, -43),
                    intArrayOf(-49, 10),
                    intArrayOf(-48, -34),
                    intArrayOf(-47, 3),
                    intArrayOf(-46, 28),
                    intArrayOf(-45, 51),
                    intArrayOf(-44, -14),
                    intArrayOf(-43, 59),
                    intArrayOf(-42, -6),
                    intArrayOf(-41, -32),
                    intArrayOf(-40, -12),
                    intArrayOf(-39, 33),
                    intArrayOf(-38, 17),
                    intArrayOf(-37, -7),
                    intArrayOf(-36, -29),
                    intArrayOf(-35, 24),
                    intArrayOf(-34, 49),
                    intArrayOf(-33, -19),
                    intArrayOf(-32, 2),
                    intArrayOf(-31, 8),
                    intArrayOf(-30, 74),
                    intArrayOf(-29, 58),
                    intArrayOf(-28, 13),
                    intArrayOf(-27, -8),
                    intArrayOf(-26, 45),
                    intArrayOf(-25, -5),
                    intArrayOf(-24, 45),
                    intArrayOf(-23, 19),
                    intArrayOf(-22, 9),
                    intArrayOf(-21, 54),
                    intArrayOf(-20, 1),
                    intArrayOf(-19, 81),
                    intArrayOf(-18, 17),
                    intArrayOf(-17, -10),
                    intArrayOf(-16, 7),
                    intArrayOf(-15, 86),
                    intArrayOf(-14, -3),
                    intArrayOf(-13, -3),
                    intArrayOf(-12, 45),
                    intArrayOf(-11, 93),
                    intArrayOf(-10, 84),
                    intArrayOf(-9, 20),
                    intArrayOf(-8, 3),
                    intArrayOf(-7, 81),
                    intArrayOf(-6, 52),
                    intArrayOf(-5, 67),
                    intArrayOf(-4, 18),
                    intArrayOf(-3, 40),
                    intArrayOf(-2, 42),
                    intArrayOf(-1, 49),
                    intArrayOf(0, 7),
                    intArrayOf(1, 104),
                    intArrayOf(2, 79),
                    intArrayOf(3, 37),
                    intArrayOf(4, 47),
                    intArrayOf(5, 69),
                    intArrayOf(6, 89),
                    intArrayOf(7, 110),
                    intArrayOf(8, 108),
                    intArrayOf(9, 19),
                    intArrayOf(10, 25),
                    intArrayOf(11, 48),
                    intArrayOf(12, 63),
                    intArrayOf(13, 94),
                    intArrayOf(14, 55),
                    intArrayOf(15, 119),
                    intArrayOf(16, 64),
                    intArrayOf(17, 122),
                    intArrayOf(18, 92),
                    intArrayOf(19, 37),
                    intArrayOf(20, 86),
                    intArrayOf(21, 84),
                    intArrayOf(22, 122),
                    intArrayOf(23, 37),
                    intArrayOf(24, 125),
                    intArrayOf(25, 99),
                    intArrayOf(26, 45),
                    intArrayOf(27, 63),
                    intArrayOf(28, 40),
                    intArrayOf(29, 97),
                    intArrayOf(30, 78),
                    intArrayOf(31, 102),
                    intArrayOf(32, 120),
                    intArrayOf(33, 91),
                    intArrayOf(34, 107),
                    intArrayOf(35, 62),
                    intArrayOf(36, 137),
                    intArrayOf(37, 55),
                    intArrayOf(38, 115),
                    intArrayOf(39, 46),
                    intArrayOf(40, 136),
                    intArrayOf(41, 78),
                    intArrayOf(42, 86),
                    intArrayOf(43, 106),
                    intArrayOf(44, 66),
                    intArrayOf(45, 141),
                    intArrayOf(46, 92),
                    intArrayOf(47, 132),
                    intArrayOf(48, 89),
                    intArrayOf(49, 61),
                    intArrayOf(50, 128),
                    intArrayOf(51, 155),
                    intArrayOf(52, 153),
                    intArrayOf(53, 78),
                    intArrayOf(54, 114),
                    intArrayOf(55, 84),
                    intArrayOf(56, 151),
                    intArrayOf(57, 123),
                    intArrayOf(58, 69),
                    intArrayOf(59, 91),
                    intArrayOf(60, 89),
                    intArrayOf(61, 73),
                    intArrayOf(62, 81),
                    intArrayOf(63, 139),
                    intArrayOf(64, 108),
                    intArrayOf(65, 165),
                    intArrayOf(66, 92),
                    intArrayOf(67, 117),
                    intArrayOf(68, 140),
                    intArrayOf(69, 109),
                    intArrayOf(70, 102),
                    intArrayOf(71, 171),
                    intArrayOf(72, 141),
                    intArrayOf(73, 117),
                    intArrayOf(74, 124),
                    intArrayOf(75, 171),
                    intArrayOf(76, 132),
                    intArrayOf(77, 142),
                    intArrayOf(78, 107),
                    intArrayOf(79, 132),
                    intArrayOf(80, 171),
                    intArrayOf(81, 104),
                    intArrayOf(82, 160),
                    intArrayOf(83, 128),
                    intArrayOf(84, 137),
                    intArrayOf(85, 176),
                    intArrayOf(86, 188),
                    intArrayOf(87, 178),
                    intArrayOf(88, 117),
                    intArrayOf(89, 115),
                    intArrayOf(90, 140),
                    intArrayOf(91, 165),
                    intArrayOf(92, 133),
                    intArrayOf(93, 114),
                    intArrayOf(94, 125),
                    intArrayOf(95, 135),
                    intArrayOf(96, 144),
                    intArrayOf(97, 114),
                    intArrayOf(98, 183),
                    intArrayOf(99, 157)
                )
            )
        )
    }
}

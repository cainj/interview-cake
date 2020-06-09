package hackerrank.codepair

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class VehicleTest {

    @Test
    fun buildVehicle() {

        val deps = hashMapOf<String, List<String>>()
        deps["wheel"] = listOf("tire", "rim")
        deps["tire"] = listOf("rubber")
        deps["rim"] = listOf("cast-metal", "bolts")
        deps["vehicle"] = listOf("wheel", "engine", "window")
        deps["engine"] = listOf("bolts", "cast-metal", "oil")
        deps["window"] = listOf("glass")

        val vehicle = Vehicle()
        assertEquals(
            listOf(
                "rubber",
                "tire",
                "cast-metal",
                "bolts",
                "rim",
                "wheel",
                "oil",
                "engine",
                "glass",
                "window",
                "vehicle"
            ), vehicle.buildVehicle(deps)
        )
    }
}

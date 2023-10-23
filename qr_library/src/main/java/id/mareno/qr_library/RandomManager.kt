package id.mareno.qr_library

import kotlin.random.Random

/**
 * Utility class for generating random integers using a fixed seed.
 *
 * This class provides a simple way to generate random integers with a fixed seed value. The seed value determines
 * the initial state of the random number generator, making the generated sequence repeatable.
 * @author Samuel Mareno
 */
class RandomManager {
    /**
     * Generates a random integer using the specified seed.
     *
     * @return A random integer value.
     *
     * This method generates a random integer based on the seed value provided during the initialization
     * of the [RandomManager]. The use of a fixed seed ensures that the generated sequence is consistent
     * across multiple invocations.
     *
     * @author Samuel Mareno
     */
    fun generateRandom(): Int {
        return Random(1).nextInt()
    }
}

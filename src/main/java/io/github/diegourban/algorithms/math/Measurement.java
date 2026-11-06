package io.github.diegourban.algorithms.math;

/**
 * Unit conversions between miles and kilometers.
 * <p>
 * The two factors are not exact inverses of each other, so a round trip does not return exactly the original value.
 */
public final class Measurement {

    private Measurement() {}

    /**
     * Converts miles to kilometers, using 1 mile = 1.609344 km
     *
     * @param miles the amount of miles to convert
     * @return the amount of miles converted to kilometers
     */
    public static double milesToKilometers(final double miles) {
        return miles * 1.609344;
    }

    /**
     * Converts kilometers to miles, using 1 km = 0.621371 miles
     *
     * @param kilometers the amount of kilometers to convert
     * @return the amount of kilometers converted to miles
     */
    public static double kilometersToMiles(final double kilometers) {
        return kilometers * 0.621371;
    }
}

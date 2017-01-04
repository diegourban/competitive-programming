package urban.common.math;

public class Measurement {

    /**
     * Converts miles to kilometers
     *
     * @param miles the amount of miles to convert
     * @return the amount of miles converted to kilometers
     */
    public static double milesToKilometers(double miles) {
        return miles * 1.609344;
    }

    /**
     * Converts kilometers to miles
     *
     * @param kilometers the amount of kilometers to convert
     * @return the amount of kilometers converted to miles
     */
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

}

package io.github.diegourban.algorithms.math;

import java.util.Arrays;

/**
 * Descriptive statistics over arrays of {@code double}: mean, median, mode and mean absolute deviation.
 */
public final class Statistics {

    private Statistics() {}

    /**
     * An average is the sum of a list of numbers divided by the number of
     * numbers in the list.
     *
     * @param data the values to average
     * @return the arithmetic mean of {@code data}, or {@code 0.0} if it is empty
     */
    public static double mean(final double[] data) {
        if (data.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (final double value : data) {
            sum += value;
        }

        return sum / data.length;
    }

    /**
     * The median is the value separating the higher half of a data sample from the lower half.
     * <p>
     * Note: {@code data} is sorted in place, so the caller's array is modified. Pass a copy to keep the original
     * order.
     *
     * @param data the values; must not be empty, and is sorted ascending as a side effect
     * @return the middle value for an odd number of values, or the mean of the two middle values for an even number
     * @throws IllegalArgumentException if {@code data} is empty
     */
    public static double median(final double[] data) {
        requireNotEmpty(data);
        Arrays.sort(data);

        final int middle = data.length / 2;

        if (data.length % 2 == 1) {
            return data[middle];
        }

        return (data[middle - 1] + data[middle]) / 2.0;
    }

    /**
     * The mode is the value that appears most often in a set of data.
     * <p>
     * Values are compared with {@code ==}. Runs in O(n²) time.
     *
     * @param data the values
     * @return the most frequent value; on a tie, the one that appears first in {@code data}; {@code 0.0} if
     *     {@code data} is empty
     */
    public static double mode(final double[] data) {
        double maxValue = 0;
        int maxCount = 0;

        for (int i = 0; i < data.length; ++i) {
            int count = 0;
            for (int j = 0; j < data.length; ++j) {
                if (data[j] == data[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = data[i];
            }
        }

        return maxValue;
    }

    /**
     * The average absolute deviation (or mean absolute deviation) of a data set
     * is the average of the absolute deviations from a central point; here the central point is the
     * {@linkplain #mean(double[]) mean}.
     *
     * @param data the values
     * @return the Average Absolute Deviation from data
     * @throws IllegalArgumentException if {@code data} is empty
     */
    public static double meanAbsoluteDeviation(final double[] data) {
        requireNotEmpty(data);
        final double mean = mean(data);

        double sum = 0;
        for (final double value : data) {
            sum += Math.abs(value - mean);
        }

        return sum / data.length;
    }

    private static void requireNotEmpty(final double[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("data must not be empty");
        }
    }
}

package urban.common.math;

import java.util.Arrays;

public class Statistics {

    /**
     * An average is the sum of a list of numbers divided by the number of
     * numbers in the list.
     *
     * @param data
     * @return
     */
    public static double mean(int[] data) {
        if (data.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (int value : data) {
            sum += value;
        }

        return sum / data.length;
    }

    /**
     * The median is the value separating the higher half of a data sample
     *
     * @param data
     * @return
     */
    public static double median(int[] data) {
        Arrays.sort(data);

        final int middle = data.length / 2;

        if (data.length % 2 == 1) {
            return data[middle];
        }

        return (data[middle - 1] + data[middle]) / 2.0;
    }

    /**
     * The mode is the value that appears most often in a set of data.
     *
     * @param data
     * @return
     */
    public static int mode(int[] data) {
        int maxValue = 0, maxCount = 0;

        for (int i = 0; i < data.length; ++i) {
            int count = 0;
            for (int j = 0; j < data.length; ++j) {
                if (data[j] == data[i])
                    ++count;
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
     * is the average of the absolute deviations from a central point
     *
     * @param data
     * @return the Average Absolute Deviation from data
     */
    public static double meanAbsoluteDeviation(int[] data) {
        double mean = mean(data);

        double sum = 0;
        for (int value : data) {
            sum += Math.abs(value - mean);
        }

        return sum / data.length;
    }

}

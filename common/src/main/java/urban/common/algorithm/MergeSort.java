package urban.common.algorithm;

public class MergeSort {

    public Double[] sort(final Double[] firstGroup, final Double[] secondGroup) {
        final int total = firstGroup.length + secondGroup.length;
        Double[] result = new Double[total];

        int current = 0;
        int currentFirstGroup = 0;
        int currentSecondGroup = 0;

        while(currentFirstGroup < firstGroup.length && currentSecondGroup < secondGroup.length) {
            final Double firstValue = firstGroup[currentFirstGroup];
            final Double secondValue = secondGroup[currentSecondGroup];

            if(firstValue < secondValue) {
                result[current] = firstValue;
                currentFirstGroup++;
            } else {
                result[current] = secondValue;
                currentSecondGroup++;
            }

            current++;
        }

        // values left at first group
        while(currentFirstGroup < firstGroup.length) {
            result[current] = firstGroup[currentFirstGroup];
            current++;
            currentFirstGroup++;
        }

        // values left at second group
        while(currentSecondGroup < secondGroup.length) {
            result[current] = secondGroup[currentSecondGroup];
            current++;
            currentSecondGroup++;
        }

        return result;
    }

}

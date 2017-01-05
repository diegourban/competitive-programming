package urban.codewars.kyu8;

public class NoBoring {

    public static int noBoringZeros(int theNumber) {
        String nStr = String.valueOf(theNumber);
        nStr = nStr.replaceAll("0+$", "");
        if (nStr.isEmpty()) {
            return 0;
        }
        return Integer.valueOf(nStr);
    }

    public static int noBoringZerosBestPractice(int theNumber) {
        if (theNumber == 0) {
            return theNumber;
        }

        int theNumberWithNoboringZeroes = theNumber;
        while (theNumberWithNoboringZeroes % 10 == 0) {
            theNumberWithNoboringZeroes /= 10;
        }

        return theNumberWithNoboringZeroes;
    }

}

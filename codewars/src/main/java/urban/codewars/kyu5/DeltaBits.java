package urban.codewars.kyu5;

public class DeltaBits {

    /**
     * Write a function convertBits to determine the number of bits required to
     * convert positive integer A to positive integer B.
     * <p>
     * For example, you can change 31 to 14 by flipping the 4th and 0th bit:
     * <p>
     * 31 0 0 0 1 1 1 1 1 <br/>
     * 14 0 0 0 0 1 1 1 0
     */
    public static int convertBits(int a, int b) {
        int numberOfFlips = 0;
        int difference = a ^ b;
        numberOfFlips = Integer.bitCount(difference);
        return numberOfFlips;
    }

    public static int convertBitsSimple(int a, int b) {
        return Integer.bitCount(a ^ b);
    }

}

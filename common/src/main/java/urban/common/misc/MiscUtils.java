package urban.common.misc;

/**
 * Created by Diego on 01/07/2017.
 */
public class MiscUtils {

    /**
     * A function to tell us if a full deck of cards shuffledDeck is a single riffle of two other halves half1 and half2.
     * <p>
     * We walk through shuffledDeck, seeing if each card so far could have come from a riffle of the other two halves.
     * <p>
     * Complexity: O(n) time and O(1) additional space.
     *
     * @param half1
     * @param half2
     * @param shuffledDeck
     * @return true if is single riffle of two other halves
     */
    public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck) {
        int half1Index = 0;
        int half2Index = 0;
        int half1MaxIndex = half1.length - 1;
        int half2MaxIndex = half2.length - 1;

        for (int card : shuffledDeck) {

            // if we still have cards in half1
            // and the "top" card in half1 is the same
            // as the top card in shuffledDeck
            if (half1Index <= half1MaxIndex
                    && card == half1[half1Index]) {
                half1Index++;

                // if we still have cards in half2
                // and the "top" card in half2 is the same
                // as the top card in shuffledDeck
            } else if (half2Index <= half2MaxIndex
                    && card == half2[half2Index]) {
                half2Index++;

                // if the top card in shuffledDeck doesn't match the top
                // card in half1 or half2, this isn't a single riffle.
            } else {
                return false;
            }
        }

        // all cards in shuffledDeck have been "accounted for"
        // so this is a single riffle!
        return true;
    }
}

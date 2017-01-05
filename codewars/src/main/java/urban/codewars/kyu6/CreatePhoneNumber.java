package urban.codewars.kyu6;

/*
 * https://www.codewars.com/kata/create-phone-number
 */
public class CreatePhoneNumber {

    private static final String PHONE_FORMAT = "(%d%d%d) %d%d%d-%d%d%d%d";

    public static String createPhoneNumber(int[] numbers) {
        return String.format(PHONE_FORMAT, numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5],
                numbers[6], numbers[7], numbers[8], numbers[9]);
    }

}

package urban.codewars.kyu7;

/*
 * Description:
 * 
 * We want to generate a function that computes the series starting from 0 and
 * ending untill the given number following the sequence:
 * 
 * 0 1 3 6 10 15 21 28 36 45 55 ....
 * 
 * Wich is created by
 * 
 * 0, 0+1, 0+1+2, 0+1+2+3, 0+1+2+3+4, 0+1+2+3+4+5, 0+1+2+3+4+5+6,
 * 0+1+2+3+4+5+6+7 etc..
 * 
 */
public class SequenceSum {

    public static String showSequence(int value) {
        if (value < 0) {
            return value + "<0";
        }

        if (value == 0) {
            return "0=0";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= value; i++) {
            result = result.append(i + "+");
        }
        result = result.deleteCharAt(result.length() - 1);

        int total = (value * (value + 1) / 2);
        result = result.append(" = " + total);

        return result.toString();
    }

}

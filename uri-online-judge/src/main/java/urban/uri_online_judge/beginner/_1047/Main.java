package urban.uri_online_judge.beginner._1047;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Game Time with Minutes
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1047
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static int hours = 0;
    private static int minutes = 0;

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int initialHour = reader.nextInt();
        int initialMinute = reader.nextInt();
        int finalHour = reader.nextInt();
        int finalMinute = reader.nextInt();
        reader.close();

        hours = 0;
        minutes = 0;

        if (finalHour > initialHour) {
            // handle games within the same day
            hours = finalHour - initialHour;
            handleMinutes(initialMinute, finalMinute);
        } else if (finalHour < initialHour) {
            // handle games beginning at one day and ending at the next)
            hours = 24 - (initialHour - finalHour);
            handleMinutes(initialMinute, finalMinute);
        } else {
            // handle 23 to 24(max) hours games
            hours = 24;
            handleMinutes(initialMinute, finalMinute);
        }

        return "O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)" + System.lineSeparator();
    }

    private static void handleMinutes(int initialMinute, int finalMinute) {
        if (finalMinute > initialMinute) {
            if (hours == 24) {
                hours = 0;
            }
            minutes = finalMinute - initialMinute;
        } else if (finalMinute < initialMinute) {
            hours--;
            minutes = 60 - (initialMinute - finalMinute);
        } else {
            minutes = finalMinute - initialMinute;
        }
    }

}

package urban.uri_online_judge.beginner._2486;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * C Mais ou Menos?
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2486
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final Pattern p = Pattern.compile("(\\d+)\\s([a-z|\\s]+)");

    private static final Map<String, Integer> VITAMINC;

    static {
        VITAMINC = new HashMap<>();
        VITAMINC.put("suco de laranja", 120);
        VITAMINC.put("morango fresco", 85);
        VITAMINC.put("mamao", 85);
        VITAMINC.put("goiaba vermelha", 70);
        VITAMINC.put("manga", 56);
        VITAMINC.put("laranja", 50);
        VITAMINC.put("brocolis", 34);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        StringBuilder sb = new StringBuilder();

        int t = reader.nextInt();
        while (t != 0) {
            int sum = 0;
            for (int i = 0; i < t; i++) {
                String n = reader.readLine();

                Matcher m = p.matcher(n);
                while (m.find()) {
                    int amount = Integer.parseInt(m.group(1));
                    String food = m.group(2);
                    sum += amount * VITAMINC.get(food);
                }
            }
            if (sum < 110) {
                sb.append("Mais ").append(110 - sum);
            } else if (sum > 130) {
                sb.append("Menos ").append(sum - 130);
            } else {
                sb.append(sum);
            }
            sb.append(" mg").append(System.lineSeparator());

            t = reader.nextInt();
        }
        reader.close();

        return sb.toString();
    }

}
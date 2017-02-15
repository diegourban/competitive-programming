package urban.uri_online_judge.structures._1023;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Drought
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1023
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat fmt;

    static {
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        dfs.setDecimalSeparator('.');
        fmt = new DecimalFormat("#0.00", dfs);
        fmt.setRoundingMode(RoundingMode.DOWN);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int n = reader.nextInt();

        StringBuilder sb = new StringBuilder();
        int index = 1;
        while (n != 0) {
            SortedMap<Integer, Integer> consumptionPerProperty = new TreeMap<>();

            long totalConsumers = 0;
            long totalConsumption = 0;

            for (int i = 0; i < n; i++) {
                final int x = reader.nextInt();
                final int y = reader.nextInt();

                totalConsumers += x;
                totalConsumption += y;
                int avg = y / x;

                if (consumptionPerProperty.containsKey(avg)) {
                    int consumers = consumptionPerProperty.get(avg);
                    consumers += x;
                    consumptionPerProperty.put(avg, consumers);
                } else {
                    consumptionPerProperty.put(avg, x);
                }
            }

            sb.append("Cidade# ").append(index).append(":").append(System.lineSeparator());
            for (Map.Entry<Integer, Integer> entry : consumptionPerProperty.entrySet()) {
                sb.append(entry.getValue()).append("-").append(entry.getKey()).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(System.lineSeparator());
            sb.append("Consumo medio: ").append(fmt.format(totalConsumption / (totalConsumers * 1.0))).append(" m3.").append(System.lineSeparator());

            n = reader.nextInt();
            if (n != 0) {
                sb.append(System.lineSeparator());
            }
            index++;
        }

        return sb.toString();
    }

}

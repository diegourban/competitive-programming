package urban.uri_online_judge.adhoc._1171;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Number Frequence
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1467
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        StringBuilder sb = new StringBuilder();
        SortedMap<Integer, Integer> map = new TreeMap<>();

        final int n = reader.nextInt();
        for(int i = 0; i < n; i++) {
            int x = reader.nextInt();
            if(map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        reader.close();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(" aparece ").append(entry.getValue()).append(" vez(es)").append(System.lineSeparator());
        }

        return sb.toString();
    }

}

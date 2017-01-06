package urban.uri_online_judge.beginner._1050;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Animal
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1050
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final Map<Integer, String> DDD;

    static {
        DDD = new HashMap<>();

        DDD.put(61, "Brasilia");
        DDD.put(71, "Salvador");
        DDD.put(11, "Sao Paulo");
        DDD.put(21, "Rio de Janeiro");
        DDD.put(32, "Juiz de Fora");
        DDD.put(19, "Campinas");
        DDD.put(27, "Vitoria");
        DDD.put(31, "Belo Horizonte");
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int ddd = reader.nextInt();
        reader.close();

        String value = DDD.get(ddd);
        if (value == null) {
            return "DDD nao cadastrado" + System.lineSeparator();
        }

        return value + System.lineSeparator();
    }

}

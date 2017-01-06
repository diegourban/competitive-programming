package urban.uri_online_judge.beginner._1049;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Animal
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1049
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final Map<String, Map<String, Map<String, String>>> GROUPS;

    static {
        GROUPS = new HashMap<>();

        // vertebrates
        Map<String, Map<String, String>> vertebrateSubgroups = new HashMap<>();
        Map<String, String> birdSpecies = new HashMap<>();
        birdSpecies.put("carnivoro", "aguia");
        birdSpecies.put("onivoro", "pomba");
        vertebrateSubgroups.put("ave", birdSpecies);

        Map<String, String> mamalSpecies = new HashMap<>();
        mamalSpecies.put("onivoro", "homem");
        mamalSpecies.put("herbivoro", "vaca");
        vertebrateSubgroups.put("mamifero", mamalSpecies);
        GROUPS.put("vertebrado", vertebrateSubgroups);

        // invertebrates
        Map<String, Map<String, String>> invertebrateSubgroups = new HashMap<>();
        Map<String, String> insectSpecies = new HashMap<>();
        insectSpecies.put("hematofago", "pulga");
        insectSpecies.put("herbivoro", "lagarta");
        invertebrateSubgroups.put("inseto", insectSpecies);

        Map<String, String> annelidSpecies = new HashMap<>();
        annelidSpecies.put("hematofago", "sanguessuga");
        annelidSpecies.put("onivoro", "minhoca");
        invertebrateSubgroups.put("anelideo", annelidSpecies);
        GROUPS.put("invertebrado", invertebrateSubgroups);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        String group = reader.readLine();
        String subgroup = reader.readLine();
        String classification = reader.readLine();
        reader.close();

        return GROUPS.get(group).get(subgroup).get(classification) + System.lineSeparator();
    }

}

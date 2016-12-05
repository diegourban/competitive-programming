package urban.uri_online_judge.beginner._1828;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import urban.uri_online_judge.Reader;

/**
 * Bazinga!
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1828
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final String SCISSORS = "tesoura";
	private static final String PAPER = "papel";
	private static final String ROCK = "pedra";
	private static final String LIZARD = "lagarto";
	private static final String SPOCK = "Spock";

	private static final Map<String, Set<String>> INCIDENCES;

	static {
		INCIDENCES = new HashMap<>(5);

		Set<String> scissorsLoseTo = new HashSet<>(2);
		scissorsLoseTo.add(ROCK);
		scissorsLoseTo.add(SPOCK);
		INCIDENCES.put(SCISSORS, scissorsLoseTo);

		Set<String> paperLoseTo = new HashSet<>(2);
		paperLoseTo.add(SCISSORS);
		paperLoseTo.add(LIZARD);
		INCIDENCES.put(PAPER, paperLoseTo);

		Set<String> rockLoseTo = new HashSet<>(2);
		rockLoseTo.add(PAPER);
		rockLoseTo.add(SPOCK);
		INCIDENCES.put(ROCK, rockLoseTo);

		Set<String> lizardLoseTo = new HashSet<>(2);
		lizardLoseTo.add(ROCK);
		lizardLoseTo.add(SCISSORS);
		INCIDENCES.put(LIZARD, lizardLoseTo);

		Set<String> spockLoseTo = new HashSet<>(2);
		spockLoseTo.add(PAPER);
		spockLoseTo.add(LIZARD);
		INCIDENCES.put(SPOCK, spockLoseTo);
	}

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		int t = reader.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= t; i++) {
			String[] options = reader.readLine().split(" ");

			sb.append("Caso #").append(i).append(": ");

			if (options[0].equals(options[1])) {
				sb.append("De novo!");
			} else {
				if (INCIDENCES.get(options[0]).contains(options[1])) {
					sb.append("Raj trapaceou!");
				} else {
					sb.append("Bazinga!");
				}
			}

			sb.append(System.lineSeparator());
		}
		reader.close();

		return sb.toString();
	}

}

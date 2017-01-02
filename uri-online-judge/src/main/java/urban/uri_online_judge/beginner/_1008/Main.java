package urban.uri_online_judge.beginner._1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Salary
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1008
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {
	
	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
		int employeeNumber = Integer.parseInt(reader.readLine());
		int workedHours = Integer.parseInt(reader.readLine());
		double amountPerHour = Double.parseDouble(reader.readLine());
		double salary = workedHours * amountPerHour;
		
		reader.close();
		
		return String.format(Locale.ROOT, "NUMBER = %d" + System.lineSeparator() + "SALARY = U$ %.2f", employeeNumber, salary) + System.lineSeparator();
	}

}

package urban.uri_online_judge.beginner._1048;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Salary Increase
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1048
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final String LS = System.lineSeparator();
	private static final NumberFormat formatter;

	static {
		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		formatter = new DecimalFormat("#0.00", decimalFormatSymbols);
	}

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		double salary = reader.nextDouble();
		reader.close();

		StringBuilder sb = new StringBuilder();

		double increase = 0;
		double newSalary = 0;
		int percentage = 0;

		if (salary <= 400) {
			percentage = 15;
		} else if (salary <= 800) {
			percentage = 12;
		} else if (salary <= 1200) {
			percentage = 10;
		} else if (salary <= 2000) {
			percentage = 7;
		} else {
			percentage = 4;
		}

		increase = salary * (percentage / 100.00);
		newSalary = salary + increase;

		sb.append("Novo salario: ").append(formatter.format(newSalary)).append(LS);
		sb.append("Reajuste ganho: ").append(formatter.format(increase)).append(LS);
		sb.append("Em percentual: ").append(percentage).append(" %").append(LS);

		return sb.toString();
	}

}

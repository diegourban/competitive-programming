package urban.uri_online_judge.beginner._1040;

import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Average 3
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1040
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final NumberFormat formatter;

	static {
		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		formatter = new DecimalFormat("#0.0", decimalFormatSymbols);
		formatter.setRoundingMode(RoundingMode.DOWN);
	}

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		double N1 = reader.nextDouble();
		double N2 = reader.nextDouble();
		double N3 = reader.nextDouble();
		double N4 = reader.nextDouble();

		double average = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

		StringBuilder sb = new StringBuilder();

		sb.append("Media: ").append(formatter.format(average)).append(System.lineSeparator());

		if (average < 5) {
			sb.append("Aluno reprovado.").append(System.lineSeparator());
		} else if (average <= 6.9) {
			sb.append("Aluno em exame.").append(System.lineSeparator());
			double examScore = reader.nextDouble();
			sb.append("Nota do exame: ").append(formatter.format(examScore)).append(System.lineSeparator());

			double newAverage = (average + examScore) / 2d;
			if (newAverage < 5) {
				sb.append("Aluno reprovado.").append(System.lineSeparator());
			} else {
				sb.append("Aluno aprovado.").append(System.lineSeparator());
			}

			sb.append("Media final: ").append(formatter.format(newAverage)).append(System.lineSeparator());
		} else {
			sb.append("Aluno aprovado.").append(System.lineSeparator());
		}

		reader.close();

		return sb.toString();
	}
	
}

package urban.uri_online_judge.beginner._1021;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Banknotes and Coins
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1021
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final NumberFormat formatter;

	static {
		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		formatter = new DecimalFormat("##0.00", decimalFormatSymbols);
	}

	private static final String LS = System.lineSeparator();

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		double N = reader.nextDouble();
		reader.close();

		int notasDe100 = 0;
		int notasDe50 = 0;
		int notasDe20 = 0;
		int notasDe10 = 0;
		int notasDe5 = 0;
		int notasDe2 = 0;

		int moedasDe50 = 0;
		int moedasDe25 = 0;
		int moedasDe10 = 0;
		int moedasDe05 = 0;
		int moedasDe01 = 0;

		StringBuilder sb = new StringBuilder();
		sb.append("NOTAS:").append(LS);
		if (N / 100.0 >= 1.0) {
			notasDe100 = (int) N / 100;
			N -= notasDe100 * 100;
		}
		sb.append(notasDe100).append(" nota(s) de R$ 100.00").append(LS);

		if (N / 50.0 >= 1.0) {
			notasDe50 = (int) N / 50;
			N -= notasDe50 * 50;
		}
		sb.append(notasDe50).append(" nota(s) de R$ 50.00").append(LS);

		if (N / 20.0 >= 1.0) {
			notasDe20 = (int) N / 20;
			N -= notasDe20 * 20;
		}
		sb.append(notasDe20).append(" nota(s) de R$ 20.00").append(LS);

		if (N / 10.0 >= 1.0) {
			notasDe10 = (int) N / 10;
			N -= notasDe10 * 10;
		}
		sb.append(notasDe10).append(" nota(s) de R$ 10.00").append(LS);

		if (N / 5.0 >= 1.0) {
			notasDe5 = (int) N / 5;
			N -= notasDe5 * 5;
		}
		sb.append(notasDe5).append(" nota(s) de R$ 5.00").append(LS);

		if (N / 2.0 >= 1.0) {
			notasDe2 = (int) N / 2;
			N -= notasDe2 * 2;
		}
		sb.append(notasDe2).append(" nota(s) de R$ 2.00").append(LS);

		sb.append("MOEDAS:").append(LS);
		sb.append((int) N).append(" moeda(s) de R$ 1.00").append(LS);
		N -= (int) N;

		if (N / .5 >= 1.0) {
			moedasDe50 = (int) (N / 0.5);
			N -= moedasDe50 * 0.5;
		}
		sb.append(moedasDe50).append(" moeda(s) de R$ 0.50").append(LS);

		if (N / .25 >= 1.0) {
			moedasDe25 = (int) (N / 0.25);
			N -= moedasDe25 * 0.25;
		}
		sb.append(moedasDe25).append(" moeda(s) de R$ 0.25").append(LS);

		if (N / .10 >= 1.0) {
			moedasDe10 = (int) (N / 0.10);
			N -= moedasDe10 * 0.10;
		}
		sb.append(moedasDe10).append(" moeda(s) de R$ 0.10").append(LS);

		if (N / .05 >= 1.0) {
			moedasDe05 = (int) (N / 0.05);
			N -= moedasDe05 * 0.05;
		}
		sb.append(moedasDe05).append(" moeda(s) de R$ 0.05").append(LS);

		moedasDe01 = (int) (Double.valueOf(formatter.format(N)) * 100);
		sb.append(moedasDe01).append(" moeda(s) de R$ 0.01").append(LS);

		return sb.toString();
	}

}

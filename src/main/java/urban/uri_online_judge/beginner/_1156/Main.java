package urban.uri_online_judge.beginner._1156;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * S Sequence II
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1156
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {
	
	private static final NumberFormat numberFormat;
	
	static {
		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		numberFormat = new DecimalFormat("#0.00", decimalFormatSymbols);
	}

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		double sum = 0;
		for(int i = 1, j = 1; i <= 39; i+=2, j*=2) {
			sum += i/(j*1.0);
		}

		return numberFormat.format(sum) + System.lineSeparator();
	}

}
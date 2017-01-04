package urban.uri_online_judge.beginner._1011;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Sphere
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1011
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);

		BigDecimal R = new BigDecimal(reader.nextInt());
		BigDecimal volume = new BigDecimal((4 / 3.0) * 3.14159).multiply(R).multiply(R).multiply(R);

		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("##0.000", decimalFormatSymbols);
		
		reader.close();

		return "VOLUME = " + formatter.format(volume) + System.lineSeparator();
	}

}

package urban.uri_online_judge.beginner._1015;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Distance Between Two Points
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1015
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		decimalFormatSymbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("##0.0000", decimalFormatSymbols);

		Reader reader = new Reader(input);
		double x1 = reader.nextDouble();
		double y1 = reader.nextDouble();
		double x2 = reader.nextDouble();
		double y2 = reader.nextDouble();
		reader.close();

		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		return formatter.format(distance) + System.lineSeparator();
	}

}

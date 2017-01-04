package urban.uri_online_judge.beginner._1094;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Experiments
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1094
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {
	
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
		int n = reader.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		int totalCoelhos = 0;
		int totalRatos = 0;
		int totalSapos = 0;
		
		for(int i = 0; i < n; i++) {
			int amount = reader.nextInt();
			char type = reader.nextChar();
			switch (type) {
			case 'C':
				totalCoelhos += amount;
				break;
			case 'R':
				totalRatos += amount;
				break;
			case 'S':
				totalSapos += amount;
				break;
			default:
				break;
			}
		}
		reader.close();
		
		int totalCobaias = totalCoelhos + totalRatos + totalSapos;
		sb.append("Total: ").append(totalCobaias).append(" cobaias").append(System.lineSeparator());
		sb.append("Total de coelhos: ").append(totalCoelhos).append(System.lineSeparator());
		sb.append("Total de ratos: ").append(totalRatos).append(System.lineSeparator());
		sb.append("Total de sapos: ").append(totalSapos).append(System.lineSeparator());
		sb.append("Percentual de coelhos: ").append(formatter.format((totalCoelhos * 100.0) / totalCobaias)).append(" %").append(System.lineSeparator());
		sb.append("Percentual de ratos: ").append(formatter.format((totalRatos * 100.0) / totalCobaias)).append(" %").append(System.lineSeparator());
		sb.append("Percentual de sapos: ").append(formatter.format((totalSapos * 100.0) / totalCobaias)).append(" %").append(System.lineSeparator());

		return sb.toString();
	}

}


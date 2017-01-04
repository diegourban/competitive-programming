package urban.uri_online_judge.beginner._1061;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

import urban.common.Reader;

/**
 * Event Time
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1061
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
		reader.skip(4);
		int beginDay = reader.nextInt();
		int beginHour = reader.nextInt();
		reader.skip(2);
		int beginMinute = reader.nextInt();
		reader.skip(2);
		int beginSecond = reader.nextInt();

		reader.skip(4);
		int endDay = reader.nextInt();
		int endHour = reader.nextInt();
		reader.skip(2);
		int endMinute = reader.nextInt();
		reader.skip(2);
		int endSecond = reader.nextInt();
		reader.close();

		BigInteger beginInMilli = inMilli(beginDay, beginHour, beginMinute, beginSecond);
		BigInteger endInMilli = inMilli(endDay, endHour, endMinute, endSecond);

		BigInteger time = endInMilli.subtract(beginInMilli);
		long Z = time.longValue() / 1000;
		long Y = Z / 60;
		long X = Y / 60;
		long W = X / 24;

		StringBuilder sb = new StringBuilder();
		sb.append(W).append(" dia(s)").append(System.lineSeparator());
		sb.append(X % 24).append(" hora(s)").append(System.lineSeparator());
		sb.append(Y % 60).append(" minuto(s)").append(System.lineSeparator());
		sb.append(Z % 60).append(" segundo(s)").append(System.lineSeparator());

		return sb.toString();
	}

	private static BigInteger inMilli(int day, int hour, int minute, int second) {
		BigInteger timeInMillis = BigInteger.ZERO;

		BigInteger dayInMillis = BigInteger.ZERO;
		dayInMillis = dayInMillis.add(new BigInteger(String.valueOf(day)))
				.multiply(new BigInteger(String.valueOf(86400000)));
		timeInMillis = timeInMillis.add(dayInMillis);

		timeInMillis = timeInMillis.add(new BigInteger(String.valueOf(hour * 3600000)));
		timeInMillis = timeInMillis.add(new BigInteger(String.valueOf(minute * 60000)));
		timeInMillis = timeInMillis.add(new BigInteger(String.valueOf(second * 1000)));

		return timeInMillis;
	}

}

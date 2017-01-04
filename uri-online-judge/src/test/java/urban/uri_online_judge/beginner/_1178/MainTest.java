package urban.uri_online_judge.beginner._1178;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import org.junit.Test;

import urban.common.SampleBuilder;

public class MainTest {

	private static final NumberFormat nf;

	static {
		DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
		dfs.setDecimalSeparator('.');
		nf = new DecimalFormat("#0.0000", dfs);
	}

	private String generateExpectedOutputFor(double x) {
		StringBuilder sb = new StringBuilder();
		double y = x;
		for (int i = 0; i < 100; i++) {
			sb.append("N[").append(i).append("] = ").append(nf.format(y)).append(System.lineSeparator());
			y = y / 2;
		}
		return sb.toString();
	}

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleLowestInput() throws IOException {
		double n = 200.0000;
		InputStream input = new SampleBuilder().appendln(n).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = generateExpectedOutputFor(n);

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample2() throws IOException {
		double n = new Double("100000000000000000.0000");
		InputStream input = new SampleBuilder().appendln(n).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = generateExpectedOutputFor(n);

		assertEquals(expectedOutput, output);
	}

}

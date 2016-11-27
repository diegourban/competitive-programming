package urban.uri_online_judge.beginner._1178;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;

public class MainTest {

	private static final NumberFormat nf;

	static {
		DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
		dfs.setDecimalSeparator('.');
		nf = new DecimalFormat("#0.0000", dfs);
	}

	private InputStreamBuilder inputStream;

	@Before
	public void beforeTest() {
		inputStream = new InputStreamBuilder();
	}

	@After
	public void afterTest() {
		inputStream = null;
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
		String inputSample = new SampleBuilder().appendln(n).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = generateExpectedOutputFor(n);

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample2() throws IOException {
		double n = new Double("100000000000000000.0000");
		String inputSample = new SampleBuilder().appendln(n).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = generateExpectedOutputFor(n);

		assertEquals(expectedOutput, output);
	}

}

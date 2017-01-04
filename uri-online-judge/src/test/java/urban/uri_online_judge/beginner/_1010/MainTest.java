package urban.uri_online_judge.beginner._1010;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;

public class MainTest {

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldCalculateSample1() throws IOException {
		InputStream input = new SampleBuilder().appendln("12 1 5.30").appendln("16 2 5.10").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "VALOR A PAGAR: R$ 15.50" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateSample2() throws IOException {
		InputStream input = new SampleBuilder().appendln("13 2 15.30").appendln("161 4 5.20").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "VALOR A PAGAR: R$ 51.40" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateSample3() throws IOException {
		InputStream input = new SampleBuilder().appendln("1 1 15.10").appendln("2 1 15.10").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "VALOR A PAGAR: R$ 30.20" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

}

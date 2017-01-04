package urban.uri_online_judge.beginner._1004;

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
	public void shouldMultiplyOnesPlace() throws IOException {
		InputStream input = new SampleBuilder().appendln("4").appendln("1").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "PROD = 4" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyOnesPlaceWithNegative() throws IOException {
		InputStream input = new SampleBuilder().appendln("6").appendln("-3").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "PROD = -18" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyTensPlace() throws IOException {
		InputStream input = new SampleBuilder().appendln("11").appendln("12").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "PROD = 132" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyTensPlaceWithNegative() throws IOException {
		InputStream input = new SampleBuilder().appendln("-10").appendln("25").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "PROD = -250" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyZeros() throws IOException {
		InputStream input = new SampleBuilder().appendln("0").appendln("0").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "PROD = 0" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyNegatives() throws IOException {
		InputStream input = new SampleBuilder().appendln("-5").appendln("-12").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "PROD = 60" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyToLargePositiveInteger() throws IOException {
		InputStream input = new SampleBuilder().appendln("1234").appendln("9876").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "PROD = 12186984" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

}

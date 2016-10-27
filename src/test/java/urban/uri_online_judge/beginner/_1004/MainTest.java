package urban.uri_online_judge.beginner._1004;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1004.Main;

public class MainTest {
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldMultiplyOnesPlace() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("4").addLine("1").build();

		String output = Main.main(input);
		String expectedOutput = "PROD = 4" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyOnesPlaceWithNegative() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("6").addLine("-3").build();

		String output = Main.main(input);
		String expectedOutput = "PROD = -18" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyTensPlace() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("11").addLine("12").build();

		String output = Main.main(input);
		String expectedOutput = "PROD = 132" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyTensPlaceWithNegative() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("-10").addLine("25").build();

		String output = Main.main(input);
		String expectedOutput = "PROD = -250" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyZeros() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("0").addLine("0").build();

		String output = Main.main(input);
		String expectedOutput = "PROD = 0" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyNegatives() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("-5").addLine("-12").build();

		String output = Main.main(input);
		String expectedOutput = "PROD = 60" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyToLargePositiveInteger() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("1234").addLine("9876").build();

		String output = Main.main(input);
		String expectedOutput = "PROD = 12186984" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

}

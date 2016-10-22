package urban.uri_online_judge.beginner._1003;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;

public class MainTest {

	@Test
	public void shouldAddOnesPlace() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("4").addLine("1").build();

		String output = Main.main(input);
		String expectedOutput = "SOMA = 5" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddOnesPlaceWithNegative() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("6").addLine("-3").build();

		String output = Main.main(input);
		String expectedOutput = "SOMA = 3" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddTensPlace() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("11").addLine("12").build();

		String output = Main.main(input);
		String expectedOutput = "SOMA = 23" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddTensPlaceWithNegative() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("-10").addLine("25").build();

		String output = Main.main(input);
		String expectedOutput = "SOMA = 15" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddZeros() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("0").addLine("0").build();

		String output = Main.main(input);
		String expectedOutput = "SOMA = 0" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddNegatives() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("-5").addLine("-12").build();

		String output = Main.main(input);
		String expectedOutput = "SOMA = -17" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddLargePositiveInteger() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("123456789").addLine("987654321").build();

		String output = Main.main(input);
		String expectedOutput = "SOMA = 1111111110" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

}

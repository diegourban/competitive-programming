package urban.uri_online_judge.beginner._1004;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;

public class MainTest {
	
	private InputStreamBuilder inputStream;

	@Before
	public void beforeTest() {
		inputStream = new InputStreamBuilder();
	}

	@After
	public void afterTest() {
		inputStream = null;
	}
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldMultiplyOnesPlace() throws IOException {
		String inputSample = new SampleBuilder().appendln("4").appendln("1").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "PROD = 4" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyOnesPlaceWithNegative() throws IOException {
		String inputSample = new SampleBuilder().appendln("6").appendln("-3").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "PROD = -18" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyTensPlace() throws IOException {
		String inputSample = new SampleBuilder().appendln("11").appendln("12").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "PROD = 132" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyTensPlaceWithNegative() throws IOException {
		String inputSample = new SampleBuilder().appendln("-10").appendln("25").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "PROD = -250" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyZeros() throws IOException {
		String inputSample = new SampleBuilder().appendln("0").appendln("0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "PROD = 0" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyNegatives() throws IOException {
		String inputSample = new SampleBuilder().appendln("-5").appendln("-12").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "PROD = 60" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldMultiplyToLargePositiveInteger() throws IOException {
		String inputSample = new SampleBuilder().appendln("1234").appendln("9876").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "PROD = 12186984" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

}

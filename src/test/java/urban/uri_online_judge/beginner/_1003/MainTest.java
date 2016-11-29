package urban.uri_online_judge.beginner._1003;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1003.Main;

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
	public void shouldAddOnesPlace() throws IOException {
		String inputSample = new SampleBuilder().appendln("4").appendln("1").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "SOMA = 5" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddOnesPlaceWithNegative() throws IOException {
		String inputSample = new SampleBuilder().appendln("6").appendln("-3").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "SOMA = 3" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddTensPlace() throws IOException {
		String inputSample = new SampleBuilder().appendln("11").appendln("12").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "SOMA = 23" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddTensPlaceWithNegative() throws IOException {
		String inputSample = new SampleBuilder().appendln("-10").appendln("25").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "SOMA = 15" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddZeros() throws IOException {
		String inputSample = new SampleBuilder().appendln("0").appendln("0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "SOMA = 0" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddNegatives() throws IOException {
		String inputSample = new SampleBuilder().appendln("-5").appendln("-12").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "SOMA = -17" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldAddLargePositiveInteger() throws IOException {
		String inputSample = new SampleBuilder().appendln("123456789").appendln("987654321").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = "SOMA = 1111111110" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

}

package urban.uri_online_judge.beginner._1164;

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
	public void shouldHandleLowestXInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("1 nao eh perfeito").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleHighestXInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(100000000).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("100000000 nao eh perfeito").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleMultipleInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(5).appendln(50).appendln(496).appendln(29).appendln(8128)
				.appendln(91).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("50 nao eh perfeito").appendln("496 eh perfeito")
				.appendln("29 nao eh perfeito").appendln("8128 eh perfeito").appendln("91 nao eh perfeito").build();

		assertEquals(expectedOutput, output);
	}

}

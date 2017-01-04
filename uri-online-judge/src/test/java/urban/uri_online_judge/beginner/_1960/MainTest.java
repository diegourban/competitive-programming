package urban.uri_online_judge.beginner._1960;

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
	public void shouldConvertLowestInput() throws IOException {
		InputStream input = new SampleBuilder().append(1).buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("I").build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSingleLetters() throws IOException {
		int[] inputs = { 1, 5, 10, 50, 100, 500 };
		String[] outputs = { "I", "V", "X", "L", "C", "D" };

		for (int i = 0; i < inputs.length; i++) {
			InputStream input = new SampleBuilder().append(inputs[i]).buildAsInputStream();
			String output = Main.main(input);
			String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
			assertEquals(expectedOutput, output);
		}
	}

	@Test
	public void shouldConvertHighestInput() throws IOException {
		InputStream input = new SampleBuilder().append(999).buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("CMXCIX").build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldConvertURISamples() throws IOException {
		int[] inputs = { 666, 83 };
		String[] outputs = { "DCLXVI", "LXXXIII" };

		for (int i = 0; i < inputs.length; i++) {
			InputStream input = new SampleBuilder().append(inputs[i]).buildAsInputStream();
			String output = Main.main(input);
			String expectedOutput = new SampleBuilder().appendln(outputs[i]).build();
			assertEquals(expectedOutput, output);
		}
	}

}

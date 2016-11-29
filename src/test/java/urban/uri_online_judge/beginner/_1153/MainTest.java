package urban.uri_online_judge.beginner._1153;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;

public class MainTest {

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldCalculateLowerInput() throws IOException {
		InputStream input = new SampleBuilder().append(1).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(1).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateHigherInput() throws IOException {
		InputStream input = new SampleBuilder().append(12).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(479001600).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateSample() throws IOException {
		InputStream input = new SampleBuilder().append(4).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(24).build();

		assertEquals(expectedOutput, output);
	}
}

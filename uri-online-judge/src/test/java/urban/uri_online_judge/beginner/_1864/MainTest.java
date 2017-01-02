package urban.uri_online_judge.beginner._1864;

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
	public void shouldHandleMinimumInput() throws IOException {
		InputStream input1 = new SampleBuilder().append(1).buildAsInputStream();

		String output1 = Main.main(input1);

		String expectedOutput = "L" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
	}

	@Test
	public void shouldHandleMaximumInput() throws IOException {
		InputStream input1 = new SampleBuilder().append(34).buildAsInputStream();

		String output1 = Main.main(input1);

		String expectedOutput = "LIFE IS NOT A PROBLEM TO BE SOLVED" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
	}

	@Test
	public void shouldHandleUDebugSample() throws IOException {
		InputStream input1 = new SampleBuilder().append(33).buildAsInputStream();

		String output1 = Main.main(input1);

		String expectedOutput = "LIFE IS NOT A PROBLEM TO BE SOLVE" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
	}

	@Test
	public void shouldHandleURISample() throws IOException {
		InputStream input1 = new SampleBuilder().append(7).buildAsInputStream();

		String output1 = Main.main(input1);

		String expectedOutput = "LIFE IS" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
	}

}

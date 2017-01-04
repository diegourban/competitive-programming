package urban.uri_online_judge.beginner._1177;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;

public class MainTest {

	private String generateExpectedOutputFor(int t) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			sb.append("N[").append(i).append("] = ").append(count).append(System.lineSeparator());
			count++;
			if (count == t) {
				count = 0;
			}
		}
		return sb.toString();
	}

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleLowestInput() throws IOException {
		int t = 2;
		InputStream input = new SampleBuilder().appendln(t).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = generateExpectedOutputFor(t);

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleHighestInput() throws IOException {
		int t = 50;
		InputStream input = new SampleBuilder().appendln(t).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = generateExpectedOutputFor(t);

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample() throws IOException {
		int t = 3;
		InputStream input = new SampleBuilder().appendln(t).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = generateExpectedOutputFor(t);

		assertEquals(expectedOutput, output);
	}
}

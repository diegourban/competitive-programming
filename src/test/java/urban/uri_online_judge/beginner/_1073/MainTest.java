package urban.uri_online_judge.beginner._1073;

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
	public void shouldHandleLowestInput() throws IOException {
		InputStream input = new SampleBuilder().append(5).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("2^2 = 4").appendln("4^2 = 16").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleHighestInput() throws IOException {
		InputStream input = new SampleBuilder().append(1999).buildAsInputStream();

		String output = Main.main(input);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 1999; i++) {
			if (i % 2 == 0) {
				sb.append(i).append("^").append(2).append(" = ").append(i * i).append(System.lineSeparator());
			}
		}
		String expectedOutput = sb.toString();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateEvenSquareSample() throws IOException {
		InputStream input = new SampleBuilder().append(6).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("2^2 = 4").appendln("4^2 = 16").appendln("6^2 = 36")
				.build();

		assertEquals(expectedOutput, output);
	}

}

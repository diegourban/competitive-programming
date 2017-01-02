package urban.uri_online_judge.beginner._1176;

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
		InputStream input = new SampleBuilder().appendln(1).append(0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Fib(0) = 0").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleHighestInput() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).append(60).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Fib(60) = 1548008755920").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample() throws IOException {
		InputStream input = new SampleBuilder().appendln(3).appendln(0).appendln(4).appendln(2).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Fib(0) = 0").appendln("Fib(4) = 3").appendln("Fib(2) = 1")
				.build();

		assertEquals(expectedOutput, output);
	}

}

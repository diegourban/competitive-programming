package urban.uri_online_judge.beginner._1074;

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
	public void shouldHandleLowestInput() throws IOException {
		// (-10^7 < X < 10^7)
		InputStream input = new SampleBuilder().appendln(1).append(-9999999).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("ODD NEGATIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleHighestInput() throws IOException {
		// (-10^7 < X < 10^7)
		InputStream input = new SampleBuilder().appendln(1).append(9999999).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("ODD POSITIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleZero() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).append(0).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("NULL").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNegativeEven() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).append(-2).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("EVEN NEGATIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNegativeOdd() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).append(-1).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("ODD NEGATIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandlePositiveEven() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).append(2).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("EVEN POSITIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandlePositiveOdd() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).append(1).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("ODD POSITIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleEvenOrOddSample() throws IOException {
		InputStream input = new SampleBuilder().appendln(4).appendln(-5).appendln(0).appendln(3).appendln(-4)
				.buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("ODD NEGATIVE").appendln("NULL").appendln("ODD POSITIVE")
				.appendln("EVEN NEGATIVE").build();

		assertEquals(expectedOutput, output);
	}

}

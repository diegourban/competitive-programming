package urban.uri_online_judge.beginner._1074;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1074.Main;

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
	public void shouldHandleLowestInput() throws IOException {
		// (-10^7 < X < 10^7)
		String inputSample = new SampleBuilder().appendln(1).append(-9999999).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("ODD NEGATIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleHighestInput() throws IOException {
		// (-10^7 < X < 10^7)
		String inputSample = new SampleBuilder().appendln(1).append(9999999).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("ODD POSITIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleZero() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("NULL").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNegativeEven() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(-2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("EVEN NEGATIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNegativeOdd() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(-1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("ODD NEGATIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandlePositiveEven() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("EVEN POSITIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandlePositiveOdd() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("ODD POSITIVE").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleEvenOrOddSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(4).appendln(-5).appendln(0).appendln(3).appendln(-4).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("ODD NEGATIVE").appendln("NULL").appendln("ODD POSITIVE")
				.appendln("EVEN NEGATIVE").build();

		assertEquals(expectedOutput, output);
	}

}

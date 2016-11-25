package urban.uri_online_judge.beginner._1176;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1176.Main;

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
		String inputSample = new SampleBuilder().appendln(1).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Fib(0) = 0").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleHighestInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(60).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Fib(60) = 1548008755920").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(3).appendln(0).appendln(4).appendln(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Fib(0) = 0").appendln("Fib(4) = 3").appendln("Fib(2) = 1").build();

		assertEquals(expectedOutput, output);
	}

}

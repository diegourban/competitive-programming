package urban.uri_online_judge.beginner._1149;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1149.Main;

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
	public void shouldPrintOneLine() throws IOException {
		String inputSample = new SampleBuilder().append(1).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(3).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldReadAnotherNWhileNIsZeroOrNegative() throws IOException {
		String inputSample = new SampleBuilder().append(3).append(0).append(-1).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(7).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldSumConsecutiveIntegers() throws IOException {
		String inputSample = new SampleBuilder().append(3).append(2).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(7).build();
		
		assertEquals(expectedOutput, output);
	}

}

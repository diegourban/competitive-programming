package urban.uri_online_judge.beginner._1132;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1132.Main;

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
	public void shouldHandleAscendingInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(13).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(78).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleDescendingInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(13).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(78).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldSumMultiplesOf13Sample() throws IOException {
		String inputSample = new SampleBuilder().appendln(100).append(200).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(13954).build();

		assertEquals(expectedOutput, output);
	}

}

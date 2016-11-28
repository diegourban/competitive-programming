package urban.uri_online_judge.beginner._1181;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.SampleLocator;

public class MainTest {
	
	private static final String PROBLEM_CODE = "1181";
	private static final String PROBLEM_SAMPLES_PATH = SampleLocator.BEGINNER_SAMPLES_PATH + File.separator + PROBLEM_CODE + File.separator;
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
	public void shouldHandleSample1() throws IOException {
		String inputSample = new SampleBuilder().loadFromFile(PROBLEM_SAMPLES_PATH + "sample1.in").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(-202.0).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSample2() throws IOException {
		String inputSample = new SampleBuilder().loadFromFile(PROBLEM_SAMPLES_PATH + "sample2.in").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(-16.8).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSample3() throws IOException {
		String inputSample = new SampleBuilder().loadFromFile(PROBLEM_SAMPLES_PATH + "sample3.in").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(0.0).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldReadFirstLine() throws IOException {
		String inputSample = new SampleBuilder().loadFromFile(PROBLEM_SAMPLES_PATH + "sample4.in").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(-99.3).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldReadLastLine() throws IOException {
		String inputSample = new SampleBuilder().loadFromFile(PROBLEM_SAMPLES_PATH + "sample5.in").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(-107.0).build();

		assertEquals(expectedOutput, output);
	}

}

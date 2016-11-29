package urban.uri_online_judge.beginner._1182;

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
import urban.uri_online_judge.beginner._1182.Main;

public class MainTest {
	
	private static final String PROBLEM_CODE = "1182";
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

		String expectedOutput = new SampleBuilder().appendln(6.0).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSample2() throws IOException {
		String inputSample = new SampleBuilder().loadFromFile(PROBLEM_SAMPLES_PATH + "sample2.in").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(0.5).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateFirstColum() throws IOException {
		String inputSample = new SampleBuilder().loadFromFile(PROBLEM_SAMPLES_PATH + "sample3.in").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(-115.7).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateLastColum() throws IOException {
		String inputSample = new SampleBuilder().loadFromFile(PROBLEM_SAMPLES_PATH + "sample4.in").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(-350.9).build();

		assertEquals(expectedOutput, output);
	}

}

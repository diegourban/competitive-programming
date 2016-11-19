package urban.uri_online_judge.beginner._1101;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1101.Main;

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
	public void shouldStopOnZeroAtM() throws IOException {
		String inputSample = new SampleBuilder().append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().append("").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldStopOnZeroAtN() throws IOException {
		String inputSample = new SampleBuilder().append(1).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().append("").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSmallerFirst() throws IOException {
		String inputSample = new SampleBuilder().append(2).appendln(5).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("2 3 4 5 Sum=14").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleBiggerFirst() throws IOException {
		String inputSample = new SampleBuilder().append(5).appendln(2).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("2 3 4 5 Sum=14").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCountSample() throws IOException {
		String inputSample = new SampleBuilder().append(5).appendln(2).append(6).appendln(3).append(5).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("2 3 4 5 Sum=14").appendln("3 4 5 6 Sum=18").build();

		assertEquals(expectedOutput, output);
	}

}

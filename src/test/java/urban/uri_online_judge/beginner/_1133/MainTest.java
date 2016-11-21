package urban.uri_online_judge.beginner._1133;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1133.Main;

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
		String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(7).appendln(8).appendln(12).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleDescendingInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(13).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(7).appendln(8).appendln(12).build();

		assertEquals(expectedOutput, output);
	}
	@Test
	public void shouldHandleSameInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(2).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintRestOfDivisionSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(10).append(18).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(12).appendln(13).appendln(17).build();

		assertEquals(expectedOutput, output);
	}

}

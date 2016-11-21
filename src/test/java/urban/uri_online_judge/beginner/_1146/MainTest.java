package urban.uri_online_judge.beginner._1146;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1146.Main;

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
		String inputSample = new SampleBuilder().appendln(1).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1")//
				.build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintOneLineWithTenNumbers() throws IOException {
		String inputSample = new SampleBuilder().appendln(10).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 4 5 6 7 8 9 10")//
				.build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintTwoLines() throws IOException {
		String inputSample = new SampleBuilder().appendln(5).appendln(3).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 4 5")//
				.appendln("1 2 3")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(5).appendln(10).appendln(3).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 4 5")//
				.appendln("1 2 3 4 5 6 7 8 9 10")//
				.appendln("1 2 3")//
				.build();

		assertEquals(expectedOutput, output);
	}

}

package urban.uri_online_judge.beginner._1142;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1142.Main;

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
		String inputSample = new SampleBuilder().appendln(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 PUM")//
				.build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintTwoLines() throws IOException {
		String inputSample = new SampleBuilder().appendln(2).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 PUM")//
				.appendln("5 6 7 PUM")//
				.build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintThreeLines() throws IOException {
		String inputSample = new SampleBuilder().appendln(3).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 PUM")//
				.appendln("5 6 7 PUM")//
				.appendln("9 10 11 PUM")//
				.build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintPUMSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(7).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 PUM")//
				.appendln("5 6 7 PUM")//
				.appendln("9 10 11 PUM")//
				.appendln("13 14 15 PUM")//
				.appendln("17 18 19 PUM")//
				.appendln("21 22 23 PUM")//
				.appendln("25 26 27 PUM")//
				.build();
		
		assertEquals(expectedOutput, output);
	}

}

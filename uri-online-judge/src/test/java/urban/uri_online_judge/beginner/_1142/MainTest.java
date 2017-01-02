package urban.uri_online_judge.beginner._1142;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;

public class MainTest {

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldPrintOneLine() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 PUM")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintTwoLines() throws IOException {
		InputStream input = new SampleBuilder().appendln(2).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 PUM")//
				.appendln("5 6 7 PUM")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintThreeLines() throws IOException {
		InputStream input = new SampleBuilder().appendln(3).buildAsInputStream();

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
		InputStream input = new SampleBuilder().appendln(7).buildAsInputStream();

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

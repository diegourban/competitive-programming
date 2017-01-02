package urban.uri_online_judge.beginner._1146;

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
		InputStream input = new SampleBuilder().appendln(1).append(0).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintOneLineWithTenNumbers() throws IOException {
		InputStream input = new SampleBuilder().appendln(10).append(0).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 4 5 6 7 8 9 10")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintTwoLines() throws IOException {
		InputStream input = new SampleBuilder().appendln(5).appendln(3).append(0).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 4 5")//
				.appendln("1 2 3")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintSample() throws IOException {
		InputStream input = new SampleBuilder().appendln(5).appendln(10).appendln(3).append(0).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 2 3 4 5")//
				.appendln("1 2 3 4 5 6 7 8 9 10")//
				.appendln("1 2 3")//
				.build();

		assertEquals(expectedOutput, output);
	}

}

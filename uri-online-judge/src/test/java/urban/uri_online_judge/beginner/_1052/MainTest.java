package urban.uri_online_judge.beginner._1052;

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
	public void shouldPrintJanuary() throws IOException {
		InputStream input = new SampleBuilder().append(1).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("January").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintFebruary() throws IOException {
		InputStream input = new SampleBuilder().append(2).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("February").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintMarch() throws IOException {
		InputStream input = new SampleBuilder().append(3).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("March").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintApril() throws IOException {
		InputStream input = new SampleBuilder().append(4).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("April").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintMay() throws IOException {
		InputStream input = new SampleBuilder().append(5).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("May").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintJune() throws IOException {
		InputStream input = new SampleBuilder().append(6).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("June").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintJuly() throws IOException {
		InputStream input = new SampleBuilder().append(7).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("July").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintAugust() throws IOException {
		InputStream input = new SampleBuilder().append(8).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("August").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintSeptember() throws IOException {
		InputStream input = new SampleBuilder().append(9).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("September").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintOctober() throws IOException {
		InputStream input = new SampleBuilder().append(10).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("October").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintNovember() throws IOException {
		InputStream input = new SampleBuilder().append(11).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("November").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintDecember() throws IOException {
		InputStream input = new SampleBuilder().append(12).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("December").build();

		assertEquals(expectedOutput, output);
	}
}

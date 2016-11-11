package urban.uri_online_judge.beginner._1052;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1052.Main;

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
	public void shouldPrintJanuary() throws IOException {
		String inputSample = new SampleBuilder().append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("January").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintFebruary() throws IOException {
		String inputSample = new SampleBuilder().append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("February").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintMarch() throws IOException {
		String inputSample = new SampleBuilder().append(3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("March").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintApril() throws IOException {
		String inputSample = new SampleBuilder().append(4).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("April").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintMay() throws IOException {
		String inputSample = new SampleBuilder().append(5).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("May").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintJune() throws IOException {
		String inputSample = new SampleBuilder().append(6).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("June").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintJuly() throws IOException {
		String inputSample = new SampleBuilder().append(7).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("July").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintAugust() throws IOException {
		String inputSample = new SampleBuilder().append(8).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("August").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintSeptember() throws IOException {
		String inputSample = new SampleBuilder().append(9).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("September").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintOctober() throws IOException {
		String inputSample = new SampleBuilder().append(10).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("October").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintNovember() throws IOException {
		String inputSample = new SampleBuilder().append(11).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("November").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldPrintDecember() throws IOException {
		String inputSample = new SampleBuilder().append(12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("December").build();

		assertEquals(expectedOutput, output);
	}
}

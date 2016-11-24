package urban.uri_online_judge.beginner._1160;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1160.Main;

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
	public void shouldCalculateOneYear() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(200).append(201).append(1.0).append(0.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("1 anos.").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateLowestInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(100).append(101).append(0.1).append(0.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("Mais de 1 seculo.").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateHighestInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(999999).append(1000000).append(10.0).append(9.9).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("1 anos.").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculatePopulationIncreaseSample1() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(6)//
				.appendln("100 150 1.0 0")//
				.appendln("90000 120000 5.5 3.5")//
				.appendln("56700 72000 5.2 3.0")//
				.appendln("123 2000 3.0 2.0")//
				.appendln("100000 110000 1.5 0.5")//
				.appendln("62422 484317 3.1 1.0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("51 anos.")//
				.appendln("16 anos.")//
				.appendln("12 anos.")//
				.appendln("Mais de 1 seculo.")//
				.appendln("10 anos.")//
				.appendln("100 anos.")//
				.build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculatePopulationIncreaseSample2() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(11)//
				.appendln("100 100 10 0")//
				.appendln("100 101 10 9")//
				.appendln("654327 894521 8.4 3.2")//
				.appendln("100 1000 10 10")//
				.appendln("128 256 6.6 2.8")//
				.appendln("512 1024 3.1 2.3")//
				.appendln("2048 4096 5.5 2.7")//
				.appendln("100 200 1 0")//
				.appendln("1000 1999 1.8 1")//
				.appendln("100 200 10 0")//
				.appendln("666 6660 10 0")//
				.build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 anos.")//
				.appendln("2 anos.")//
				.appendln("7 anos.")//
				.appendln("Mais de 1 seculo.")//
				.appendln("20 anos.")//
				.appendln("91 anos.")//
				.appendln("26 anos.")//
				.appendln("Mais de 1 seculo.")//
				.appendln("89 anos.")//
				.appendln("8 anos.")//
				.appendln("25 anos.")//
				.build();

		assertEquals(expectedOutput, output);
	}

}

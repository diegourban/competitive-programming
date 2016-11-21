package urban.uri_online_judge.beginner._1144;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1144.Main;

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
	public void shouldPrintOneLogicaSequence() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 1 1")//
				.appendln("1 2 2")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintTwoLogicalSequences() throws IOException {
		String inputSample = new SampleBuilder().appendln(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 1 1")//
				.appendln("1 2 2")//
				.appendln("2 4 8")//
				.appendln("2 5 9")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintThreeLogicalSqeuences() throws IOException {
		String inputSample = new SampleBuilder().appendln(3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 1 1")//
				.appendln("1 2 2")//
				.appendln("2 4 8")//
				.appendln("2 5 9")//
				.appendln("3 9 27")//
				.appendln("3 10 28")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintSquaredCubicSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(5).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("1 1 1")//
				.appendln("1 2 2")//
				.appendln("2 4 8")//
				.appendln("2 5 9")//
				.appendln("3 9 27")//
				.appendln("3 10 28")//
				.appendln("4 16 64")//
				.appendln("4 17 65")//
				.appendln("5 25 125")//
				.appendln("5 26 126")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrint999Lines() throws IOException {
		String inputSample = new SampleBuilder().appendln(999).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		SampleBuilder sb = new SampleBuilder();
		for (int i = 1; i <= 999; i++) {
			sb.append(i).append(i * i).appendln(i * i * i);
			sb.append(i).append(i * i + 1).appendln(i * i * i + 1);
		}
		String expectedOutput = sb.build();

		assertEquals(expectedOutput, output);
	}

}

package urban.uri_online_judge.beginner._1173;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;

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
	public void shouldStartAtOne() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("N[0] = 1")//
				.appendln("N[1] = 2")//
				.appendln("N[2] = 4")//
				.appendln("N[3] = 8")//
				.appendln("N[4] = 16")//
				.appendln("N[5] = 32")//
				.appendln("N[6] = 64")//
				.appendln("N[7] = 128")//
				.appendln("N[8] = 256")//
				.appendln("N[9] = 512")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleMaximumInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(49).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("N[0] = 49")//
				.appendln("N[1] = 98")//
				.appendln("N[2] = 196")//
				.appendln("N[3] = 392")//
				.appendln("N[4] = 784")//
				.appendln("N[5] = 1568")//
				.appendln("N[6] = 3136")//
				.appendln("N[7] = 6272")//
				.appendln("N[8] = 12544")//
				.appendln("N[9] = 25088")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleZero() throws IOException {
		String inputSample = new SampleBuilder().appendln(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("N[0] = 0")//
				.appendln("N[1] = 0")//
				.appendln("N[2] = 0")//
				.appendln("N[3] = 0")//
				.appendln("N[4] = 0")//
				.appendln("N[5] = 0")//
				.appendln("N[6] = 0")//
				.appendln("N[7] = 0")//
				.appendln("N[8] = 0")//
				.appendln("N[9] = 0")//
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNegativeNumber() throws IOException {
		String inputSample = new SampleBuilder().appendln(-2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("N[0] = -2")//
				.appendln("N[1] = -4")//
				.appendln("N[2] = -8")//
				.appendln("N[3] = -16")//
				.appendln("N[4] = -32")//
				.appendln("N[5] = -64")//
				.appendln("N[6] = -128")//
				.appendln("N[7] = -256")//
				.appendln("N[8] = -512")//
				.appendln("N[9] = -1024")//
				.build();

		assertEquals(expectedOutput, output);
	}

}

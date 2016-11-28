package urban.uri_online_judge.beginner._1180;

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
	public void shouldHandleLowestN() throws IOException {
		String inputSample = new SampleBuilder().appendln(2).append(12).append(-12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Menor valor: -12").appendln("Posicao: 1").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSameNumbers() throws IOException {
		String inputSample = new SampleBuilder().appendln(3).append(1).append(1).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Menor valor: 1").appendln("Posicao: 0").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(10).append(1).append(2).append(3).append(4).append(-5)
				.append(6).append(7).append(8).append(9).append(10).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Menor valor: -5").appendln("Posicao: 4").build();

		assertEquals(expectedOutput, output);
	}

}

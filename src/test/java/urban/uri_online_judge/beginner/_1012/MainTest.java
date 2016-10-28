package urban.uri_online_judge.beginner._1012;

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
	public void shouldSimpleTest1() throws IOException {
		String inputSample = new SampleBuilder().append(3.0).append(4.0).append(5.2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("TRIANGULO: 7.800").appendln("CIRCULO: 84.949")
				.appendln("TRAPEZIO: 18.200").appendln("QUADRADO: 16.000").appendln("RETANGULO: 12.000").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldSimpleTest2() throws IOException {
		String inputSample = new SampleBuilder().append(12.7).append(10.4).append(15.2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("TRIANGULO: 96.520").appendln("CIRCULO: 725.833")
				.appendln("TRAPEZIO: 175.560").appendln("QUADRADO: 108.160").appendln("RETANGULO: 132.080").build();

		assertEquals(expectedOutput, output);
	}

}

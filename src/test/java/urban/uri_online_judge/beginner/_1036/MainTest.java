package urban.uri_online_judge.beginner._1036;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1036.Main;

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
	public void shouldBeImpossibleToCalculateWithAZero() throws IOException {
		String inputSample = new SampleBuilder().append(0.0).append(20.1).append(5.1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Impossivel calcular").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldBeImpossibleToCalculateWithDeltaNegative() throws IOException {
		String inputSample = new SampleBuilder().append(1).append(1).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Impossivel calcular").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateBhaskaraSample1() throws IOException {
		String inputSample = new SampleBuilder().append(10.0).append(20.1).append(5.1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R1 = -0.29788").appendln("R2 = -1.71212").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBhaskaraSample2() throws IOException {
		String inputSample = new SampleBuilder().append(0.0).append(20.0).append(5.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Impossivel calcular").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBhaskaraSample3() throws IOException {
		String inputSample = new SampleBuilder().append(10.3).append(203.0).append(5.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R1 = -0.02466").appendln("R2 = -19.68408").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBhaskaraSample4() throws IOException {
		String inputSample = new SampleBuilder().append(10.0).append(3.0).append(5.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Impossivel calcular").build();

		assertEquals(expectedOutput, output);
	}
}

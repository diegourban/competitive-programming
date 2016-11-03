package urban.uri_online_judge.beginner._1044;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1044.Main;

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
	public void shouldFindMultiplesAGreaterThanB() throws IOException {
		String inputSample = new SampleBuilder().append(8).append(4).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Sao Multiplos").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindMultiplesBGreaterThanA() throws IOException {
		String inputSample = new SampleBuilder().append(4).append(8).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Sao Multiplos").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleNotMultiples() throws IOException {
		String inputSample = new SampleBuilder().append(5).append(3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Nao sao Multiplos").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindMultiplesSample1() throws IOException {
		String inputSample = new SampleBuilder().append(6).append(24).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Sao Multiplos").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindMultiplesSample2() throws IOException {
		String inputSample = new SampleBuilder().append(6).append(25).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Nao sao Multiplos").build();

		assertEquals(expectedOutput, output);
	}

}

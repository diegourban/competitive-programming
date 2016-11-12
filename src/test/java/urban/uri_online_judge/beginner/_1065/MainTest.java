package urban.uri_online_judge.beginner._1065;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1065.Main;

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
	public void shouldNotFindAnyEven() throws IOException {
		String inputSample = new SampleBuilder().append(-7).append(-5).append(1).append(-3).append(11).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 valores pares").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindPositiveEvens() throws IOException {
		String inputSample = new SampleBuilder().append(-7).append(6).append(1).append(-3).append(12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("2 valores pares").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindNegativeEvens() throws IOException {
		String inputSample = new SampleBuilder().append(-8).append(-12).append(1).append(-4).append(11).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("3 valores pares").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindEvenSample() throws IOException {
		String inputSample = new SampleBuilder().append(-7).append(-5).append(6).append(-4).append(12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("3 valores pares").build();

		assertEquals(expectedOutput, output);
	}

}

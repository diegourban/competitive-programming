package urban.uri_online_judge.beginner._1060;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1060.Main;

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
	public void shouldNotFindAnyPositive() throws IOException {
		String inputSample = new SampleBuilder().append(-1.1).append(-3).append(-2.9).append(-4).append(-5).append(-0.1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 valores positivos").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindOnePositive() throws IOException {
		String inputSample = new SampleBuilder().append(-1.1).append(-3).append(-2.9).append(4).append(-5).append(-0.1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 valores positivos").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindFivePositives() throws IOException {
		String inputSample = new SampleBuilder().append(1.1).append(-3).append(2.9).append(4).append(5).append(0.1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("5 valores positivos").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindAllPositives() throws IOException {
		String inputSample = new SampleBuilder().append(1.1).append(3).append(2.9).append(4).append(5).append(0.1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("6 valores positivos").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConsiderZeroAsPositive() throws IOException {
		String inputSample = new SampleBuilder().append(1.1).append(-3).append(22.9).append(4).append(-5).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("4 valores positivos").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindPositivesSample() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(-5).append(6).append(-3.4).append(4.6).append(12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("4 valores positivos").build();

		assertEquals(expectedOutput, output);
	}

}

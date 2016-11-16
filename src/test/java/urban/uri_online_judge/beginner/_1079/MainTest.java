package urban.uri_online_judge.beginner._1079;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1079.Main;

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
	public void shouldCalculateWeightedAveragesZero() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).appendln("0.0 0.0 0.0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0.0).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateWeightedAveragesOne() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).appendln("1.0 1.0 1.0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(1.0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateWeightedAveragesSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(3).appendln("6.5 4.3 6.2").appendln("5.1 4.2 8.1").appendln("8.0 9.0 10.0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(5.7).appendln(6.3).appendln(9.3).build();

		assertEquals(expectedOutput, output);
	}

}

package urban.uri_online_judge.beginner._1159;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1159.Main;

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
	public void shouldCalculateHugeIntegers() throws IOException {
		String inputSample = new SampleBuilder().appendln(1000000000).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(5000000020l).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(4).appendln(11).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(40).appendln(80).build();

		assertEquals(expectedOutput, output);
	}

}

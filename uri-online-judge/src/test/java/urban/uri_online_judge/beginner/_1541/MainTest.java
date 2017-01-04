package urban.uri_online_judge.beginner._1541;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleLoader;

public class MainTest {

	private SampleLoader scl = new SampleLoader("beginner", "1541");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleSample1() throws IOException {
		InputStream input = scl.loadAsInputStream("sample1.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sample1.out");

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample2() throws IOException {
		InputStream input = scl.loadAsInputStream("sample2.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sample2.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleLimits() throws IOException {
		InputStream input = scl.loadAsInputStream("sampleLimits.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sampleLimits.out");

		assertEquals(expectedOutput, output);
	}

}

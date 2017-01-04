package urban.uri_online_judge.beginner._1759;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleContentLoader;
import urban.uri_online_judge.beginner._1759.Main;

public class MainTest {

	private SampleContentLoader scl = new SampleContentLoader("beginner", "1759");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}
	
	@Test
	public void shouldHandleLowerLimit() throws IOException {
		InputStream input = scl.loadAsInputStream("sampleLowerLimit.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sampleLowerLimit.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleHigherLimit() throws IOException {
		InputStream input = scl.loadAsInputStream("sampleHigherLimit.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sampleHigherLimit.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleURISample() throws IOException {
		InputStream input = scl.loadAsInputStream("sampleURI.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sampleURI.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleUDebugSample() throws IOException {
		InputStream input = scl.loadAsInputStream("sampleUDebug.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sampleUDebug.out");

		assertEquals(expectedOutput, output);
	}
}

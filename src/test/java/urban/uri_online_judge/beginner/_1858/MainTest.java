package urban.uri_online_judge.beginner._1858;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleContentLoader;
import urban.uri_online_judge.beginner._1858.Main;

public class MainTest {
	
	private SampleContentLoader scl = new SampleContentLoader("beginner", "1858");
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleMinimumInput() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleMinimumInput.in");

		String output1 = Main.main(input1);

		String expectedOutput = "1" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleRepeatingMinimalNumbersInput() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleRepeatingMinimalNumbers.in");

		String output1 = Main.main(input1);

		String expectedOutput = "4" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleURISample() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleURI.in");

		String output1 = Main.main(input1);

		String expectedOutput = "2" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
	}

	@Test
	public void shouldHandleMaximumInput() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleMaximumInput.in");

		String output1 = Main.main(input1);

		String expectedOutput = "9" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
	}
}

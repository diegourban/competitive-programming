package urban.uri_online_judge.beginner._1865;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.SampleContentLoader;
import urban.uri_online_judge.beginner._1865.Main;

public class MainTest {
	
	private SampleContentLoader scl = new SampleContentLoader("beginner", "1865");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldAcceptThor() throws IOException {
		InputStream input1 = new SampleBuilder().appendln(1).append("Thor").buildAsInputStream();

		String output1 = Main.main(input1);

		String expectedOutput = "Y" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleInvalidThorSpelling() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleInvalidThorSpelling.in");
				
		String output1 = Main.main(input1);

		String expectedOutput = scl.loadAsStringFrom("sampleInvalidThorSpelling.out");

		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleURISample() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleURI.in");
				
		String output1 = Main.main(input1);

		String expectedOutput = scl.loadAsStringFrom("sampleURI.out");

		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleUDebugSample() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleUDebug.in");
				
		String output1 = Main.main(input1);

		String expectedOutput = scl.loadAsStringFrom("sampleUDebug.out");

		assertEquals(expectedOutput, output1);
	}
}

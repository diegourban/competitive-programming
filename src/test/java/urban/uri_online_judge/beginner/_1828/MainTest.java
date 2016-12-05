package urban.uri_online_judge.beginner._1828;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleContentLoader;
import urban.uri_online_judge.beginner._1828.Main;

public class MainTest {
	
	private SampleContentLoader scl = new SampleContentLoader("beginner", "1828");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}
	
	@Test
	public void shouldHandleAllDraw() throws IOException {
		InputStream input = scl.loadAsInputStream("sampleAllDraw.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sampleAllDraw.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleAllWin() throws IOException {
		InputStream input = scl.loadAsInputStream("sampleAllWin.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sampleAllWin.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleAllLose() throws IOException {
		InputStream input = scl.loadAsInputStream("sampleAllLose.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sampleAllLose.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSampleURI() throws IOException {
		InputStream input = scl.loadAsInputStream("sampleURI.in");
		
		String output = Main.main(input);
		
		String expectedOutput = scl.loadAsStringFrom("sampleURI.out");
		
		assertEquals(expectedOutput, output);
	}

}

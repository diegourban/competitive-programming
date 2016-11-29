package urban.uri_online_judge.beginner._1155;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;

public class MainTest {

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldCalculateSSequenceSample() throws IOException {
		InputStream input = new SampleBuilder().buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("5.19").build();

		assertEquals(expectedOutput, output);
	}

}

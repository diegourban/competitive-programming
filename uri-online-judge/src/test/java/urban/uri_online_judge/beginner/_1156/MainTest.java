package urban.uri_online_judge.beginner._1156;

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
	public void shouldCalculateSSequence2Sample() throws IOException {
		InputStream input = new SampleBuilder().buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("6.00").build();

		assertEquals(expectedOutput, output);
	}

}

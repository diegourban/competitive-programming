package urban.uri_online_judge.beginner._1151;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;

public class MainTest {

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldPrintSample() throws IOException {
		InputStream input = new SampleBuilder().append(5).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().append(0).append(1).append(1).append(2).appendln(3).build();

		assertEquals(expectedOutput, output);
	}

}

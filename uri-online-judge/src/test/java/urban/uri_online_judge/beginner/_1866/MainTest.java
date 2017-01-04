package urban.uri_online_judge.beginner._1866;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;
import urban.common.SampleContentLoader;

public class MainTest {

	private SampleContentLoader scl = new SampleContentLoader("beginner", "1866");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleSample() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sample.in");

		String output1 = Main.main(input1);

		String expectedOutput = new SampleBuilder().appendln(1).appendln(0).appendln(1).appendln(0).appendln(1)
				.appendln(0).appendln(1).appendln(0).appendln(1).appendln(0).build();

		assertEquals(expectedOutput, output1);
	}

	@Test
	public void shouldHandleURISample() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleURI.in");

		String output1 = Main.main(input1);

		String expectedOutput = new SampleBuilder().appendln(1).appendln(1).appendln(0).build();

		assertEquals(expectedOutput, output1);
	}

}

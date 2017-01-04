package urban.uri_online_judge.beginner._1159;

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
	public void shouldCalculateHugeIntegers() throws IOException {
		InputStream input = new SampleBuilder().appendln(1000000000).append(0).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(5000000020l).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateSample() throws IOException {
		InputStream input = new SampleBuilder().appendln(4).appendln(11).append(0).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(40).appendln(80).build();

		assertEquals(expectedOutput, output);
	}

}

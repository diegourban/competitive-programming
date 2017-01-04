package urban.uri_online_judge.beginner._1005;

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
	public void shouldCalculateAverageOnesPlace() throws IOException {
		InputStream input = new SampleBuilder().appendln("5.0").appendln("7.1").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "MEDIA = 6.43182" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAverageZero() throws IOException {
		InputStream input = new SampleBuilder().appendln("0").appendln("0").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "MEDIA = 0.00000" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAverageTen() throws IOException {
		InputStream input = new SampleBuilder().appendln("10").appendln("10").buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = "MEDIA = 10.00000" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

}

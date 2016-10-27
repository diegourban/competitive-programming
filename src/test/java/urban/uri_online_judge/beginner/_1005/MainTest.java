package urban.uri_online_judge.beginner._1005;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1005.Main;

public class MainTest {
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldCalculateAverageOnesPlace() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("5.0").addLine("7.1").build();

		String output = Main.main(input);
		String expectedOutput = "MEDIA = 6.43182" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAverageZero() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("0").addLine("0").build();

		String output = Main.main(input);
		String expectedOutput = "MEDIA = 0.00000" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAverageTen() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("10").addLine("10").build();

		String output = Main.main(input);
		String expectedOutput = "MEDIA = 10.00000" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

}

package urban.uri_online_judge.beginner._1002;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1002.Main;

public class MainTest {
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldCalculateAreaOfOneDigitR() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("2.00").build();

		String output = Main.main(input);
		String expectedOutput = "A=12.5664" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAreaOfTwoDigitR() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("11.00").build();

		String output = Main.main(input);
		String expectedOutput = "A=380.1324" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAreaOfThreeDigitR() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("100.64").build();

		String output = Main.main(input);
		String expectedOutput = "A=31819.3103" + System.lineSeparator();

		assertEquals(expectedOutput, output);
	}
}

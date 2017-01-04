package urban.uri_online_judge.beginner._1060;

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
	public void shouldNotFindAnyPositive() throws IOException {
		InputStream input = new SampleBuilder().append(-1.1).append(-3).append(-2.9).append(-4).append(-5).append(-0.1)
				.buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 valores positivos").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindOnePositive() throws IOException {
		InputStream input = new SampleBuilder().append(-1.1).append(-3).append(-2.9).append(4).append(-5).append(-0.1)
				.buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 valores positivos").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindFivePositives() throws IOException {
		InputStream input = new SampleBuilder().append(1.1).append(-3).append(2.9).append(4).append(5).append(0.1)
				.buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("5 valores positivos").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindAllPositives() throws IOException {
		InputStream input = new SampleBuilder().append(1.1).append(3).append(2.9).append(4).append(5).append(0.1)
				.buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("6 valores positivos").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldConsiderZeroAsPositive() throws IOException {
		InputStream input = new SampleBuilder().append(1.1).append(-3).append(22.9).append(4).append(-5).append(0)
				.buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("4 valores positivos").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindPositivesSample() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(-5).append(6).append(-3.4).append(4.6).append(12)
				.buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("4 valores positivos").build();

		assertEquals(expectedOutput, output);
	}

}

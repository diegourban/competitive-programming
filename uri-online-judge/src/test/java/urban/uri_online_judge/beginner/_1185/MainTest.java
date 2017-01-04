package urban.uri_online_judge.beginner._1185;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;
import urban.common.SampleLoader;

public class MainTest {

	private SampleLoader scl = new SampleLoader("beginner", "1185");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleSample1() throws IOException {
		InputStream input = scl.loadAsInputStream("sample1.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(2926.0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample2() throws IOException {
		InputStream input = scl.loadAsInputStream("sample2.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(44.3).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample3() throws IOException {
		InputStream input = scl.loadAsInputStream("sample3.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(169.0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample4() throws IOException {
		InputStream input = scl.loadAsInputStream("sample4.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(2.6).build();

		assertEquals(expectedOutput, output);
	}
}

package urban.uri_online_judge.beginner._1184;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;
import urban.common.SampleLoader;

public class MainTest {

	private SampleLoader scl = new SampleLoader("beginner", "1184");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleSample1() throws IOException {
		InputStream input = scl.loadAsInputStream("sample1.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(96.3).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample2() throws IOException {
		InputStream input = scl.loadAsInputStream("sample2.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(6358.0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample3() throws IOException {
		InputStream input = scl.loadAsInputStream("sample3.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(19.0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample4() throws IOException {
		InputStream input = scl.loadAsInputStream("sample4.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(0.3).build();

		assertEquals(expectedOutput, output);
	}

}

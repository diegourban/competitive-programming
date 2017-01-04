package urban.uri_online_judge.beginner._1182;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;
import urban.common.SampleContentLoader;

public class MainTest {
	
	private SampleContentLoader scl = new SampleContentLoader("beginner", "1182");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}
	
	@Test
	public void shouldHandleSample1() throws IOException {
		InputStream input = scl.loadAsInputStream("sample1.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(6.0).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSample2() throws IOException {
		InputStream input = scl.loadAsInputStream("sample2.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(0.5).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateFirstColum() throws IOException {
		InputStream input = scl.loadAsInputStream("sample3.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(-115.7).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateLastColum() throws IOException {
		InputStream input = scl.loadAsInputStream("sample4.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(-350.9).build();

		assertEquals(expectedOutput, output);
	}

}

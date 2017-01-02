package urban.uri_online_judge.beginner._1187;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.SampleContentLoader;
import urban.uri_online_judge.beginner._1187.Main;

public class MainTest {
	
	private SampleContentLoader scl = new SampleContentLoader("beginner", "1187");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleSample1() throws IOException {
		InputStream input = scl.loadAsInputStream("sample1.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(675.0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample2() throws IOException {
		InputStream input = scl.loadAsInputStream("sample2.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(22.5).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample3() throws IOException {
		InputStream input = scl.loadAsInputStream("sample3.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(28.0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample4() throws IOException {
		InputStream input = scl.loadAsInputStream("sample4.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(0.9).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSample5() throws IOException {
		InputStream input = scl.loadAsInputStream("sample5.in");

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(-35.0).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSample6() throws IOException {
		InputStream input = scl.loadAsInputStream("sample6.in");
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln(-1.2).build();
		
		assertEquals(expectedOutput, output);
	}

}

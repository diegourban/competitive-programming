package urban.uri_online_judge.beginner._1043;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;

public class MainTest {

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldCalculateSample1() throws IOException {
		InputStream input = new SampleBuilder().append(6.0).append(4.0).append(2.0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Area = 10.0").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateSample2() throws IOException {
		InputStream input = new SampleBuilder().append(6.0).append(4.0).append(2.1).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Perimetro = 12.1").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateSample3() throws IOException {
		InputStream input = new SampleBuilder().append(6.0).append(4.0).append(10.0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Area = 50.0").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateSample4() throws IOException {
		InputStream input = new SampleBuilder().append(1.0).append(8.0).append(6.0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Area = 27.0").build();

		assertEquals(expectedOutput, output);
	}

}

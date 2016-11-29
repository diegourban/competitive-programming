package urban.uri_online_judge.beginner._1016;

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
	public void shouldCalculate60minutes() throws IOException {
		InputStream input = new SampleBuilder().append(30).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("60 minutos").build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculate220minutes() throws IOException {
		InputStream input = new SampleBuilder().append(110).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("220 minutos").build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculate14minutes() throws IOException {
		InputStream input = new SampleBuilder().append(7).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("14 minutos").build();
		assertEquals(expectedOutput, output);
	}

}

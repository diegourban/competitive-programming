package urban.uri_online_judge.beginner._1017;

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
	public void shouldCalculateLiters1() throws IOException {
		InputStream input = new SampleBuilder().appendln(10).append(85).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("70.833").build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateLiters2() throws IOException {
		InputStream input = new SampleBuilder().appendln(2).append(92).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("15.333").build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateLiters3() throws IOException {
		InputStream input = new SampleBuilder().appendln(22).append(67).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("122.833").build();
		assertEquals(expectedOutput, output);
	}

}

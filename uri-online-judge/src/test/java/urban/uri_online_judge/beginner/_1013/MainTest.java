package urban.uri_online_judge.beginner._1013;

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
	public void shouldCalculate106() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(14).append(106).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("106 eh o maior").build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculate217() throws IOException {
		InputStream input = new SampleBuilder().append(217).append(14).append(6).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("217 eh o maior").build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculate300() throws IOException {
		InputStream input = new SampleBuilder().append(0).append(300).append(1).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("300 eh o maior").build();
		assertEquals(expectedOutput, output);
	}

}

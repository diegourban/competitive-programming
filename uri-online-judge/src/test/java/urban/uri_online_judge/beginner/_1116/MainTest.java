package urban.uri_online_judge.beginner._1116;

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
	public void shouldHandleDivisionByZero() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).append(2).append(0).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("divisao impossivel").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleDivision() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).append(2).append(2).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(1.0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldDivideSample() throws IOException {
		InputStream input = new SampleBuilder().appendln(3).appendln("3 -2").appendln("-8 -0").append("0 8")
				.buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("-1.5").appendln("divisao impossivel").appendln("0.0")
				.build();

		assertEquals(expectedOutput, output);
	}

}

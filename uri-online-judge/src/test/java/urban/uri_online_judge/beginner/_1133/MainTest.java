package urban.uri_online_judge.beginner._1133;

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
	public void shouldHandleAscendingInput() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).append(13).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(7).appendln(8).appendln(12)
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleDescendingInput() throws IOException {
		InputStream input = new SampleBuilder().appendln(13).append(1).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(7).appendln(8).appendln(12)
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSameInput() throws IOException {
		InputStream input = new SampleBuilder().appendln(2).append(2).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldPrintRestOfDivisionSample() throws IOException {
		InputStream input = new SampleBuilder().appendln(10).append(18).buildAsInputStream();

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(12).appendln(13).appendln(17).build();

		assertEquals(expectedOutput, output);
	}

}

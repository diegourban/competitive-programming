package urban.uri_online_judge.beginner._1020;

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
	public void shouldConvert1Day() throws IOException {
		InputStream input = new SampleBuilder().append(1).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 ano(s)").appendln("0 mes(es)").appendln("1 dia(s)")
				.build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldConvert1Month() throws IOException {
		InputStream input = new SampleBuilder().append(1 * 30).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 ano(s)").appendln("1 mes(es)").appendln("0 dia(s)")
				.build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldConvert1Year() throws IOException {
		InputStream input = new SampleBuilder().append(365).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 ano(s)").appendln("0 mes(es)").appendln("0 dia(s)")
				.build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldConvert1Year1Month1Day() throws IOException {
		InputStream input = new SampleBuilder().append(365 + 30 + 1).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 ano(s)").appendln("1 mes(es)").appendln("1 dia(s)")
				.build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldConvertAgeSample1() throws IOException {
		InputStream input = new SampleBuilder().append(400).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 ano(s)").appendln("1 mes(es)").appendln("5 dia(s)")
				.build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldConvertAgeSample2() throws IOException {
		InputStream input = new SampleBuilder().append(800).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("2 ano(s)").appendln("2 mes(es)").appendln("10 dia(s)")
				.build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldConvertAgeSample3() throws IOException {
		InputStream input = new SampleBuilder().append(30).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 ano(s)").appendln("1 mes(es)").appendln("0 dia(s)")
				.build();
		assertEquals(expectedOutput, output);
	}

}

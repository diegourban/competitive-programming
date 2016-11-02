package urban.uri_online_judge.beginner._1042;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;

public class MainTest {

	private InputStreamBuilder inputStream;

	@Before
	public void beforeTest() {
		inputStream = new InputStreamBuilder();
	}

	@After
	public void afterTest() {
		inputStream = null;
	}

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleAlreadySortedValues() throws IOException {
		String inputSample = new SampleBuilder().append(1).append(2).append(3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(1).appendln(2).appendln(3).appendln("").appendln(1)
				.appendln(2).appendln(3).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleReversedOrder() throws IOException {
		String inputSample = new SampleBuilder().append(3).append(2).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(1).appendln(2).appendln(3).appendln("").appendln(3)
				.appendln(2).appendln(1).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleNearlyReversedOrder() throws IOException {
		String inputSample = new SampleBuilder().append(5).append(3).append(4).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(3).appendln(4).appendln(5).appendln("").appendln(5)
				.appendln(3).appendln(4).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNearlySorted() throws IOException {
		String inputSample = new SampleBuilder().append(1).append(3).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(1).appendln(2).appendln(3).appendln("").appendln(1)
				.appendln(3).appendln(2).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNearlyEqualValues() throws IOException {
		String inputSample = new SampleBuilder().append(3).append(2).append(3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(2).appendln(3).appendln(3).appendln("").appendln(3)
				.appendln(2).appendln(3).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldSortSample1() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(21).append(-14).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(-14).appendln(7).appendln(21).appendln("").appendln(7)
				.appendln(21).appendln(-14).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldSortSample2() throws IOException {
		String inputSample = new SampleBuilder().append(-14).append(21).append(7).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln(-14).appendln(7).appendln(21).appendln("").appendln(-14)
				.appendln(21).appendln(7).build();

		assertEquals(expectedOutput, output);
	}

}

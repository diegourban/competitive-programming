package urban.uri_online_judge.beginner._1099;

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
	public void shouldHandlePositiveOddInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(1).append(5).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(3).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandlePositiveEvenInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(4).append(6).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(5).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandlePositiveOddEvenInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(5).append(8).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(7).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandlePositiveEvenOddInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(10).append(12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(11).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNegativeOddInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(-1).append(-5).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(-3).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNegativeEvenInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(-4).append(-6).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(-5).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNegativeOddEvenInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(-5).append(-8).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(-7).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNegativeEvenOddInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(-10).append(-12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(-11).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSameNegativeOdd() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(-3).append(3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSameNegativeEven() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(-4).append(4).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSamePositiveOdd() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(55).append(55).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSamePositiveEven() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(40).append(40).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandlePositiveEvenNegativeOdd() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(2).append(-3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandlePositiveOddNegativeEven() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(8).append(-4).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(12).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNegativeEvenPositiveOdd() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(-4).append(15).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(45).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleNegativeOddPositiveEven() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(-9).append(10).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(9).build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateSample() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(7)//
				.appendln("4 5")//
				.appendln("13 10")//
				.appendln("6 4")//
				.appendln("3 3")//
				.appendln("3 5")//
				.appendln("3 4")//
				.append("3 8").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln(0)//
				.appendln(11)//
				.appendln(5)//
				.appendln(0)//
				.appendln(0)//
				.appendln(0)//
				.appendln(12)//
				.build();

		assertEquals(expectedOutput, output);
	}

}

package urban.uri_online_judge.beginner._1041;

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
	public void shouldFindPointAtOrigin() throws IOException {
		String inputSample = new SampleBuilder().append(0.0).append(0.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Origem").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindPointAtXAxis() throws IOException {
		String inputSample = new SampleBuilder().append(0.0).append(1.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Eixo Y").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindPointAtYAxis() throws IOException {
		String inputSample = new SampleBuilder().append(1.0).append(0.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Eixo X").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindPointAtQuadrant1() throws IOException {
		String inputSample = new SampleBuilder().append(1.0).append(1.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Q1").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindPointAtQuadrant2() throws IOException {
		String inputSample = new SampleBuilder().append(-1.0).append(1.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Q2").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindPointAtQuadrant3() throws IOException {
		String inputSample = new SampleBuilder().append(-1.0).append(-1.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Q3").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindPointAtQuadrant4() throws IOException {
		String inputSample = new SampleBuilder().append(1.0).append(-1.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Q4").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindPointAtSample1() throws IOException {
		String inputSample = new SampleBuilder().append(4.5).append(-2.2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Q4").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindPointAtSample2() throws IOException {
		String inputSample = new SampleBuilder().append(0.1).append(0.1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Q1").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindPointAtSample3() throws IOException {
		String inputSample = new SampleBuilder().append(0.0).append(0.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Origem").build();

		assertEquals(expectedOutput, output);
	}

}

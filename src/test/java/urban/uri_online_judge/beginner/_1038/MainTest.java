package urban.uri_online_judge.beginner._1038;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1038.Main;

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
	public void shouldCalculateSnackCode1() throws IOException {
		String inputSample = new SampleBuilder().append(1).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Total: R$ 4.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSnackCode2() throws IOException {
		String inputSample = new SampleBuilder().append(2).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Total: R$ 4.50").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSnackCode3() throws IOException {
		String inputSample = new SampleBuilder().append(3).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Total: R$ 5.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSnackCode4() throws IOException {
		String inputSample = new SampleBuilder().append(4).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Total: R$ 2.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSnackCode5() throws IOException {
		String inputSample = new SampleBuilder().append(5).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Total: R$ 1.50").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateSnackSample1() throws IOException {
		String inputSample = new SampleBuilder().append(3).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Total: R$ 10.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSnackSample2() throws IOException {
		String inputSample = new SampleBuilder().append(4).append(3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Total: R$ 6.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSnackSample3() throws IOException {
		String inputSample = new SampleBuilder().append(2).append(3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Total: R$ 13.50").build();

		assertEquals(expectedOutput, output);
	}
}

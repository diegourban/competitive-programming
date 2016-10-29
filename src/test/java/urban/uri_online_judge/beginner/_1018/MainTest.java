package urban.uri_online_judge.beginner._1018;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1018.Main;

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
	public void shouldCalculateExactly100Note() throws IOException {
		String inputSample = new SampleBuilder().append(100).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("100").appendln("1 nota(s) de R$ 100,00")
				.appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
				.appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateExactly50Note() throws IOException {
		String inputSample = new SampleBuilder().append(50).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("50").appendln("0 nota(s) de R$ 100,00")
				.appendln("1 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
				.appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateExactly20Note() throws IOException {
		String inputSample = new SampleBuilder().append(20).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("20").appendln("0 nota(s) de R$ 100,00")
				.appendln("0 nota(s) de R$ 50,00").appendln("1 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
				.appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateExactly10Note() throws IOException {
		String inputSample = new SampleBuilder().append(10).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("10").appendln("0 nota(s) de R$ 100,00")
				.appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("1 nota(s) de R$ 10,00")
				.appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateExactly5Note() throws IOException {
		String inputSample = new SampleBuilder().append(5).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("5").appendln("0 nota(s) de R$ 100,00")
				.appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
				.appendln("1 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateExactly2Note() throws IOException {
		String inputSample = new SampleBuilder().append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("2").appendln("0 nota(s) de R$ 100,00")
				.appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
				.appendln("0 nota(s) de R$ 5,00").appendln("1 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateExactly1Note() throws IOException {
		String inputSample = new SampleBuilder().append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1").appendln("0 nota(s) de R$ 100,00")
				.appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
				.appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("1 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateExactly1OfEach() throws IOException {
		String inputSample = new SampleBuilder().append(188).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("188").appendln("1 nota(s) de R$ 100,00")
				.appendln("1 nota(s) de R$ 50,00").appendln("1 nota(s) de R$ 20,00").appendln("1 nota(s) de R$ 10,00")
				.appendln("1 nota(s) de R$ 5,00").appendln("1 nota(s) de R$ 2,00").appendln("1 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateBanknotesSample1() throws IOException {
		String inputSample = new SampleBuilder().append(576).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("576").appendln("5 nota(s) de R$ 100,00")
				.appendln("1 nota(s) de R$ 50,00").appendln("1 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
				.appendln("1 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("1 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBanknotesSample2() throws IOException {
		String inputSample = new SampleBuilder().append(11257).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("11257").appendln("112 nota(s) de R$ 100,00")
				.appendln("1 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
				.appendln("1 nota(s) de R$ 5,00").appendln("1 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBanknotesSample3() throws IOException {
		String inputSample = new SampleBuilder().append(503).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("503").appendln("5 nota(s) de R$ 100,00")
				.appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
				.appendln("0 nota(s) de R$ 5,00").appendln("1 nota(s) de R$ 2,00").appendln("1 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateMinEntry() throws IOException {
		String inputSample = new SampleBuilder().append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0").appendln("0 nota(s) de R$ 100,00")
				.appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
				.appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateMaxEntry() throws IOException {
		String inputSample = new SampleBuilder().append(1000000).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1000000").appendln("10000 nota(s) de R$ 100,00")
				.appendln("0 nota(s) de R$ 50,00").appendln("0 nota(s) de R$ 20,00").appendln("0 nota(s) de R$ 10,00")
				.appendln("0 nota(s) de R$ 5,00").appendln("0 nota(s) de R$ 2,00").appendln("0 nota(s) de R$ 1,00")
				.build();
		assertEquals(expectedOutput, output);
	}
	
}

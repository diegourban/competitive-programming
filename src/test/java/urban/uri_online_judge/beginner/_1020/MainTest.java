package urban.uri_online_judge.beginner._1020;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1020.Main;

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
	public void shouldConvert1Day() throws IOException {
		String inputSample = new SampleBuilder().append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 ano(s)").appendln("0 mes(es)").appendln("1 dia(s)").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvert1Month() throws IOException {
		String inputSample = new SampleBuilder().append(1 * 30).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 ano(s)").appendln("1 mes(es)").appendln("0 dia(s)").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvert1Year() throws IOException {
		String inputSample = new SampleBuilder().append(365).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 ano(s)").appendln("0 mes(es)").appendln("0 dia(s)").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvert1Year1Month1Day() throws IOException {
		String inputSample = new SampleBuilder().append(365 + 30 + 1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 ano(s)").appendln("1 mes(es)").appendln("1 dia(s)").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertAgeSample1() throws IOException {
		String inputSample = new SampleBuilder().append(400).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 ano(s)").appendln("1 mes(es)").appendln("5 dia(s)").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertAgeSample2() throws IOException {
		String inputSample = new SampleBuilder().append(800).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("2 ano(s)").appendln("2 mes(es)").appendln("10 dia(s)").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertAgeSample3() throws IOException {
		String inputSample = new SampleBuilder().append(30).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 ano(s)").appendln("1 mes(es)").appendln("0 dia(s)").build();
		assertEquals(expectedOutput, output);
	}

}

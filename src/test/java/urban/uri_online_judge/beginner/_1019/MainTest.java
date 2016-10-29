package urban.uri_online_judge.beginner._1019;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1019.Main;

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
	public void shouldConvertTime1Second() throws IOException {
		String inputSample = new SampleBuilder().append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0:0:1").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertTime1Minute() throws IOException {
		String inputSample = new SampleBuilder().append(60).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0:1:0").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertTime1Hour() throws IOException {
		String inputSample = new SampleBuilder().append(60*60).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1:0:0").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertTime1Hour1Minute1Second() throws IOException {
		String inputSample = new SampleBuilder().append(60*60+60+1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1:1:1").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertTimeSample1() throws IOException {
		String inputSample = new SampleBuilder().append(556).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0:9:16").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertTimeSample2() throws IOException {
		String inputSample = new SampleBuilder().append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0:0:1").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertTimeSample3() throws IOException {
		String inputSample = new SampleBuilder().append(140153).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("38:55:53").build();
		assertEquals(expectedOutput, output);
	}

}

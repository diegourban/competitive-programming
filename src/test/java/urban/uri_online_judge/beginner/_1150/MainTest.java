package urban.uri_online_judge.beginner._1150;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1150.Main;

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
	public void shouldSkipInvalidInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(5).appendln(4).appendln(0).appendln(-1).appendln(5).appendln(5).appendln(12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(3).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldSumOnlyOnce() throws IOException {
		String inputSample = new SampleBuilder().appendln(5).appendln(6).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(2).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSumsEqualToZ() throws IOException {
		String inputSample = new SampleBuilder().appendln(3).appendln(7).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(3).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldSumExceedingZSample1() throws IOException {
		String inputSample = new SampleBuilder().appendln(3).appendln(1).appendln(20).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(5).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldSumExceedingZSample2() throws IOException {
		String inputSample = new SampleBuilder().appendln(21).appendln(21).appendln(15).appendln(30).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(2).build();
		
		assertEquals(expectedOutput, output);
	}

}

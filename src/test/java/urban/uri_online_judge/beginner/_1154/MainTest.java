package urban.uri_online_judge.beginner._1154;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1154.Main;

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
	public void shouldReadOneAge() throws IOException {
		String inputSample = new SampleBuilder().appendln(28).appendln(-1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("28.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldReadTwoAges() throws IOException {
		String inputSample = new SampleBuilder().appendln(28).appendln(29).appendln(-1).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("28.50").build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldReadThreeAges() throws IOException {
		String inputSample = new SampleBuilder().appendln(28).appendln(29).appendln(30).appendln(-1).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("29.00").build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldStopOnNegativeInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(28).appendln(29).appendln(-221).appendln(30).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("28.50").build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(34).appendln(56).appendln(44).appendln(23).appendln(-2).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("39.25").build();
		
		assertEquals(expectedOutput, output);
	}

}

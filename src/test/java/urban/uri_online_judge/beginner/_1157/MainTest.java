package urban.uri_online_judge.beginner._1157;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1157.Main;

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
	public void shouldCalculateDivisorsOf1() throws IOException {
		String inputSample = new SampleBuilder().append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(1).build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateDivisorsOf2() throws IOException {
		String inputSample = new SampleBuilder().append(2).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(1).appendln(2).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateDivisorsOf3() throws IOException {
		String inputSample = new SampleBuilder().append(3).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(1).appendln(3).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateDivisorsOf5() throws IOException {
		String inputSample = new SampleBuilder().append(5).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(1).appendln(5).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateDivisorsOf100() throws IOException {
		String inputSample = new SampleBuilder().append(100).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(1).appendln(2).appendln(4).appendln(5).appendln(10).appendln(20).appendln(25).appendln(50).appendln(100).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateDivisorsSample() throws IOException {
		String inputSample = new SampleBuilder().append(6).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(1).appendln(2).appendln(3).appendln(6).build();
		
		assertEquals(expectedOutput, output);
	}

}

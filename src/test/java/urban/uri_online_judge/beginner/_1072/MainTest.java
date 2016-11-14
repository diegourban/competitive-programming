package urban.uri_online_judge.beginner._1072;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1072.Main;

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
	public void shouldHandle0Input() throws IOException {
		String inputSample = new SampleBuilder().append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("0 in").appendln("0 out").build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle1InputLowestValue() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(-10000000).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("0 in").appendln("1 out").build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle1InputHighestValue() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(10000000).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("0 in").appendln("1 out").build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle1LowerInterval() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(10).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("1 in").appendln("0 out").build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle1HigherInterval() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(20).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("1 in").appendln("0 out").build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleBothInInterval() throws IOException {
		String inputSample = new SampleBuilder().appendln(2).appendln(10).appendln(20).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("2 in").appendln("0 out").build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleBothOutInterval() throws IOException {
		String inputSample = new SampleBuilder().appendln(2).appendln(9).appendln(21).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("0 in").appendln("2 out").build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateIntervalSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(4).appendln(14).appendln(123).appendln(10).append(-25).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("2 in").appendln("2 out").build();
		
		assertEquals(expectedOutput, output);
	}

}

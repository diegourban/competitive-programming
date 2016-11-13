package urban.uri_online_judge.beginner._1071;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1071.Main;

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
		String inputSample = new SampleBuilder().appendln(1).appendln(11).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(24).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandlePositiveEvenInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(2).appendln(10).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(24).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandlePositiveOddEvenInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(13).appendln(20).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(51).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandlePositiveEvenOddInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(30).appendln(35).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(64).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleNegativeOddInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(-3).appendln(-27).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(-165).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleNegativeEvenInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(-10).appendln(-20).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(-75).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleNegativeOddEvenInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(-7).appendln(-20).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(-84).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleNegativeEvenOddInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln(-2).appendln(-7).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(-8).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSameNegativeOdd() throws IOException {
		String inputSample = new SampleBuilder().appendln(-3).appendln(-3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSameNegativeEven() throws IOException {
		String inputSample = new SampleBuilder().appendln(-4).appendln(-4).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSamePositiveOdd() throws IOException {
		String inputSample = new SampleBuilder().appendln(55).appendln(55).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSamePositiveEven() throws IOException {
		String inputSample = new SampleBuilder().appendln(40).appendln(40).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandlePositiveEvenNegativeOdd() throws IOException {
		String inputSample = new SampleBuilder().appendln(2).appendln(-3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandlePositiveOddNegativeEven() throws IOException {
		String inputSample = new SampleBuilder().appendln(8).appendln(-4).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(12).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleNegativeEvenPositiveOdd() throws IOException {
		String inputSample = new SampleBuilder().appendln(-4).appendln(15).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(45).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleNegativeOddPositiveEven() throws IOException {
		String inputSample = new SampleBuilder().appendln(-9).appendln(10).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(9).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSample1() throws IOException {
		String inputSample = new SampleBuilder().appendln(6).appendln(-5).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(5).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSample2() throws IOException {
		String inputSample = new SampleBuilder().appendln(15).appendln(12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(13).build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSample3() throws IOException {
		String inputSample = new SampleBuilder().appendln(12).appendln(12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(0).build();
		
		assertEquals(expectedOutput, output);
	}
	
}

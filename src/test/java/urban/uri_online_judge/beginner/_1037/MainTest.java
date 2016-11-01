package urban.uri_online_judge.beginner._1037;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1037.Main;

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
	public void shouldConsiderBelowZeroOutOfInterval() throws IOException {
		String inputSample = new SampleBuilder().append(-0.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Fora de intervalo").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConsiderAboveOneHundredOutOfInterval() throws IOException {
		String inputSample = new SampleBuilder().append(100.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Fora de intervalo").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindMinValueOfIntervalBetween0And25() throws IOException {
		String inputSample = new SampleBuilder().append(0.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Intervalo [0,25]").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindMaxValueOfIntervalBetween0And25() throws IOException {
		String inputSample = new SampleBuilder().append(25).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Intervalo [0,25]").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindMinValueOfIntervalBetween25And50() throws IOException {
		String inputSample = new SampleBuilder().append(25.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Intervalo (25,50]").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindMaxValueOfIntervalBetween25And50() throws IOException {
		String inputSample = new SampleBuilder().append(50).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Intervalo (25,50]").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindMinValueOfIntervalBetween50And75() throws IOException {
		String inputSample = new SampleBuilder().append(50.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Intervalo (50,75]").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindMaxValueOfIntervalBetween50And75() throws IOException {
		String inputSample = new SampleBuilder().append(75).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Intervalo (50,75]").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindMinValueOfIntervalBetween75And100() throws IOException {
		String inputSample = new SampleBuilder().append(75.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Intervalo (75,100]").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindMaxValueOfIntervalBetween75And100() throws IOException {
		String inputSample = new SampleBuilder().append(100).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Intervalo (75,100]").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindIntervalSample1() throws IOException {
		String inputSample = new SampleBuilder().append(25.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Intervalo (25,50]").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindIntervalSample2() throws IOException {
		String inputSample = new SampleBuilder().append(25.00).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Intervalo [0,25]").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindIntervalSample3() throws IOException {
		String inputSample = new SampleBuilder().append(100.00).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Intervalo (75,100]").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindIntervalSample4() throws IOException {
		String inputSample = new SampleBuilder().append(-25.02).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Fora de intervalo").build();

		assertEquals(expectedOutput, output);
	}
	

}

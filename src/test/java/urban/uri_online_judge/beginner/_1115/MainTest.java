package urban.uri_online_judge.beginner._1115;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1115.Main;

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
	public void shouldStopOnXZero() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().append("").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldStopOnYZero() throws IOException {
		String inputSample = new SampleBuilder().append(1).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().append("").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldStopOnBothZero() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().append("").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateFirstQuadrant() throws IOException {
		String inputSample = new SampleBuilder().append(1).appendln(1).append(0).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("primeiro").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSecondQuadrant() throws IOException {
		String inputSample = new SampleBuilder().append(-1).appendln(1).append(0).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("segundo").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateThirdQuadrant() throws IOException {
		String inputSample = new SampleBuilder().append(-1).appendln(-1).append(0).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("terceiro").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateFourthQuadrant() throws IOException {
		String inputSample = new SampleBuilder().append(1).appendln(-1).append(0).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("quarto").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSample() throws IOException {
		String inputSample = new SampleBuilder()//
				.append(2).appendln(2)//
				.append(3).appendln(-2)//
				.append(-8).appendln(-1)//
				.append(-7).appendln(1)//
				.append(0).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("primeiro")//
				.appendln("quarto")//
				.appendln("terceiro")//
				.appendln("segundo").build();

		assertEquals(expectedOutput, output);
	}

}

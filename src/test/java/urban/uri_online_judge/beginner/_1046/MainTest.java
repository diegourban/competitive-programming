package urban.uri_online_judge.beginner._1046;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;

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
	public void shouldCalculateGamesWithSameEndAndBeginTime() throws IOException {
		String inputSample = new SampleBuilder().append(2).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 24 HORA(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGamesWithinTheSameDay() throws IOException {
		String inputSample = new SampleBuilder().append(10).append(13).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 3 HORA(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGamesBeginingInOneDayAndEndingAtOther() throws IOException {
		String inputSample = new SampleBuilder().append(10).append(9).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 23 HORA(S)").build();

		assertEquals(expectedOutput, output);
	}
		
	@Test
	public void shouldCalculateGameTimeSample1() throws IOException {
		String inputSample = new SampleBuilder().append(16).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 10 HORA(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameTimeSample2() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 24 HORA(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameTimeSample3() throws IOException {
		String inputSample = new SampleBuilder().append(2).append(16).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 14 HORA(S)").build();

		assertEquals(expectedOutput, output);
	}
}

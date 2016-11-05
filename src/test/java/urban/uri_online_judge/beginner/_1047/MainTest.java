package urban.uri_online_judge.beginner._1047;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1047.Main;

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
	public void shouldCalculateGameOf1Minute() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(1).append(7).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 0 HORA(S) E 1 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameOf59Minute() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(1).append(8).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameOf1Hour() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(1).append(8).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 1 HORA(S) E 0 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameOf1HourAnd1Minute() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(1).append(8).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 1 HORA(S) E 1 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameOf1HourAnd59Minutes() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(1).append(9).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 1 HORA(S) E 59 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameOf2Hours() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(1).append(9).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 2 HORA(S) E 0 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameOf23HoursAnd59Minutes() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(1).append(7).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 23 HORA(S) E 59 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameOf24Hours() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(1).append(7).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameOf59MinuteBetweenTwoDays() throws IOException {
		String inputSample = new SampleBuilder().append(23).append(30).append(0).append(29).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameOf1HourBetweenTwoDays() throws IOException {
		String inputSample = new SampleBuilder().append(23).append(30).append(0).append(30).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 1 HORA(S) E 0 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameOf1HourAnd1MinuteBetweenTwoDays() throws IOException {
		String inputSample = new SampleBuilder().append(23).append(30).append(0).append(31).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 1 HORA(S) E 1 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameTimeSample1() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(8).append(9).append(10).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameTimeSample2() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(7).append(7).append(7).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateGameTimeSample3() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(10).append(8).append(9).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

}

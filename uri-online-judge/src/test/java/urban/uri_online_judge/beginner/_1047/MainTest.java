package urban.uri_online_judge.beginner._1047;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;

public class MainTest {

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldCalculateGameOf1Minute() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(1).append(7).append(2).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 0 HORA(S) E 1 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameOf59Minute() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(1).append(8).append(0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameOf1Hour() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(1).append(8).append(1).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 1 HORA(S) E 0 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameOf1HourAnd1Minute() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(1).append(8).append(2).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 1 HORA(S) E 1 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameOf1HourAnd59Minutes() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(1).append(9).append(0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 1 HORA(S) E 59 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameOf2Hours() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(1).append(9).append(1).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 2 HORA(S) E 0 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameOf23HoursAnd59Minutes() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(1).append(7).append(0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 23 HORA(S) E 59 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameOf24Hours() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(1).append(7).append(1).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameOf59MinuteBetweenTwoDays() throws IOException {
		InputStream input = new SampleBuilder().append(23).append(30).append(0).append(29).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameOf1HourBetweenTwoDays() throws IOException {
		InputStream input = new SampleBuilder().append(23).append(30).append(0).append(30).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 1 HORA(S) E 0 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameOf1HourAnd1MinuteBetweenTwoDays() throws IOException {
		InputStream input = new SampleBuilder().append(23).append(30).append(0).append(31).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 1 HORA(S) E 1 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameTimeSample1() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(8).append(9).append(10).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameTimeSample2() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(7).append(7).append(7).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateGameTimeSample3() throws IOException {
		InputStream input = new SampleBuilder().append(7).append(10).append(8).append(9).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)").build();

		assertEquals(expectedOutput, output);
	}

}

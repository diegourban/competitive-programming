package urban.uri_online_judge.beginner._1179;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;

public class MainTest {

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleAllOdds() throws IOException {
		InputStream input = new SampleBuilder().appendln(-11).appendln(-9).appendln(-7).appendln(-5).appendln(-3)
				.appendln(-1).appendln(1).appendln(3).appendln(5).appendln(7).appendln(9).appendln(11).appendln(13)
				.appendln(15).appendln(17).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("impar[0] = -11").appendln("impar[1] = -9")
				.appendln("impar[2] = -7").appendln("impar[3] = -5").appendln("impar[4] = -3").appendln("impar[0] = -1")
				.appendln("impar[1] = 1").appendln("impar[2] = 3").appendln("impar[3] = 5").appendln("impar[4] = 7")
				.appendln("impar[0] = 9").appendln("impar[1] = 11").appendln("impar[2] = 13").appendln("impar[3] = 15")
				.appendln("impar[4] = 17").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleAllEvens() throws IOException {
		InputStream input = new SampleBuilder().appendln(-12).appendln(-10).appendln(-8).appendln(-6).appendln(-4)
				.appendln(-2).appendln(0).appendln(2).appendln(4).appendln(6).appendln(8).appendln(10).appendln(12)
				.appendln(14).appendln(16).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("par[0] = -12").appendln("par[1] = -10")
				.appendln("par[2] = -8").appendln("par[3] = -6").appendln("par[4] = -4").appendln("par[0] = -2")
				.appendln("par[1] = 0").appendln("par[2] = 2").appendln("par[3] = 4").appendln("par[4] = 6")
				.appendln("par[0] = 8").appendln("par[1] = 10").appendln("par[2] = 12").appendln("par[3] = 14")
				.appendln("par[4] = 16").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample1() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).appendln(3).appendln(4).appendln(-4).appendln(2).appendln(3)
				.appendln(8).appendln(2).appendln(5).appendln(-7).appendln(54).appendln(76).appendln(789).appendln(23)
				.appendln(98).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("par[0] = 4").appendln("par[1] = -4")
				.appendln("par[2] = 2").appendln("par[3] = 8").appendln("par[4] = 2").appendln("impar[0] = 1")
				.appendln("impar[1] = 3").appendln("impar[2] = 3").appendln("impar[3] = 5").appendln("impar[4] = -7")
				.appendln("impar[0] = 789").appendln("impar[1] = 23").appendln("par[0] = 54").appendln("par[1] = 76")
				.appendln("par[2] = 98").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample2() throws IOException {
		InputStream input = new SampleBuilder().appendln(12).appendln(-38).appendln(-11).appendln(61).appendln(-2)
				.appendln(23).appendln(70).appendln(62).appendln(-79).appendln(49).appendln(-64).appendln(-20)
				.appendln(-3).appendln(27).appendln(69).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("par[0] = 12").appendln("par[1] = -38")
				.appendln("par[2] = -2").appendln("par[3] = 70").appendln("par[4] = 62").appendln("impar[0] = -11")
				.appendln("impar[1] = 61").appendln("impar[2] = 23").appendln("impar[3] = -79")
				.appendln("impar[4] = 49").appendln("impar[0] = -3").appendln("impar[1] = 27").appendln("impar[2] = 69")
				.appendln("par[0] = -64").appendln("par[1] = -20").build();

		assertEquals(expectedOutput, output);
	}
}

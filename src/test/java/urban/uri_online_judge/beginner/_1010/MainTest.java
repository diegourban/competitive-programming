package urban.uri_online_judge.beginner._1010;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1010.Main;

public class MainTest {
	
	@Test
	public void shouldCalculateSample1() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("12 1 5.30").addLine("16 2 5.10").build();

		String output = Main.main(input);
		String expectedOutput = "VALOR A PAGAR: R$ 15.50" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSample2() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("13 2 15.30").addLine("161 4 5.20").build();

		String output = Main.main(input);
		String expectedOutput = "VALOR A PAGAR: R$ 51.40" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSample3() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("1 1 15.10").addLine("2 1 15.10").build();

		String output = Main.main(input);
		String expectedOutput = "VALOR A PAGAR: R$ 30.20" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}

}

package urban.uri_online_judge.beginner._1007;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1007.Main;

public class MainTest {
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}
	
	@Test
	public void shouldCalculateDifferenceOfZero() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("0").addLine("0").addLine("0").addLine("0").build();

		String output = Main.main(input);
		String expectedOutput = "DIFERENCA = 0" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateDifferenceOfOne() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("1").addLine("1").addLine("0").addLine("0").build();

		String output = Main.main(input);
		String expectedOutput = "DIFERENCA = 1" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateDifferenceOfTwo() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("3").addLine("1").addLine("0").addLine("0").build();

		String output = Main.main(input);
		String expectedOutput = "DIFERENCA = 3" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateNegativeDifference() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("0").addLine("0").addLine("7").addLine("8").build();

		String output = Main.main(input);
		String expectedOutput = "DIFERENCA = -56" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateTheDifferenceWithNegativeInputs() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("5").addLine("6").addLine("-7").addLine("8").build();

		String output = Main.main(input);
		String expectedOutput = "DIFERENCA = 86" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}

}

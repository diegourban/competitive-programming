package urban.uri_online_judge.beginner._1008;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1008.Main;

public class MainTest {
	
	@Test
	public void shouldCalculateSalary1() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("25").addLine("100").addLine("5.50").build();

		String output = Main.main(input);
		String expectedOutput = "NUMBER = 25" + System.lineSeparator() + "SALARY = U$ 550.00" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSalary2() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("1").addLine("200").addLine("20.50").build();

		String output = Main.main(input);
		String expectedOutput = "NUMBER = 1" + System.lineSeparator() + "SALARY = U$ 4100.00" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSalary3() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("6").addLine("145").addLine("15.55").build();

		String output = Main.main(input);
		String expectedOutput = "NUMBER = 6" + System.lineSeparator() + "SALARY = U$ 2254.75" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}

}

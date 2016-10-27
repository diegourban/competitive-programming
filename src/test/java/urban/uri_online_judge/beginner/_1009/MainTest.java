package urban.uri_online_judge.beginner._1009;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1009.Main;

public class MainTest {
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}
	
	@Test
	public void shouldCalculateSalaryWithoutSales() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("PEDRO").addLine("700.00").addLine("0.00").build();

		String output = Main.main(input);
		String expectedOutput = "TOTAL = R$ 700.00" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSalaryWithSales() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("MANGOJATA").addLine("1700.00").addLine("1230.50").build();

		String output = Main.main(input);
		String expectedOutput = "TOTAL = R$ 1884.58" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSalaryWithMoreSalesThanSalary() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("JOAO").addLine("500.00").addLine("1230.30").build();

		String output = Main.main(input);
		String expectedOutput = "TOTAL = R$ 684.54" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	

}

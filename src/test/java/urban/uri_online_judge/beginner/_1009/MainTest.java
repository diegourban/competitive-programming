package urban.uri_online_judge.beginner._1009;

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
	public void shouldCalculateSalaryWithoutSales() throws IOException {
		String inputSample = new SampleBuilder().appendln("PEDRO").appendln("700.00").appendln("0.00").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "TOTAL = R$ 700.00" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSalaryWithSales() throws IOException {
		String inputSample = new SampleBuilder().appendln("MANGOJATA").appendln("1700.00").appendln("1230.50").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "TOTAL = R$ 1884.58" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateSalaryWithMoreSalesThanSalary() throws IOException {
		String inputSample = new SampleBuilder().appendln("JOAO").appendln("500.00").appendln("1230.30").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "TOTAL = R$ 684.54" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	

}

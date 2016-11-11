package urban.uri_online_judge.beginner._1051;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1051.Main;

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
	public void shouldHandleWithoutTaxesRangeLowerLimit() throws IOException {
		String inputSample = new SampleBuilder().append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Isento").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleWithoutTaxesRange() throws IOException {
		String inputSample = new SampleBuilder().append(1000).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Isento").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleWithoutTaxesRangeUpperLimit() throws IOException {
		String inputSample = new SampleBuilder().append(2000).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Isento").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle8PercentTaxesRangeLowerLimit() throws IOException {
		String inputSample = new SampleBuilder().append(2000.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 0.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle8PercentTaxesRange() throws IOException {
		String inputSample = new SampleBuilder().append(2500).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 40.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle8PercentTaxesRangeUpperLimit() throws IOException {
		String inputSample = new SampleBuilder().append(3000).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 80.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle18PercentTaxesRangeLowerLimit() throws IOException {
		String inputSample = new SampleBuilder().append(3000.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 80.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle18PercentTaxesRange() throws IOException {
		String inputSample = new SampleBuilder().append(3250).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 125.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle18PercentTaxesRangeUpperLimit() throws IOException {
		String inputSample = new SampleBuilder().append(4500).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 350.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle28PercentTaxesRangeLowerLimit() throws IOException {
		String inputSample = new SampleBuilder().append(4500.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 350.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandle28PercentTaxesRange() throws IOException {
		String inputSample = new SampleBuilder().append(10000).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 1890.00").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateTaxesSample1() throws IOException {
		String inputSample = new SampleBuilder().append(3002.00).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 80.36").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateTaxesSample2() throws IOException {
		String inputSample = new SampleBuilder().append(1701.12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Isento").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateTaxesSample3() throws IOException {
		String inputSample = new SampleBuilder().append(4520.00).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 355.60").build();

		assertEquals(expectedOutput, output);
	}

}

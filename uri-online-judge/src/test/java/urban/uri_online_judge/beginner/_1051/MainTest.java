package urban.uri_online_judge.beginner._1051;

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
	public void shouldHandleWithoutTaxesRangeLowerLimit() throws IOException {
		InputStream input = new SampleBuilder().append(0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Isento").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleWithoutTaxesRange() throws IOException {
		InputStream input = new SampleBuilder().append(1000).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Isento").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleWithoutTaxesRangeUpperLimit() throws IOException {
		InputStream input = new SampleBuilder().append(2000).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Isento").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandle8PercentTaxesRangeLowerLimit() throws IOException {
		InputStream input = new SampleBuilder().append(2000.01).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 0.00").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandle8PercentTaxesRange() throws IOException {
		InputStream input = new SampleBuilder().append(2500).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 40.00").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandle8PercentTaxesRangeUpperLimit() throws IOException {
		InputStream input = new SampleBuilder().append(3000).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 80.00").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandle18PercentTaxesRangeLowerLimit() throws IOException {
		InputStream input = new SampleBuilder().append(3000.01).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 80.00").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandle18PercentTaxesRange() throws IOException {
		InputStream input = new SampleBuilder().append(3250).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 125.00").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandle18PercentTaxesRangeUpperLimit() throws IOException {
		InputStream input = new SampleBuilder().append(4500).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 350.00").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandle28PercentTaxesRangeLowerLimit() throws IOException {
		InputStream input = new SampleBuilder().append(4500.01).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 350.00").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandle28PercentTaxesRange() throws IOException {
		InputStream input = new SampleBuilder().append(10000).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 1890.00").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateTaxesSample1() throws IOException {
		InputStream input = new SampleBuilder().append(3002.00).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 80.36").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateTaxesSample2() throws IOException {
		InputStream input = new SampleBuilder().append(1701.12).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Isento").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateTaxesSample3() throws IOException {
		InputStream input = new SampleBuilder().append(4520.00).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("R$ 355.60").build();

		assertEquals(expectedOutput, output);
	}

}

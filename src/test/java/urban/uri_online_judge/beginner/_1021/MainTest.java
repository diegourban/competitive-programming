package urban.uri_online_judge.beginner._1021;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1021.Main;

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
	public void shouldCalculateBanknotesAndCoins1Coin() throws IOException {
		String inputSample = new SampleBuilder().append(1.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("NOTAS:")//
				.appendln("0 nota(s) de R$ 100.00")//
				.appendln("0 nota(s) de R$ 50.00")//
				.appendln("0 nota(s) de R$ 20.00")//
				.appendln("0 nota(s) de R$ 10.00")//
				.appendln("0 nota(s) de R$ 5.00")//
				.appendln("0 nota(s) de R$ 2.00")//
				.appendln("MOEDAS:")//
				.appendln("1 moeda(s) de R$ 1.00")//
				.appendln("0 moeda(s) de R$ 0.50")//
				.appendln("0 moeda(s) de R$ 0.25")//
				.appendln("0 moeda(s) de R$ 0.10")//
				.appendln("0 moeda(s) de R$ 0.05")//
				.appendln("0 moeda(s) de R$ 0.01")//
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBanknotesAndCoins50Coin() throws IOException {
		String inputSample = new SampleBuilder().append(0.5).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("NOTAS:")//
				.appendln("0 nota(s) de R$ 100.00")//
				.appendln("0 nota(s) de R$ 50.00")//
				.appendln("0 nota(s) de R$ 20.00")//
				.appendln("0 nota(s) de R$ 10.00")//
				.appendln("0 nota(s) de R$ 5.00")//
				.appendln("0 nota(s) de R$ 2.00")//
				.appendln("MOEDAS:")//
				.appendln("0 moeda(s) de R$ 1.00")//
				.appendln("1 moeda(s) de R$ 0.50")//
				.appendln("0 moeda(s) de R$ 0.25")//
				.appendln("0 moeda(s) de R$ 0.10")//
				.appendln("0 moeda(s) de R$ 0.05")//
				.appendln("0 moeda(s) de R$ 0.01")//
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBanknotesAndCoins25Coin() throws IOException {
		String inputSample = new SampleBuilder().append(0.25).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("NOTAS:")//
				.appendln("0 nota(s) de R$ 100.00")//
				.appendln("0 nota(s) de R$ 50.00")//
				.appendln("0 nota(s) de R$ 20.00")//
				.appendln("0 nota(s) de R$ 10.00")//
				.appendln("0 nota(s) de R$ 5.00")//
				.appendln("0 nota(s) de R$ 2.00")//
				.appendln("MOEDAS:")//
				.appendln("0 moeda(s) de R$ 1.00")//
				.appendln("0 moeda(s) de R$ 0.50")//
				.appendln("1 moeda(s) de R$ 0.25")//
				.appendln("0 moeda(s) de R$ 0.10")//
				.appendln("0 moeda(s) de R$ 0.05")//
				.appendln("0 moeda(s) de R$ 0.01")//
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBanknotesAndCoins10Coin() throws IOException {
		String inputSample = new SampleBuilder().append(0.10).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("NOTAS:")//
				.appendln("0 nota(s) de R$ 100.00")//
				.appendln("0 nota(s) de R$ 50.00")//
				.appendln("0 nota(s) de R$ 20.00")//
				.appendln("0 nota(s) de R$ 10.00")//
				.appendln("0 nota(s) de R$ 5.00")//
				.appendln("0 nota(s) de R$ 2.00")//
				.appendln("MOEDAS:")//
				.appendln("0 moeda(s) de R$ 1.00")//
				.appendln("0 moeda(s) de R$ 0.50")//
				.appendln("0 moeda(s) de R$ 0.25")//
				.appendln("1 moeda(s) de R$ 0.10")//
				.appendln("0 moeda(s) de R$ 0.05")//
				.appendln("0 moeda(s) de R$ 0.01")//
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBanknotesAndCoins05Coin() throws IOException {
		String inputSample = new SampleBuilder().append(0.05).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("NOTAS:")//
				.appendln("0 nota(s) de R$ 100.00")//
				.appendln("0 nota(s) de R$ 50.00")//
				.appendln("0 nota(s) de R$ 20.00")//
				.appendln("0 nota(s) de R$ 10.00")//
				.appendln("0 nota(s) de R$ 5.00")//
				.appendln("0 nota(s) de R$ 2.00")//
				.appendln("MOEDAS:")//
				.appendln("0 moeda(s) de R$ 1.00")//
				.appendln("0 moeda(s) de R$ 0.50")//
				.appendln("0 moeda(s) de R$ 0.25")//
				.appendln("0 moeda(s) de R$ 0.10")//
				.appendln("1 moeda(s) de R$ 0.05")//
				.appendln("0 moeda(s) de R$ 0.01")//
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBanknotesAndCoins01Coin() throws IOException {
		String inputSample = new SampleBuilder().append(0.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("NOTAS:")//
				.appendln("0 nota(s) de R$ 100.00")//
				.appendln("0 nota(s) de R$ 50.00")//
				.appendln("0 nota(s) de R$ 20.00")//
				.appendln("0 nota(s) de R$ 10.00")//
				.appendln("0 nota(s) de R$ 5.00")//
				.appendln("0 nota(s) de R$ 2.00")//
				.appendln("MOEDAS:")//
				.appendln("0 moeda(s) de R$ 1.00")//
				.appendln("0 moeda(s) de R$ 0.50")//
				.appendln("0 moeda(s) de R$ 0.25")//
				.appendln("0 moeda(s) de R$ 0.10")//
				.appendln("0 moeda(s) de R$ 0.05")//
				.appendln("1 moeda(s) de R$ 0.01")//
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBanknotesAndCoins1CoinOfEach() throws IOException {
		String inputSample = new SampleBuilder().append(1.91).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("NOTAS:")//
				.appendln("0 nota(s) de R$ 100.00")//
				.appendln("0 nota(s) de R$ 50.00")//
				.appendln("0 nota(s) de R$ 20.00")//
				.appendln("0 nota(s) de R$ 10.00")//
				.appendln("0 nota(s) de R$ 5.00")//
				.appendln("0 nota(s) de R$ 2.00")//
				.appendln("MOEDAS:")//
				.appendln("1 moeda(s) de R$ 1.00")//
				.appendln("1 moeda(s) de R$ 0.50")//
				.appendln("1 moeda(s) de R$ 0.25")//
				.appendln("1 moeda(s) de R$ 0.10")//
				.appendln("1 moeda(s) de R$ 0.05")//
				.appendln("1 moeda(s) de R$ 0.01")//
				.build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateBanknotesAndCoinsSample1() throws IOException {
		String inputSample = new SampleBuilder().append(576.73).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("NOTAS:")//
				.appendln("5 nota(s) de R$ 100.00")//
				.appendln("1 nota(s) de R$ 50.00")//
				.appendln("1 nota(s) de R$ 20.00")//
				.appendln("0 nota(s) de R$ 10.00")//
				.appendln("1 nota(s) de R$ 5.00")//
				.appendln("0 nota(s) de R$ 2.00")//
				.appendln("MOEDAS:")//
				.appendln("1 moeda(s) de R$ 1.00")//
				.appendln("1 moeda(s) de R$ 0.50")//
				.appendln("0 moeda(s) de R$ 0.25")//
				.appendln("2 moeda(s) de R$ 0.10")//
				.appendln("0 moeda(s) de R$ 0.05")//
				.appendln("3 moeda(s) de R$ 0.01")//
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBanknotesAndCoinsSample2() throws IOException {
		String inputSample = new SampleBuilder().append(4.00).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("NOTAS:")//
				.appendln("0 nota(s) de R$ 100.00")//
				.appendln("0 nota(s) de R$ 50.00")//
				.appendln("0 nota(s) de R$ 20.00")//
				.appendln("0 nota(s) de R$ 10.00")//
				.appendln("0 nota(s) de R$ 5.00")//
				.appendln("2 nota(s) de R$ 2.00")//
				.appendln("MOEDAS:")//
				.appendln("0 moeda(s) de R$ 1.00")//
				.appendln("0 moeda(s) de R$ 0.50")//
				.appendln("0 moeda(s) de R$ 0.25")//
				.appendln("0 moeda(s) de R$ 0.10")//
				.appendln("0 moeda(s) de R$ 0.05")//
				.appendln("0 moeda(s) de R$ 0.01")//
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateBanknotesAndCoinsSample3() throws IOException {
		String inputSample = new SampleBuilder().append(91.01).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("NOTAS:")//
				.appendln("0 nota(s) de R$ 100.00")//
				.appendln("1 nota(s) de R$ 50.00")//
				.appendln("2 nota(s) de R$ 20.00")//
				.appendln("0 nota(s) de R$ 10.00")//
				.appendln("0 nota(s) de R$ 5.00")//
				.appendln("0 nota(s) de R$ 2.00")//
				.appendln("MOEDAS:")//
				.appendln("1 moeda(s) de R$ 1.00")//
				.appendln("0 moeda(s) de R$ 0.50")//
				.appendln("0 moeda(s) de R$ 0.25")//
				.appendln("0 moeda(s) de R$ 0.10")//
				.appendln("0 moeda(s) de R$ 0.05")//
				.appendln("1 moeda(s) de R$ 0.01")//
				.build();
		assertEquals(expectedOutput, output);
	}

}

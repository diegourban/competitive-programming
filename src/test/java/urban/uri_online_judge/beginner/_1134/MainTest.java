package urban.uri_online_judge.beginner._1134;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1134.Main;

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
	public void shouldHandleTypeAlcool() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(4).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("MUITO OBRIGADO")//
				.appendln("Alcool: 1")//
				.appendln("Gasolina: 0")//
				.appendln("Diesel: 0")//
				.build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleTypeGasolina() throws IOException {
		String inputSample = new SampleBuilder().appendln(2).append(4).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("MUITO OBRIGADO")//
				.appendln("Alcool: 0")//
				.appendln("Gasolina: 1")//
				.appendln("Diesel: 0")//
				.build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleTypeDiesel() throws IOException {
		String inputSample = new SampleBuilder().appendln(3).append(4).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("MUITO OBRIGADO")//
				.appendln("Alcool: 0")//
				.appendln("Gasolina: 0")//
				.appendln("Diesel: 1")//
				.build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleOneOfEachType() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).appendln(2).appendln(3).append(4).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("MUITO OBRIGADO")//
				.appendln("Alcool: 1")//
				.appendln("Gasolina: 1")//
				.appendln("Diesel: 1")//
				.build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldIgnoreTypesOutOfRange() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).appendln(0).appendln(2).appendln(5).appendln(3).appendln(-1).append(4).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("MUITO OBRIGADO")//
				.appendln("Alcool: 1")//
				.appendln("Gasolina: 1")//
				.appendln("Diesel: 1")//
				.build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCountTypesOfFuelSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(8).appendln(1).appendln(7).appendln(2).appendln(2).append(4).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("MUITO OBRIGADO")//
				.appendln("Alcool: 1")//
				.appendln("Gasolina: 2")//
				.appendln("Diesel: 0")//
				.build();
		
		assertEquals(expectedOutput, output);
	}

}

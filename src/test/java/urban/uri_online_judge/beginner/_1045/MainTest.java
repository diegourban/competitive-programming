package urban.uri_online_judge.beginner._1045;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1045.Main;

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
	public void shouldHandleTriangleSample1() throws IOException {
		String inputSample = new SampleBuilder().append(7.0).append(5.0).append(7.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("TRIANGULO ACUTANGULO").appendln("TRIANGULO ISOSCELES").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleTriangleSample2() throws IOException {
		String inputSample = new SampleBuilder().append(6.0).append(6.0).append(10.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("TRIANGULO OBTUSANGULO").appendln("TRIANGULO ISOSCELES").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleTriangleSample3() throws IOException {
		String inputSample = new SampleBuilder().append(6.0).append(6.0).append(6.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("TRIANGULO ACUTANGULO").appendln("TRIANGULO EQUILATERO").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleTriangleSample4() throws IOException {
		String inputSample = new SampleBuilder().append(5.0).append(7.0).append(2.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("NAO FORMA TRIANGULO").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleTriangleSample5() throws IOException {
		String inputSample = new SampleBuilder().append(6.0).append(8.0).append(10.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("TRIANGULO RETANGULO").build();

		assertEquals(expectedOutput, output);
	}
	
	// TODO: need more tests

}

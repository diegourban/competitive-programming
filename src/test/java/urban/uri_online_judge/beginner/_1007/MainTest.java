package urban.uri_online_judge.beginner._1007;

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
	public void shouldCalculateDifferenceOfZero() throws IOException {
		String inputSample = new SampleBuilder().appendln("0").appendln("0").appendln("0").appendln("0").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "DIFERENCA = 0" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateDifferenceOfOne() throws IOException {
		String inputSample = new SampleBuilder().appendln("1").appendln("1").appendln("0").appendln("0").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "DIFERENCA = 1" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateDifferenceOfTwo() throws IOException {
		String inputSample = new SampleBuilder().appendln("3").appendln("1").appendln("0").appendln("0").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "DIFERENCA = 3" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateNegativeDifference() throws IOException {
		String inputSample = new SampleBuilder().appendln("0").appendln("0").appendln("7").appendln("8").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "DIFERENCA = -56" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateTheDifferenceWithNegativeInputs() throws IOException {
		String inputSample = new SampleBuilder().appendln("5").appendln("6").appendln("-7").appendln("8").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "DIFERENCA = 86" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}

}

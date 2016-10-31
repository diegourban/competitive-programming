package urban.uri_online_judge.structure._1022;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.structure._1022.Main;

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
	public void shouldCalculateRationalSampleSum() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(1)//
				.append("1 / 4 + 1 / 4")//
				.build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("8/16 = 1/2")//
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateRationalSampleSubtraction() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(1)//
				.append("3 / 4 - 1 / 4")//
				.build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("8/16 = 1/2")//
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateRationalSampleMultiplication() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(1)//
				.append("1 / 2 * 2 / 5")//
				.build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("2/10 = 1/5")//
				.build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateRationalSampleDivision() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(1)//
				.append("1 / 2 / 1 / 6")//
				.build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder()//
				.appendln("6/2 = 3/1")//
				.build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateRationalSample1() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(4)//
				.appendln("1 / 2 + 3 / 4")//
				.appendln("1 / 2 - 3 / 4")//
				.appendln("2 / 3 * 6 / 6")//
				.append("1 / 2 / 3 / 4")//
				.build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder()//
				.appendln("10/8 = 5/4")//
				.appendln("-2/8 = -1/4")//
				.appendln("12/18 = 2/3")//
				.appendln("4/6 = 2/3")//
				.build();
		assertEquals(expectedOutput, output);
	}

}

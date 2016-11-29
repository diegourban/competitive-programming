package urban.uri_online_judge.beginner._1006;

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
	public void shouldCalculateTheMinimumAverage() throws IOException {
		String inputSample = new SampleBuilder().appendln("0").appendln("0").appendln("0").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "MEDIA = 0.0" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateTheMaximumAverage() throws IOException {
		String inputSample = new SampleBuilder().appendln("10.0").appendln("10.0").appendln("10.0").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "MEDIA = 10.0" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateAverage6Point3() throws IOException {
		String inputSample = new SampleBuilder().appendln("5.0").appendln("6.0").appendln("7.0").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "MEDIA = 6.3" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateAverage9() throws IOException {
		String inputSample = new SampleBuilder().appendln("5.0").appendln("10.0").appendln("10.0").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "MEDIA = 9.0" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateAverage7Point5() throws IOException {
		String inputSample = new SampleBuilder().appendln("10.0").appendln("10.0").appendln("5.0").build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = "MEDIA = 7.5" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}

}

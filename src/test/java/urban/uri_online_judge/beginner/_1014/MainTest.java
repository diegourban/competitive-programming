package urban.uri_online_judge.beginner._1014;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1014.Main;

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
	public void shouldCalculateConsumption1() throws IOException {
		String inputSample = new SampleBuilder().appendln(500).append(35.0).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("14.286 km/l").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateConsumption2() throws IOException {
		String inputSample = new SampleBuilder().appendln(2254).append(124.4).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("18.119 km/l").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateConsumption3() throws IOException {
		String inputSample = new SampleBuilder().appendln(4554).append(464.6).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("9.802 km/l").build();
		assertEquals(expectedOutput, output);
	}

}

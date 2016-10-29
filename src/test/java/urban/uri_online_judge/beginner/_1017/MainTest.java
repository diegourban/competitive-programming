package urban.uri_online_judge.beginner._1017;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1017.Main;

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
	public void shouldCalculateLiters1() throws IOException {
		String inputSample = new SampleBuilder().appendln(10).append(85).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("70.833").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateLiters2() throws IOException {
		String inputSample = new SampleBuilder().appendln(2).append(92).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("15.333").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateLiters3() throws IOException {
		String inputSample = new SampleBuilder().appendln(22).append(67).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("122.833").build();
		assertEquals(expectedOutput, output);
	}

}

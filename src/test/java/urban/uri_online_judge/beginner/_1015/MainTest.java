package urban.uri_online_judge.beginner._1015;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1015.Main;

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
	public void shouldCalculateDistance1() throws IOException {
		String inputSample = new SampleBuilder().append(1.0).appendln(7.0).append(5.0).append(9.0).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("4.4721").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateDistance2() throws IOException {
		String inputSample = new SampleBuilder().append(-2.5).appendln(0.4).append(12.1).append(7.3).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("16.1484").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateDistance3() throws IOException {
		String inputSample = new SampleBuilder().append(2.5).appendln(-0.4).append(-12.2).append(7.0).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("16.4575").build();
		assertEquals(expectedOutput, output);
	}

}

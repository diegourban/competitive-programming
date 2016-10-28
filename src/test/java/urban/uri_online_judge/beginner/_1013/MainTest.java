package urban.uri_online_judge.beginner._1013;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1013.Main;

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
	public void shouldCalculate106() throws IOException {
		String inputSample = new SampleBuilder().append(7).append(14).append(106).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("106 eh o maior").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate217() throws IOException {
		String inputSample = new SampleBuilder().append(217).append(14).append(6).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("217 eh o maior").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate300() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(300).append(1).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		
		String expectedOutput = new SampleBuilder().appendln("300 eh o maior").build();
		assertEquals(expectedOutput, output);
	}

}

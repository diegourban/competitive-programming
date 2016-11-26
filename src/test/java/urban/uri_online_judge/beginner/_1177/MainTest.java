package urban.uri_online_judge.beginner._1177;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1177.Main;

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
	
	private String generateExpectedOutputFor(int t) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for(int i = 0; i < 1000; i++) {
			sb.append("N[").append(i).append("] = ").append(count).append(System.lineSeparator());
			count++;
			if (count == t) {
				count = 0;
			}
		}
		return sb.toString();
	}

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleLowestInput() throws IOException {
		int t = 2;
		String inputSample = new SampleBuilder().appendln(t).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		
		String expectedOutput = generateExpectedOutputFor(t);

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleHighestInput() throws IOException {
		int t = 50;
		String inputSample = new SampleBuilder().appendln(t).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		
		String expectedOutput = generateExpectedOutputFor(t);

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample() throws IOException {
		int t = 3;
		String inputSample = new SampleBuilder().appendln(t).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		
		String expectedOutput = generateExpectedOutputFor(t);

		assertEquals(expectedOutput, output);
	}
}

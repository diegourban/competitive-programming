package urban.uri_online_judge.beginner._1165;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1165.Main;

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
	public void shouldHandle1() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("1 nao eh primo").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleLowestXInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("2 eh primo").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleHighestXInput() throws IOException {
		String inputSample = new SampleBuilder().appendln(1).append(10000000).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("10000000 nao eh primo").build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculatePrimeNumberSample1() throws IOException {
		String inputSample = new SampleBuilder().appendln(3).appendln(8).appendln(51).appendln(7).build();
		InputStream input = this.inputStream.build(inputSample);
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("8 nao eh primo").appendln("51 nao eh primo").appendln("7 eh primo").build();
		
		assertEquals(expectedOutput, output);
	}

}

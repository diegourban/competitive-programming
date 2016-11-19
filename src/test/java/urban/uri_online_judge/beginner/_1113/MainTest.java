package urban.uri_online_judge.beginner._1113;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1113.Main;

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
	public void shouldStopEqualInputs() throws IOException {
		String inputSample = new SampleBuilder().append(2).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().append("").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleAscendingOrder() throws IOException {
		String inputSample = new SampleBuilder().append(0).appendln(1).append(2).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("Crescente").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleDescendingOrder() throws IOException {
		String inputSample = new SampleBuilder().append(1).appendln(0).append(2).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("Decrescente").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSample() throws IOException {
		String inputSample = new SampleBuilder().append(5).appendln(4).append(7).appendln(2).append(3).appendln(8).append(2).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("Decrescente").appendln("Decrescente").appendln("Crescente").build();

		assertEquals(expectedOutput, output);
	}

}

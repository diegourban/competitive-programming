package urban.uri_online_judge.beginner._1066;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1066.Main;

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
	public void shouldFindEvenOddPositiveNegativeSample() throws IOException {
		String inputSample = new SampleBuilder().append(-5).append(0).append(-3).append(-4).append(12).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("3 valor(es) par(es)").appendln("2 valor(es) impar(es)").appendln("1 valor(es) positivo(s)").appendln("3 valor(es) negativo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindEvenOddPositiveNegativeSample2() throws IOException {
		String inputSample = new SampleBuilder().append(-2).append(-1).append(0).append(1).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("3 valor(es) par(es)").appendln("2 valor(es) impar(es)").appendln("2 valor(es) positivo(s)").appendln("2 valor(es) negativo(s)").build();

		assertEquals(expectedOutput, output);
	}

}

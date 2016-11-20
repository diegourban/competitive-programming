package urban.uri_online_judge.beginner._1118;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1118.Main;

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
	public void shouldValidateSample() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(-3.5)//
				.appendln(3.5)//
				.appendln(11.0)//
				.appendln(10.0)//
				.appendln(4)//
				.appendln(1)//
				.appendln(8.0)//
				.appendln(9.0)//
				.appendln(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("nota invalida")//
				.appendln("nota invalida")//
				.appendln("media = 6.75")//
				.appendln("novo calculo (1-sim 2-nao)")//
				.appendln("novo calculo (1-sim 2-nao)")//
				.appendln("media = 8.50")//
				.appendln("novo calculo (1-sim 2-nao)").build();

		assertEquals(expectedOutput, output);
	}

}

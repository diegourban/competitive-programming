package urban.uri_online_judge.beginner._1114;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1114.Main;

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
	public void shouldHandleFirstPasswordValid() throws IOException {
		String inputSample = new SampleBuilder().append(2002).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("Acesso Permitido").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSample() throws IOException {
		String inputSample = new SampleBuilder().appendln(2200).appendln(1020).appendln(2022).appendln(2002).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("Senha Invalida").appendln("Senha Invalida").appendln("Senha Invalida").appendln("Acesso Permitido").build();

		assertEquals(expectedOutput, output);
	}

}

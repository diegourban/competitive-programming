package urban.uri_online_judge.beginner._1059;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1059.Main;

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
	public void shouldPrintEvenNumbersFrom1To100() throws IOException {
		String inputSample = new SampleBuilder().build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sb.append(i).append(System.lineSeparator());
			}
		}

		assertEquals(sb.toString(), output);
	}

}

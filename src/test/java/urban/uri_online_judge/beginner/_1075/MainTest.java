package urban.uri_online_judge.beginner._1075;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1075.Main;

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
	public void shouldHandleHighestInput() throws IOException {
		String inputSample = new SampleBuilder().append(9999).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("2").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateRemainingSample() throws IOException {
		String inputSample = new SampleBuilder().append(13).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 10000; i++) {
			if(i % 13 == 2) {
				sb.append(i).append(System.lineSeparator());
			}
		}
		String expectedOutput = sb.toString();

		assertEquals(expectedOutput, output);
	}

}

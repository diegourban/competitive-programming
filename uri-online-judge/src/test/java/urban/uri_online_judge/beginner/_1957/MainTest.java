package urban.uri_online_judge.beginner._1957;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;
import urban.uri_online_judge.beginner._1957.Main;

public class MainTest {
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldConvertLowestInput() throws IOException {
		InputStream input = new SampleBuilder().append(1).buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("1").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertHighestInput() throws IOException {
		int max = (int) Math.pow(10, 9) * 2;
		InputStream input = new SampleBuilder().append(max).buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("77359400").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertURISamples() throws IOException {
		int[] uriInputSamples = {10, 15, 16, 31, 65535};
		String[] uriOutputSamples = {"A", "F", "10", "1F", "FFFF"};
		for(int i = 0; i < uriInputSamples.length; i++) {
			InputStream input = new SampleBuilder().append(uriInputSamples[i]).buildAsInputStream();
			String output = Main.main(input);
			String expectedOutput = new SampleBuilder().appendln(uriOutputSamples[i]).build();
			assertEquals(expectedOutput, output);
		}
	}

}

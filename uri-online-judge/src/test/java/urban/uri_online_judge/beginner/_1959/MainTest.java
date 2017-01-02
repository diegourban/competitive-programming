package urban.uri_online_judge.beginner._1959;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1959.Main;

public class MainTest {
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldConvertLowestInput() throws IOException {
		InputStream input = new SampleBuilder().append(3).append(1).buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(3).build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldConvertHighestInput() throws IOException {
		InputStream input = new SampleBuilder().append(1000000).append(4000).buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(4000000000l).build();
		assertEquals(expectedOutput, output);
	}
	
}

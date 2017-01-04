package urban.uri_online_judge.beginner._1924;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;
import urban.common.SampleContentLoader;
import urban.uri_online_judge.beginner._1924.Main;

public class MainTest {
	
	private SampleContentLoader scl = new SampleContentLoader("beginner", "1924");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleURISample1() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleURI1.in");

		String output1 = Main.main(input1);

		String expectedOutput = new SampleBuilder().appendln("Ciencia da Computacao").build();

		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleURISample2() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleURI2.in");

		String output1 = Main.main(input1);

		String expectedOutput = new SampleBuilder().appendln("Ciencia da Computacao").build();

		assertEquals(expectedOutput, output1);
	}

}

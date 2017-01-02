package urban.uri_online_judge.beginner._1914;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.SampleContentLoader;
import urban.uri_online_judge.beginner._1914.Main;

public class MainTest {
	
	private SampleContentLoader scl = new SampleContentLoader("beginner", "1914");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleSample() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleURI.in");

		String output1 = Main.main(input1);

		String expectedOutput = new SampleBuilder().appendln("Quico").appendln("Marcus").appendln("Conrado").appendln("Chaves").build();

		assertEquals(expectedOutput, output1);
	}

}

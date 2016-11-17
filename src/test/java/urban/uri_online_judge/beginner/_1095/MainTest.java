package urban.uri_online_judge.beginner._1095;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1095.Main;

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
	public void shouldCalculateSequenceIJ1() throws IOException {
		InputStream input = this.inputStream.build(new SampleBuilder().build());
		
		String output = Main.main(input);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1, j = 60; j >= 0; i+=3, j-=5) {
			sb.append("I=").append(i).append(" ").append("J=").append(j).append(System.lineSeparator());
		}
		
		assertEquals(sb.toString(), output);
	}

}

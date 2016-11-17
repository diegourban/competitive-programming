package urban.uri_online_judge.beginner._1096;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1096.Main;

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
		for(int i = 1; i <= 9; i+=2) {
			sb.append("I=").append(i).append(" ").append("J=").append(7).append(System.lineSeparator());
			sb.append("I=").append(i).append(" ").append("J=").append(6).append(System.lineSeparator());
			sb.append("I=").append(i).append(" ").append("J=").append(5).append(System.lineSeparator());
		}
		
		assertEquals(sb.toString(), output);
	}

}

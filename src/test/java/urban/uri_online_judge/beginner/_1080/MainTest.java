package urban.uri_online_judge.beginner._1080;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;

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
	public void shouldCalculateRandomHighestAndPosition() throws IOException {
		SampleBuilder sb = new SampleBuilder();
		int highest = 0;
		int position = 0;
		for(int i = 1; i <= 100; i++) {
			int n = new Random().nextInt();
			if(n > highest) {
				highest = n;
				position = i;
			}
			if(i == 100) {
				sb.append(n);
			} else {
				sb.appendln(n);
			}
		}
		InputStream input = this.inputStream.build(sb.build());

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln(highest).appendln(position).build();

		assertEquals(expectedOutput, output);
	}

}

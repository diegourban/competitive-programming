package urban.uri_online_judge.beginner._1005;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1005.Main;

public class MainTest {
	
private ByteArrayOutputStream output;
	
	@Before
	public void beforeTest() throws IOException {
		output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
	}
	
	@After
	public void afterTest() throws IOException {
		output.close();
	}
	
	@Test
	public void shouldCalculateAverageOnesPlace() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("5.0").addLine("7.1").build());

		Main.main(null);
		
		assertEquals("MEDIA = 6.43182\r\n", output.toString());
	}
		
	@Test
	public void shouldCalculateAverageZero() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("0").addLine("0").build());

		Main.main(null);
		
		assertEquals("MEDIA = 0.00000\r\n", output.toString());
	}
	
	@Test
	public void shouldCalculateAverageTen() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("10").addLine("10").build());

		Main.main(null);
		
		assertEquals("MEDIA = 10.00000\r\n", output.toString());
	}
		
}


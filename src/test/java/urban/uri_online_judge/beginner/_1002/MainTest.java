package urban.uri_online_judge.beginner._1002;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1002.Main;

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
	public void shouldCalculateAreaOfOneDigitR() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("2.00").build());

		Main.main(null);
		
		assertEquals("A=12.5664\r\n", output.toString());
	}
	
	@Test
	public void shouldCalculateAreaOfTwoDigitR() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("11.00").build());

		Main.main(null);
		
		assertEquals("A=380.1324\r\n", output.toString());
	}
	
	@Test
	public void shouldCalculateAreaOfThreeDigitR() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("100.64").build());

		Main.main(null);
		
		assertEquals("A=31819.3103\r\n", output.toString());
	}
}

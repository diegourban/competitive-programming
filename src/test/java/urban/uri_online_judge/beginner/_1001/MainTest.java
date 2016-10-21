package urban.uri_online_judge.beginner._1001;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1001.Main;

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
	public void shouldAddOnesAndOnes() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("4").addLine("1").build());

		Main.main(null);
		
		assertEquals("X = 5\r\n", output.toString());
	}
	
	@Test
	public void shouldAddOnesAndTens() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("9").addLine("11").build());

		Main.main(null);
		
		assertEquals("X = 20\r\n", output.toString());
	}
}

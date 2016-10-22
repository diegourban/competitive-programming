package urban.uri_online_judge.beginner._1004;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1004.Main;

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
	public void shouldMultiplyOnesPlace() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("4").addLine("1").build());

		Main.main(null);
		
		assertEquals("PROD = 4\r\n", output.toString());
	}
	
	@Test
	public void shouldMultiplyOnesPlaceWithNegative() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("6").addLine("-3").build());

		Main.main(null);
		
		assertEquals("PROD = -18\r\n", output.toString());
	}
	
	@Test
	public void shouldMultiplyTensPlace() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("11").addLine("12").build());

		Main.main(null);
		
		assertEquals("PROD = 132\r\n", output.toString());
	}
	
	@Test
	public void shouldMultiplyTensPlaceWithNegative() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("-10").addLine("25").build());

		Main.main(null);
		
		assertEquals("PROD = -250\r\n", output.toString());
	}
	
	@Test
	public void shouldMultiplyZeros() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("0").addLine("0").build());

		Main.main(null);
		
		assertEquals("PROD = 0\r\n", output.toString());
	}
	
	@Test
	public void shouldMultiplyNegatives() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("-5").addLine("-12").build());

		Main.main(null);
		
		assertEquals("PROD = 60\r\n", output.toString());
	}
	
	@Test
	public void shouldMultiplyToLargePositiveInteger() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("1234").addLine("9876").build());

		Main.main(null);
		
		assertEquals("PROD = 12186984\r\n", output.toString());
	}

}


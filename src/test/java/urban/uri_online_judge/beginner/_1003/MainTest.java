package urban.uri_online_judge.beginner._1003;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1003.Main;

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
	public void shouldAddOnesPlace() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("4").addLine("1").build());

		Main.main(null);
		
		assertEquals("SOMA = 5\r\n", output.toString());
	}
	
	@Test
	public void shouldAddOnesPlaceWithNegative() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("6").addLine("-3").build());

		Main.main(null);
		
		assertEquals("SOMA = 3\r\n", output.toString());
	}
	
	@Test
	public void shouldAddTensPlace() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("11").addLine("12").build());

		Main.main(null);
		
		assertEquals("SOMA = 23\r\n", output.toString());
	}
	
	@Test
	public void shouldAddTensPlaceWithNegative() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("-10").addLine("25").build());

		Main.main(null);
		
		assertEquals("SOMA = 15\r\n", output.toString());
	}
	
	@Test
	public void shouldAddZeros() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("0").addLine("0").build());

		Main.main(null);
		
		assertEquals("SOMA = 0\r\n", output.toString());
	}
	
	@Test
	public void shouldAddNegatives() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("-5").addLine("-12").build());

		Main.main(null);
		
		assertEquals("SOMA = -17\r\n", output.toString());
	}
	
	@Test
	public void shouldAddLargePositiveInteger() throws IOException {
		System.setIn(new InputStreamBuilder().addLine("123456789").addLine("987654321").build());

		Main.main(null);
		
		assertEquals("SOMA = 1111111110\r\n", output.toString());
	}

}

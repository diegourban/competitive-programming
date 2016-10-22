package urban.uri_online_judge.beginner._1001;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;

public class MainTest {
	
	@Test
	public void shouldAddOnesAndOnes() throws IOException {
		InputStream in = new InputStreamBuilder().addLine("4").addLine("1").build();

		String output = Main.main(in);
		String expectedOutput = "X = 5" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldAddOnesAndTens() throws IOException {
		InputStream in = new InputStreamBuilder().addLine("9").addLine("11").build();

		String output = Main.main(in);
		String expectedOutput = "X = 20" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
}

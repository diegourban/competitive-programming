package urban.sphere_online_judge.obi.aero;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class MainTest {
	
	private Scanner inputScanner;
	private ByteArrayOutputStream output;
	
	@Before
	public void beforeTest() {
		inputScanner = new Scanner(System.in);
		output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
	}
	
	@After
	public void afterTest() throws IOException {
		inputScanner.close();
		output.close();
		System.setIn(System.in);
		System.setOut(System.out);
	}
	
	@Test
	public void teste() throws IOException {
		Path inputPath = Paths.get(new File("src/test/resources/obi/aero.in").getAbsolutePath());
		byte[] inputBytes = Files.readAllBytes(inputPath);
		System.setIn(new ByteArrayInputStream(inputBytes));

		Main.main(null);
		
		Path expectedOutputPath = Paths.get(new File("src/test/resources/obi/aero.out").getAbsolutePath());
		byte[] expectedOutputBytes = Files.readAllBytes(expectedOutputPath);
		String expectedOutput = new String(expectedOutputBytes);
		
		assertEquals(expectedOutput, output.toString());
	}


}

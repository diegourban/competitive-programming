package urban.uri_online_judge.beginner._1001;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.URIOnlineJudge;
import urban.uri_online_judge.beginner._1001.Main;

public class MainIT {
	
	private ByteArrayOutputStream output;
	
	@Before
	public void beforeTest() {
		output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
	}
	
	@After
	public void afterTest() throws IOException {
		output.close();
	}
	
	@Test
	public void test() throws IOException {
		Path inputPath = Paths.get(new File(URIOnlineJudge.BEGINNER_INPUT_OUTPUT_RESOURCE_PATH + "1001.in").getAbsolutePath());
		byte[] inputBytes = Files.readAllBytes(inputPath);
		System.setIn(new ByteArrayInputStream(inputBytes));

		Main.main(null);
		
		Path expectedOutputPath = Paths.get(new File(URIOnlineJudge.BEGINNER_INPUT_OUTPUT_RESOURCE_PATH + "1001.out").getAbsolutePath());
		byte[] expectedOutputBytes = Files.readAllBytes(expectedOutputPath);
		String expectedOutput = new String(expectedOutputBytes);
		
		assertEquals(expectedOutput, output.toString());
	}
	
	@Test
	public void test2() throws IOException {
		Path inputPath = Paths.get(new File(URIOnlineJudge.BEGINNER_INPUT_OUTPUT_RESOURCE_PATH + "1001.in").getAbsolutePath());
		byte[] inputBytes = Files.readAllBytes(inputPath);
		System.setIn(new ByteArrayInputStream(inputBytes));

		Main.main(null);
		
		Path expectedOutputPath = Paths.get(new File(URIOnlineJudge.BEGINNER_INPUT_OUTPUT_RESOURCE_PATH + "1001.out").getAbsolutePath());
		byte[] expectedOutputBytes = Files.readAllBytes(expectedOutputPath);
		String expectedOutput = new String(expectedOutputBytes);
		
		assertEquals(expectedOutput, output.toString());
	}
}

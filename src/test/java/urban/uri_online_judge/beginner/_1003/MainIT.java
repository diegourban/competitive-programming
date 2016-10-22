package urban.uri_online_judge.beginner._1003;

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
import urban.uri_online_judge.beginner._1003.Main;

public class MainIT {

	private ByteArrayOutputStream output;
	private static final String FILE = "1003";
	private static final String INPUT_FILE = FILE + ".in";
	private static final String OUTPUT_FILE = FILE + ".out";

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
		Path inputPath = Paths
				.get(new File(URIOnlineJudge.BEGINNER_INPUT_OUTPUT_RESOURCE_PATH + INPUT_FILE).getAbsolutePath());
		byte[] inputBytes = Files.readAllBytes(inputPath);
		System.setIn(new ByteArrayInputStream(inputBytes));

		Main.main(null);

		Path expectedOutputPath = Paths
				.get(new File(URIOnlineJudge.BEGINNER_INPUT_OUTPUT_RESOURCE_PATH + OUTPUT_FILE).getAbsolutePath());
		byte[] expectedOutputBytes = Files.readAllBytes(expectedOutputPath);
		String expectedOutput = new String(expectedOutputBytes);

		assertEquals(expectedOutput, output.toString());
	}

}

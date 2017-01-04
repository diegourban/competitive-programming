package urban.common;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SampleLoader {

	private final String SAMPLES_PATH = "src" + File.separator + "test" + File.separator + "resources";
	private final String PROBLEM_SAMPLES_PATH;

	public SampleLoader(String category, String problemId) {
		PROBLEM_SAMPLES_PATH = SAMPLES_PATH + File.separator + category + File.separator + problemId;
	}

	public String loadAsStringFrom(String sampleFileName) throws IOException {
		String samplePath = PROBLEM_SAMPLES_PATH + File.separator + sampleFileName;
		Path inputPath = Paths.get(new File(samplePath).getAbsolutePath());
		byte[] inputBytes = Files.readAllBytes(inputPath);
		return new String(inputBytes, StandardCharsets.UTF_8);
	}

	public InputStream loadAsInputStream(String sampleFileName) throws IOException {
		String content = loadAsStringFrom(sampleFileName);
		return new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
	}

}

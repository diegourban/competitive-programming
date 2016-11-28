package urban.uri_online_judge;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SampleBuilder {

	private StringBuilder stringBuilder;
	private static final char SPACE_SEPARATOR = ' ';
	private static final String LINE_SEPARATOR = System.lineSeparator();

	public SampleBuilder() {
		this.stringBuilder = new StringBuilder();
	}
	
	public SampleBuilder loadFromFile(String pathname) throws IOException {
		Path inputPath = Paths.get(new File(pathname).getAbsolutePath());
		byte[] inputBytes = Files.readAllBytes(inputPath);
		stringBuilder.append(new String(inputBytes));
		return this;
	}

	public SampleBuilder append(int i) {
		this.stringBuilder.append(i).append(SPACE_SEPARATOR);
		return this;
	}
	
	public SampleBuilder appendln(int i) {
		this.stringBuilder.append(i).append(LINE_SEPARATOR);
		return this;
	}

	public SampleBuilder append(double d) {
		this.stringBuilder.append(d).append(SPACE_SEPARATOR);
		return this;
	}
	
	public SampleBuilder appendln(double d) {
		this.stringBuilder.append(d).append(LINE_SEPARATOR);
		return this;
	}

	public SampleBuilder append(long l) {
		this.stringBuilder.append(l).append(SPACE_SEPARATOR);
		return this;
	}
	
	public SampleBuilder appendln(long l) {
		this.stringBuilder.append(l).append(LINE_SEPARATOR);
		return this;
	}

	public SampleBuilder append(String str) {
		this.stringBuilder.append(str).append(SPACE_SEPARATOR);
		return this;
	}
	
	public SampleBuilder appendln(String str) {
		this.stringBuilder.append(str).append(LINE_SEPARATOR);
		return this;
	}

	public String build() {
		if (!isEmpty() && endsWithSpaceSeparator()) {
			trim();
		}
		return this.stringBuilder.toString();
	}

	private boolean isEmpty() {
		return this.stringBuilder.length() == 0;
	}

	private boolean endsWithSpaceSeparator() {
		return this.stringBuilder.charAt(this.stringBuilder.length() - 1) == SPACE_SEPARATOR;
	}

	private void trim() {
		this.stringBuilder.deleteCharAt(this.stringBuilder.length() - 1);
	}

}

package urban.uri_online_judge;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class InputStreamBuilder {

	private StringBuilder builder;

	public InputStreamBuilder() {
		this.builder = new StringBuilder();
	}

	public InputStreamBuilder addLine(String str) {
		this.builder = this.builder.append(str).append(System.lineSeparator());
		return this;
	}

	public InputStream build() {
		if(this.builder.length() > System.lineSeparator().length()) {
			this.builder = this.builder.deleteCharAt(this.builder.length() - System.lineSeparator().length());
		}
		return new ByteArrayInputStream(this.builder.toString().getBytes(StandardCharsets.UTF_8));
	}

}

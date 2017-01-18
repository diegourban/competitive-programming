package urban.common;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class SampleBuilder {

    private final StringBuilder stringBuilder;
    private static final char SPACE_SEPARATOR = ' ';
    private static final String LINE_SEPARATOR = System.lineSeparator();

    public SampleBuilder() {
        this.stringBuilder = new StringBuilder();
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

    public InputStream buildAsInputStream() {
        return new ByteArrayInputStream(build().getBytes(StandardCharsets.UTF_8));
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

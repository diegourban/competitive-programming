package urban.common.misc;

import java.nio.file.Path;

public class FileInfo {

    private long timeLastEdited;
    private Path path;

    public FileInfo(long timeLastEdited, Path path) {
        this.timeLastEdited = timeLastEdited;
        this.path = path;
    }

    public long getTimeLastEdited() {
        return timeLastEdited;
    }

    public void setTimeLastEdited(long timeLastEdited) {
        this.timeLastEdited = timeLastEdited;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }
}

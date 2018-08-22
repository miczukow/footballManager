package football.league.files;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FilesReader extends AbstractFileReader {

    //    @Override
    public List<String> read(String path) throws IOException {
        return Files.readAllLines(getFile(path).toPath());
    }
}
